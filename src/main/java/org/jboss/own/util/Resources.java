package org.jboss.own.util;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Resources {

    public Resources() {
    }

    @Produces
    @PersistenceContext
    private EntityManager em;

}
