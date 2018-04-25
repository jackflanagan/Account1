package com.qa.interopability;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.repo.RepositoryLayer;

@Path("/entry")
public class EndpointCommands {
	
	@Inject
	private RepositoryLayer rl;
	
	@GET
	@Path("/json")
	@Produces(("application/json"))
	public String AllAccounts() {
		return rl.getAllAccount();
	}
	
	@DELETE
	@Path("/json/{id}")
	@Produces(("application/json"))
	public String DeleteAccounts(Long id) {
		return rl.deleteanAccount(id);
	}
	
	@POST
	@Path("/json")
	@Produces(("application/json"))
	public String createAccounts(String account) {
		return rl.createanAccount(account);
	}
	
	@PUT
	@Path("/json/{id}")
	@Produces(("application/json"))
	public String updateAccounts(Long id,String accountToUpdate) {
		return rl.updateAccount(id, accountToUpdate);
	}
	
	public void setLayer(RepositoryLayer rl) {
		this.rl = rl;
	}
	

}
