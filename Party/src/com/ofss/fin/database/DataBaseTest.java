package com.ofss.fin.database;

import java.util.ArrayList;
import java.util.List;

import com.ofss.fin.entity.Party;

public class DataBaseClass {
private static List<Party> parties= new ArrayList<Party>();

public static List<Party> getParties() {
	return parties
}

public static void setParties(List<Party> profiles) {
	DataBaseClass.parties = profiles;
}

}
