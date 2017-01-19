/*******************************************************************************
 * Copyright (c) 2017 This is my Application, dont us it without my permission
 * Creator and Projekt-Lead
 * Barico
 *
 * Contributors:
 *     PRODYNA AG - All rights reserved
 *******************************************************************************/
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
