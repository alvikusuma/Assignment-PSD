package main;

public class WaterPokemon extends Pokemon implements Sirip {

	public WaterPokemon(int hp, int att, int def, int agl, String name, String type) {
		super(hp, att, def, agl, name, type);
	}

	@Override
	public void Skill() {
		System.out.println("Water Ball");
	}

	@Override
	public void sirip() {
		System.out.println("Jumlah Sirip : " + Sirip.sirip);
	}
}
