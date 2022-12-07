package main;

public class FirePokemon extends Pokemon implements Tail {

	public FirePokemon(int hp, int att, int def, int agl, String name, String type) {
		super(hp, att, def, agl, name, type);
	}

	@Override
	public void Skill() {
		System.out.println("Fire Ball");
	}

	@Override
	public void tails() {
		System.out.println("Tails Count : " + Tail.tail);
	}
}
