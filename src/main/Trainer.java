package main;

import java.util.*;

public class Trainer {
	String name, username, password;
	int lvl;
	ArrayList<Pokemon> myPokelist;

	public Trainer(String name, String username, String Password) {
		this.name = name;
		this.username = username;
		this.password = Password;
		this.lvl = 1;
		myPokelist = new ArrayList<Pokemon>();
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public ArrayList<Pokemon> getMyPokelist() {
		return myPokelist;
	}

	public void setMyPokelist(ArrayList<Pokemon> myPokelist) {
		this.myPokelist = myPokelist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Pokemon> getPokeList() {
		return myPokelist;
	}

	public int AddPokeList(Pokemon pokeList) {
		boolean flag = true;
		if (myPokelist.size() >= 3) {
			return -2;
		}
		if (myPokelist.isEmpty()) {
			this.myPokelist.add(pokeList);
			return 1;
		} else {
			for (Pokemon pokemon : myPokelist) {
				if (pokemon.getName().equals(pokeList.getName())) {
					return -1;
				}
			}
			if (flag) {
				this.myPokelist.add(pokeList);
				return 1;
			}
		}
		return -1;
	}

	public void setPokeList(ArrayList<Pokemon> pokeList) {
		myPokelist = pokeList;
	}

}
