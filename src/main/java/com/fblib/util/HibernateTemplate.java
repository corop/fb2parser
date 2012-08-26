package com.fblib.util;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.search.FullTextQuery;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: asergeev
 * Date: 27.08.12
 * Time: 1:20
 * To change this template use File | Settings | File Templates.
 */
public class HibernateTemplate {
    public Object execute(HibernateCallback action) throws HibernateException {
        Session session = null;
        Transaction tx = null;
        Object object = null;
        try {
            session = HibernateUtil.getSession();
            tx = session.getTransaction();
            tx.begin();
            object = action.execute(session);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null && tx.isActive())
                tx.rollback();
            throw e;
        } finally {
            if (session != null)
                session.close();
        }
        return object;
    }

    public void saveOrUpdate(final Object entity) throws HibernateException {
        execute(new HibernateCallback() {

            @Override
            public Object execute(Session session) throws HibernateException {
                session.saveOrUpdate(entity);
                return null;
            }
        });
    }

    public List find(final String query) throws HibernateException {
        return (List) execute(new HibernateCallback() {

            @Override
            public Object execute(Session session) throws HibernateException {
                return session.createQuery(query).list();
            }
        });
    }

    public List findWithFullText(String query, String field,
                                 final Class entity) throws HibernateException, ParseException {

        QueryParser parser = new QueryParser(field, new StandardAnalyzer());
        final org.apache.lucene.search.Query lucQuery = parser.parse(query);

        return (List) execute(new HibernateCallback() {

            @Override
            public Object execute(Session session) throws HibernateException {
                FullTextSession ftSess = Search.getFullTextSession(session);
                return ftSess.createFullTextQuery(lucQuery, entity).list();
            }
        });

    }

    public List findWithFullTextAndProjection(String query, String field,
                                              final Class entity) throws HibernateException, ParseException {

        QueryParser parser = new QueryParser(field, new StandardAnalyzer());
        final org.apache.lucene.search.Query lucQuery = parser.parse(query);

        return (List) execute(new HibernateCallback() {

            @Override
            public Object execute(Session session) throws HibernateException {
                FullTextSession fTS = Search.getFullTextSession(session);
                FullTextQuery fTQ = fTS.createFullTextQuery(lucQuery, entity);
                fTQ.setProjection("id", "firstname", "birthdate");
                return fTQ.list();
            }
        });

    }
}
