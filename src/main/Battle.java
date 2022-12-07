package main;

import java.util.Scanner;

public class Battle {
	private Scanner scan = new Scanner(System.in);
	private Controller CR = new Controller();

	void clear() {
		for (int i = 0; i < 15 * 2; i++) {
			System.out.println();
		}
	}

	void menu() {
		System.out.println("1. Normal Attack ");
		System.out.println("2. Use Skill ");
		System.out.println("3. Run ");
	}

	public Battle(boolean OnApp, Pokemon poke, Trainer trainer) {
		while (OnApp) {
			int input = -1;
			menu();
			do {
				System.out.print(">> ");
				try {
					input = scan.nextInt();scan.nextLine();			
				}catch(Exception e) {
					scan.nextLine();
					System.out.println("Input must be numeric !");
				}
			} while (input < 1 || input > 3);
			switch (input) {
			case 1:
				CR.Att(poke, trainer);
				return;
			case 2:
				CR.Att(poke, poke.getAtt() * 1.7, trainer);
				return;
			case 3:
				System.out.println("Successful Escape... ");
				scan.nextLine();
				break;
			}
		}
	}

}
