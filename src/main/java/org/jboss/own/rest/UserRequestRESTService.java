/**
 * FacesController controller for JSf 2.2.
 */
package org.jboss.own.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.jboss.own.model.AppUser;
import org.jboss.own.userrepo.UserRepository;

/**
 * @author batas
 *
 */
@Path("/user")
@RequestScoped
public class UserRequestRESTService {

    @Inject
    private UserRepository userRepo;

    @GET
    @Path("/{id:[0-9][0-9]*}")
    @Produces({ "application/xml" })
    public AppUser lookupMemberById(@PathParam("id") final long id) {
        final AppUser user = userRepo.findById(id);
        if (user == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
        return user;
    }

}
