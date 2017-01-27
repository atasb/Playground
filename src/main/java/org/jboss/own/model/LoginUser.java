/**
 * FacesController controller for JSf 2.2.
 */
package org.jboss.own.model;

import javax.persistence.Entity;

/**
 * @author batas
 *
 */
@Entity
public class LoginUser extends AppUser {

    public LoginUser(final Long id, final String name, final String email, final String mode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mode = mode;
    }

    public LoginUser() {
        setMode("Login");
    }
}
