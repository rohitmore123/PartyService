package com.ofss.fin;

import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ofss.fin.entity.Party;
import com.ofss.fin.repository.PartyRepository;

@Path("/PartyList")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PartyService {
	static PartyRepository repo = new PartyRepository();

	@GET
	public List<Party> getPartyList() {
		return repo.getPartyList();
	}

	@GET
	@Path("{partyId}")
	public Party getparty(@PathParam("partyId") Integer PartyId) {
		return repo.getParty(PartyId);
	}
	
	@POST
	public Party addParty(Party party){
		return repo.addParty(party);
	}
	
	@DELETE
	@Path("{partyId}")
	public Party removeParty(@PathParam("partyId") Integer PartyId){
		repo.removeParty(PartyId);
		return null;
	}
	
	@PUT
	@Path("{partyId}")
	public Party updateParty(@PathParam("partyId") Integer partyId,Party party){
		party.setPartyId(partyId);
		return repo.updateParty(party);
	}
}
