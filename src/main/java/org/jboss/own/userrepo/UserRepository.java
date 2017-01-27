/**
 * FacesController controller for JSf 2.2.
 */
package org.jboss.own.userrepo;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.own.model.AppUser;
import org.jboss.own.util.QueryList;

/**
 * @author batas
 *
 */
@SessionScoped
@Named
public class UserRepository implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Inject
    private QueryList query;

    private List<AppUser> dataBaseUserList;

    public void fillDatabaseUserList() {
        dataBaseUserList = query.getDataBaseUser();
    }

    public List<AppUser> getDataBaseUserList() {
        return dataBaseUserList;
    }

    public void setDataBaseUserList(final List<AppUser> dataBaseUserList) {
        this.dataBaseUserList = dataBaseUserList;
    }

    /**
     * @param id
     * @return
     */
    public AppUser findById(final long id) {
        for (final AppUser user : dataBaseUserList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
