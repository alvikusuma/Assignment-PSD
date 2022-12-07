package main;

public abstract class Pokemon {
	int hp, att, def, agl, exp, lvl;
	String name, type;

	public Pokemon(int hp, int att, int def, int agl, String name, String type) {
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.agl = agl;
		this.exp = 0;
		this.lvl = 1;
		this.type = type;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract void Skill();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if(this.hp < 1) {
			this.hp = hp;
		}else {			
			this.hp = hp;
		}
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getAgl() {
		return agl;
	}

	public void setAgl(int agl) {
		this.agl = agl;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

}
