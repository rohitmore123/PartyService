package com.ofss.fin.repository;

import java.util.List;

import com.ofss.fin.database.DataBaseClass;
import com.ofss.fin.entity.Party;

public class PartyRepository {
	public PartyRepository() {
		addParty(new Party("Rohit", "warje", "9895166557"));
		addParty(new Party("Tarun", "Kothrud", "9123456789"));

	}

	public Party addParty(Party newParty) {
		newParty.setPartyId(DataBaseClass.getParties().size() + 1);
		if (DataBaseClass.getParties().add(newParty)) {
			return newParty;
		}
		return null;

	}

	public List<Party> getPartyList() {
		return DataBaseClass.getParties();
	}

	public Party getParty(Integer id) {
		for (Party party : DataBaseClass.getParties()) {
			if (party.getPartyId().equals(id)) {
				return party;
			}
		}
		return null;
	}

	public Boolean removeParty(Integer partyId) {
		// TODO Auto-generated method stub
		for (Party party : DataBaseClass.getParties()) {
			if (party.getPartyId().equals(partyId)) {
				return DataBaseClass.getParties().remove(party);
			}
		}
		return false;
	}

	public Party updateParty(Party updatedParty) {
		for (Party party : DataBaseClass.getParties()) {
			if (party.getPartyId().equals(updatedParty.getPartyId())) {
				DataBaseClass.getParties().remove(party);
				DataBaseClass.getParties().add(updatedParty);
				return updatedParty;
			}
		}
		return null;
	}
}
