package main;

import java.util.*;

public class Main {
	private Scanner scan = new Scanner(System.in);
	private ArrayList<Trainer> TrainerList = new ArrayList<Trainer>();
	private Controller CR = new Controller();
	public ArrayList<Pokemon> PokeList = new ArrayList<Pokemon>();

	void menu() {
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
	}

	void clear() {
		for (int i = 0; i < 15; i++) {
			System.out.println();
		}
	}

	public Main(boolean onApp) {
		PokeList.add(new FirePokemon(13, 11, 5, 0, "Charmander", "Fire"));
		PokeList.add(new WaterPokemon(15, 5, 3, 9, "Bulbasaur", "Water"));
		PokeList.add(new WaterPokemon(18, 2, 15, 4, "Squirtle", "Water"));
		PokeList.add(new WaterPokemon(17, 5, 10, 3, "Caterpie", "Water"));
		PokeList.add(new FirePokemon(21, 7, 4, 2, "Chikorita", "Fire"));
		while (onApp) {
			int input = -1;
			clear();
			menu();
			do {
				System.out.print("Choose One >> ");
				try {
					input = scan.nextInt();
					scan.nextLine();
				} catch (Exception e) {
					scan.nextLine();
					System.out.println();
					System.out.println("Input must be numeric !");
					continue;
				}
			} while (input > 3 || input < 1);
			switch (input) {
			case 1:
				CR.loginTrainer(TrainerList, PokeList);
				break;
			case 2:
				CR.registerTrainer(TrainerList);
				break;
			case 3:
				onApp = !onApp;
				break;
			default:
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main(true);
	}

	public ArrayList<Pokemon> getList() {
		return PokeList;
	}
}
