package com.fblib.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created with IntelliJ IDEA.
 * User: asergeev
 * Date: 27.08.12
 * Time: 1:21
 * To change this template use File | Settings | File Templates.
 */
public interface HibernateCallback {
    public Object execute(Session session) throws HibernateException;
}
