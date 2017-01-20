/**
 * FacesController controller for JSf 2.2.
 */
package org.jboss.own;

import org.jboss.own.test.AppUser;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author batas
 *
 */
public class AppUserTest {

    @Test
    public void test() {
        final AppUser appUser = new AppUser("John");
        Assert.assertTrue(appUser.getName() != null);
    }
}
