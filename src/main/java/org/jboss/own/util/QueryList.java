/**
 * S * FacesController controller for JSf 2.2.
 */
package org.jboss.own.util;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.jboss.own.model.AppUser;
import org.jboss.own.model.LoginUser;

/**
 * @author batas
 *
 */
@Stateless
public class QueryList {

    @Inject
    private EntityManager entityManager;

    public List<AppUser> getDataBaseUser() {
        final Query query = entityManager.createQuery(
                "SELECT NEW org.jboss.own.model.LoginUser(id,name, email, mode) FROM LoginUser", LoginUser.class);
        return query.getResultList();
    }
}
