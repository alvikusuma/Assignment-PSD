package main;

import java.util.*;
import java.time.*;

public class MainLogin {
	Scanner scan = new Scanner(System.in);
	LocalDate LocalTime = LocalDate.now();
	private Controller CR = new Controller();

	void menu(Trainer trainer) {
		System.out.println("Welcome, " + trainer.getName());
		System.out.println("Logined at : " + LocalTime);
		System.out.println("=======================");
		System.out.println("Chose your menu ");
		System.out.println("1. Add Pokemon");
		System.out.println("2. Train  Pokemon");
		System.out.println("3. View Pokemon");
		System.out.println("4. Heal Pokemon");
		System.out.println("5. Log out !");
	}

	void clear() {
		for (int i = 0; i < 15; i++) {
			System.out.println();
		}
	}

	public MainLogin(boolean OnApp, Trainer trainer, ArrayList<Pokemon> list) {
		while (OnApp) {
			int input = -1;
			clear();
			menu(trainer);
			do {
				System.out.print("Choose one >> ");
				try {
					input = scan.nextInt();
					scan.nextLine();
				} catch (Exception e) {
					scan.nextLine();
					System.out.print("Input must be numeric ! ");
				}
			} while (input > 5 || input < 1);
			switch (input) {
			case 1:
				CR.AddPokemon(list, trainer);
				break;
			case 2:
				CR.trainPokemon(trainer, list);
				break;
			case 3:
				CR.viewMyPokemon(trainer);
				break;
			case 4:
				CR.HealPokemon(trainer);
				break;
			case 5:
				OnApp = !OnApp;
				return;
			default:
			}
		}
	}

	public void main(String args[]) {
		new Main(true);
	}
}
