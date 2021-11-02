import java.lang.Thread;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Arrays;

class Main {
	// Reset
	public static final String RESET = "\033[0m"; // Text Reset

	// Underline
	public static final String BLACK_UNDERLINED = "\033[4;30m"; // BLACK
	public static final String RED_UNDERLINED = "\033[4;31m"; // RED
	public static final String GREEN_UNDERLINED = "\033[4;32m"; // GREEN
	public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
	public static final String BLUE_UNDERLINED = "\033[4;34m"; // BLUE
	public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
	public static final String CYAN_UNDERLINED = "\033[4;36m"; // CYAN
	public static final String WHITE_UNDERLINED = "\033[4;37m"; // WHITE

	// High Intensity
	public static final String BLACK_BRIGHT = "\033[0;90m"; // BLACK
	public static final String RED_BRIGHT = "\033[0;91m"; // RED
	public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
	public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
	public static final String BLUE_BRIGHT = "\033[0;94m"; // BLUE
	public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
	public static final String CYAN_BRIGHT = "\033[0;96m"; // CYAN
	public static final String WHITE_BRIGHT = "\033[0;97m"; // WHITE

	// Bold High Intensity
	public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
	public static final String RED_BOLD_BRIGHT = "\033[1;91m"; // RED
	public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
	public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
	public static final String BLUE_BOLD_BRIGHT = "\033[1;94m"; // BLUE
	public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
	public static final String CYAN_BOLD_BRIGHT = "\033[1;96m"; // CYAN
	public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

	// High Intensity backgrounds
	public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
	public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
	public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
	public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
	public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
	public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
	public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m"; // CYAN
	public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // WHITE

	private static final Hashtable<String, Long> tasks = new Hashtable<String, Long>();

	/**
	 * Start the Watch for a Task with Id
	 *
	 * @param id
	 */
	public static void start(String taskId) {
		tasks.put(taskId, new Long(System.currentTimeMillis()));
	}

	/**
	 * Stop the watch
	 *
	 * @param id
	 * @return
	 */
	public static long stop(String taskId) {
		return System.currentTimeMillis() - ((Long) tasks.remove(taskId)).longValue();
	}

	public static void strawbShort(boolean hasBowl, boolean hasCakePan, String[] inBowl) throws InterruptedException {
		String uInput;
		String[] fridgeInventory = { "Eggs", "Whole milk", "Unsalted butter" };
		String[] pantryInventory = { "Cake flour", "Sugar" };
		String[] cupboardInventory = { "Bowl", "Cake pan" };
		Scanner input = new Scanner(System.in);

		System.out.print("\033[H\033[2J");
		Main.start("stopwatch");
		System.out.println("Press [0] to go back");
		System.out.println("");
		System.out.println("======================================================================");
		System.out.println("|                                                                     |");
		System.out.println("| " + Main.CYAN_BRIGHT
				+ "[1] Fridge                                                          " + Main.RESET + "|");
		System.out.println("| " + Main.BLUE_BRIGHT + "[2] Freezer                     " + Main.RED_BRIGHT
				+ "[3] Oven                            " + Main.RESET + "|");
		System.out.println("|                                               " + Main.PURPLE_BRIGHT
				+ "[4] Cupboard          " + Main.RESET + "|");
		System.out.println("|                                                                     |");
		System.out.println("|                  " + Main.YELLOW_BRIGHT
				+ "[5] Pantry                                         " + Main.RESET + "|");
		System.out.println("|                                                                     |");
		System.out.println("|                                " + Main.WHITE_BRIGHT
				+ "[6] Sink                             " + Main.RESET + "|");
		System.out.println("|                                                         " + Main.GREEN_BRIGHT
				+ "[7] Garbage " + Main.RESET + "|");
		System.out.println("|=====================================================================|");
		System.out.println();
		System.out.println("You are in the kitchen.");
		System.out.println("Where would you like to go first? Press the number that corresponds with the location.");

		uInput = input.nextLine();
		if (uInput.equals("0")) {
			Main.start();
		} else if (uInput.equals("1")) {
			System.out.print("\033[H\033[2J");
			System.out.println("[0] Back to kitchen");
			System.out.println();
			System.out.println("==============");
			for (int i = 0; i < fridgeInventory.length; i++) {
				System.out.println("[" + (i + 1) + "] " + fridgeInventory[i]);
			}
			System.out.println("==============");
			System.out.println("You are at the fridge.");
			if (hasBowl == false) {
				System.out.println(Main.RED_BRIGHT + "Hint: you need something to put your ingredients in.");
				System.out.println(Main.RESET + "Press any key to go back to the kitchen.");
				uInput = input.nextLine();
				Main.strawbShort(hasBowl, hasCakePan, inBowl);
			} else {
				while (true) {
					System.out.println(
							"Which ingredient would you like to put in your bowl? Press the number that corresponds with the ingredient. " + Main.GREEN_BRIGHT + "Press [D] when done." + Main.RESET);
					uInput = input.nextLine();
					if (uInput.equals("0")) {
						Main.strawbShort(hasBowl, hasCakePan, inBowl);
					} else if (uInput.equals("1")) {
						System.out.println("Eggs ... in the bowl!");
						for (int i = 0; i < inBowl.length; i++) {
							if (inBowl[i] == null) {
								inBowl[i] = "Eggs";
								break;
							}
						}
					} else if (uInput.equals("2")) {
						System.out.println("Whole milk... in the bowl!");
						for (int i = 0; i < inBowl.length; i++) {
							if (inBowl[i] == null) {
								inBowl[i] = "Whole milk";
								break;
							}
						}
					} else if (uInput.equals("3")) {
						System.out.println("Unsalted butter.. in the bowl!");
						for (int i = 0; i < inBowl.length; i++) {
							if (inBowl[i] == null) {
								inBowl[i] = "Unsalted butter";
								break;
							}
						}
					} else if (uInput.equals("d")) {
						System.out.print("Mixing in progress.");
						Thread.sleep(500);
						System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
						System.out.print("Mixing in progress..");
						Thread.sleep(500);
						System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
						System.out.print("Mixing in progress...");
						Thread.sleep(500);
						System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
						System.out.print("Mixing complete!     ");
						Thread.sleep(1000);
						Main.strawbShort(hasBowl, hasCakePan, inBowl);
					} else {
						System.out.println(
								"You put nothing in your bowl. Please check your reading abilities and enter a valid option.");
					}
				}
			}
		} else if (uInput.equals("2")) {
			System.out.print("\033[H\033[2J");
			System.out.println("You are at the freezer.");
			System.out.println("There's nothing in here that you need.");
			System.out.println("Press any key to go back.");
			uInput = input.nextLine();
			Main.strawbShort(hasBowl, hasCakePan, inBowl);

		} else if (uInput.equals("3")) {
			System.out.print("\033[H\033[2J");
			System.out.println("You are at the oven.");
			if (hasCakePan == false) {
				System.out.println(Main.RED_BRIGHT
						+ "Hint: you need something to bake your cake in. Press any key to go back." + Main.RESET);
				uInput = input.nextLine();
				Main.strawbShort(hasBowl, hasCakePan, inBowl);
				;
			} else {
				while (true) {
					System.out.println("Would you like to put your cake in the oven? Press [Y] if yes or [N] if no.");
					while (true) {
						uInput = input.nextLine();
						if (uInput.equals("y")) {
							System.out.println("Cake... in the oven!");
							Thread.sleep(1000);
							System.out.println("20min left");
							Thread.sleep(1000);
							System.out.println("10min left");
							Thread.sleep(1000);
							System.out.println("5min left");
							Thread.sleep(1000);
							System.out.println("1min left");
							Thread.sleep(1000);
							System.out.println(
									"Congrats! Your cake has succesfully finished baking. Now it's time to decorate :P");
							Thread.sleep(1500);
							Main.decorate(inBowl);
		
						} else if (uInput.equals("n")) {
							System.out.println("Okay then. Press any key to go back");
							uInput = input.nextLine();
							Main.strawbShort(hasBowl, hasCakePan, inBowl);
						}
						else{
							System.out.println("Please check your reading abilities and enter a valid option.");
						}
					}
				}
			}
		} else if (uInput.equals("4")) {
			System.out.print("\033[H\033[2J");
			System.out.println("[0] Back to kitchen");
			System.out.println();
			System.out.println("==============");
			for (int i = 0; i < cupboardInventory.length; i++) {
				System.out.println("[" + (i + 1) + "] " + cupboardInventory[i]);
			}
			System.out.println("==============");
			System.out.println("You are at the cupboard.");
			while (true) {
				System.out.println(
						"Which container would you like to use first? Press the number that corresponds with the container.");
				while (true) {
					uInput = input.nextLine();
					if (uInput.equals("0")) {
						Main.strawbShort(hasBowl, hasCakePan, inBowl);
					} else if (uInput.equals("1")) {
						hasBowl = true;
						System.out.println("Bowl acquired!");
						Thread.sleep(1000);
						Main.strawbShort(hasBowl, hasCakePan, inBowl);
					} else if (uInput.equals("2")) {
						if (hasBowl == true) {
							System.out.println("Cake pan acquired!");
							hasCakePan = true;
							System.out.println();
							while (true) {
								System.out.println(
										"Would you like to pour your cake batter into the cake pan? Press [Y] if yes or [N] if no.");
								uInput = input.nextLine();
								if (uInput.equals("y")) {
									System.out.print("Pouring in progress.");
									Thread.sleep(500);
									System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
									System.out.print("Pouring in progress..");
									Thread.sleep(500);
									System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
									System.out.print("Pouring in progress...");
									Thread.sleep(500);
									System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
									System.out.println("Pouring complete!     ");
									Thread.sleep(1000);
									System.out.println(
											"You now have a cake pan filled with batter and ready to be baked!");
									System.out.println("Press any key to go back to the kitchen");
									uInput = input.nextLine();
									Main.strawbShort(hasBowl, hasCakePan, inBowl);
								} else if (uInput.equals("n")) {
									System.out.println("Okay then. Press any key to go back");
									uInput = input.nextLine();
									Main.strawbShort(hasBowl, hasCakePan, inBowl);
								} else {
									System.out.println("Please check your reading abilities and enter a valid option.");
								}
							}
						} else {
							System.out.println("Hmm, seems like you don't have anything to put in the cake pan yet.");
							break;
						}
					} else {
						System.out.println(
								"You got nothing. Please check your reading abilities and enter a valid option.");
					}
				}

			}
		} else if (uInput.equals("5")) {
			System.out.print("\033[H\033[2J");
			System.out.println("[0] Back to kitchen");
			System.out.println();
			System.out.println("==============");
			for (int i = 0; i < pantryInventory.length; i++) {
				System.out.println("[" + (i + 1) + "] " + pantryInventory[i]);
			}
			System.out.println("==============");
			System.out.println("You are in the pantry.");
			if (hasBowl == false) {
				System.out.println(Main.RED_BRIGHT + "Hint: you need something to put your ingredients in.");
				System.out.println(Main.RESET + "Press any key to go back to the kitchen.");
				uInput = input.nextLine();
				Main.strawbShort(hasBowl, hasCakePan, inBowl);
				;
			} else {
				System.out.println(
						"Which ingredient would you like to put in your bowl? Press the number that corresponds with the ingredient. "+ Main.GREEN_BRIGHT + "Press [D] when done." + Main.RESET);
				while (true) {
					uInput = input.nextLine();
					if (uInput.equals("0")) {
						Main.strawbShort(hasBowl, hasCakePan, inBowl);
					} else if (uInput.equals("d")) {
						System.out.print("Mixing in progress.");
						Thread.sleep(500);
						System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
						System.out.print("Mixing in progress..");
						Thread.sleep(500);
						System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
						System.out.print("Mixing in progress...");
						Thread.sleep(500);
						System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
						System.out.print("Mixing complete!     ");
						Thread.sleep(2000);
						Main.strawbShort(hasBowl, hasCakePan, inBowl);
					} else if (uInput.equals("1")) {
						System.out.println("Flour... in the bowl!");
						for (int i = 0; i < inBowl.length; i++) {
							if (inBowl[i] == null) {
								inBowl[i] = "Flour";
								break;
							}
						}
					} else if (uInput.equals("2")) {
						System.out.println("Sugar... in the bowl!");
						for (int i = 0; i < inBowl.length; i++) {
							if (inBowl[i] == null) {
								inBowl[i] = "Sugar";
								break;
							}
						}
					} else {
						System.out.println(
								"You put nothing in your bowl. Please check your reading abilities and enter a valid option.");
					}
				}

			}

		} else if (uInput.equals("6")) {
			System.out.print("\033[H\033[2J");
			System.out.println("You are at the sink.");
			while (true) {
				System.out.println("Would you like some water? Press [Y] if yes or [N] if no.");
				while (true) {
					uInput = input.nextLine();
					if (uInput.equals("y")) {
						System.out.println("What would you like to do with the water?");
						System.out.println("[1] Pour it into the bowl");
						System.out.println("[2] Drink it because hydrate or diedrate");
						System.out.println("[3] Water the plant over there");
						uInput = input.nextLine();
						if (uInput.equals("1")) {
							System.out.println("Water... in the bowl!");
							for (int i = 0; i < inBowl.length; i++) {
								if (inBowl[i] == null) {
									inBowl[i] = "Water";
									break;
								}
							}
							Thread.sleep(1000);
							break;
						} else if (uInput.equals("2")) {
							System.out.println("Ahh, that was some hydrating dihydrogen monoxide.");
							Thread.sleep(1000);
							break;
						} else if (uInput.equals("3")) {
							System.out.println("You water the plant and...");
							Thread.sleep(2000);
							System.out.println(
									"The plant grows into a giant venus flytrap, spreading across the kitchen floor and breaking through the ceiling.");
							Thread.sleep(2000);
							System.out.println("\"Mmm this growth spurt has made me really hungry\"");
							Thread.sleep(2000);
							System.out.println("The plant looks down and sees...");
							Thread.sleep(2000);
							System.out.println("You! A mere human being.");
							Thread.sleep(2000);
							System.out.println("\"What a kind offering from the gods, don't mind if I do\"");
							Thread.sleep(2000);
							System.out.print("\033[H\033[2J");
							System.out.println(
									"Unfortunately, you were eaten by your house plant. All game progress has been lost. Moral of the story: Never water your plants. Press any key to go back to the main menu.");
							uInput = input.nextLine();
							Main.start();
						} else {
							System.out.println(
									"You did nothing with the water. Please check your reading abilities and enter a valid option.");
						}
					} else if (uInput.equals("n")) {
						System.out.println("Okay then.");
						Thread.sleep(1000);
						Main.strawbShort(hasBowl, hasCakePan, inBowl);
					} else {
						System.out.println(
								"You got nothing. Please check your reading abilities and enter a valid option.");
					}
				}
			}
		} else if (uInput.equals("7")) {
			while (true) {
				System.out.println("\033[H\033[2J");
				System.out.println("==============");
				for (int i = 0; i < inBowl.length; i++) {
					if (inBowl[i] != null) {
						System.out.println("[" + (i + 1) + "] " + inBowl[i]);
					}
				}
				System.out.println("==============");
				System.out.println("You are at the garbage");
				System.out.println("PSA don't waste food.");
				System.out.println("What item would you like to throw away? Enter the corresponding number. "+ Main.GREEN_BRIGHT + "Press [D] when done." + Main.RESET);
				uInput = input.nextLine();
				if (uInput.equals("d")) {
					break;
				}
				try {
					inBowl[Integer.parseInt(uInput) - 1] = null;
				} catch (Exception e) {
					System.out.println(
							"You threw away nothing. Please check your reading abilities and enter a valid option.");
				}
			}
			Main.strawbShort(hasBowl, hasCakePan, inBowl);
		} else {
			System.out.println("Please check your reading abilities and enter a valid option.");
			Thread.sleep(2000);
			Main.strawbShort(hasBowl, hasCakePan, inBowl);
			;
		}
		for (int i = 0; i < inBowl.length; i++) {
			System.out.print(inBowl[i]);
		}
	}

	public static void decorate(String[] bowlStuff) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("\033[H\033[2J");
		System.out.println("==============");
		System.out.println("[1] Whipped heavy cream");
		System.out.println("[2] Strawberries");
		System.out.println("==============");
		System.out.println(" You are at the decorating station.");
		while (true) {
			System.out.println(
					"What would you like to put on your cake? Press the number that corresponds with the ingredient. "+ Main.GREEN_BRIGHT + "Press [D] when done." + Main.RESET);
			String uInput = input.nextLine();
			if (uInput.equals("d")) {
				Main.results(bowlStuff);
			} else if (uInput.equals("1")) {
				System.out.println("Cake has been perfectly coated in whipped heavy cream");
			} else if (uInput.equals("2")) {
				System.out.println("Boop, boop, boop, strawberries have been placed on the cake");
			} else {
				System.out.println(
						"You put nothing on your cake. Please check your reading abilities and enter a valid option.");
			}
		}
	}

	public static void results(String[] bowlStuff) throws InterruptedException {
		int score = 0, total = 0;
		if(Arrays.asList(bowlStuff).contains("Eggs")) {
			score=score+10;
		}
		if(Arrays.asList(bowlStuff).contains("Whole milk")) {
			score=score+10;
		}
		if(Arrays.asList(bowlStuff).contains("Unsalted butter")) {
			score=score+10;
		}
		if(Arrays.asList(bowlStuff).contains("Cake flour")) {
			score=score+10;
		}
		if(Arrays.asList(bowlStuff).contains("Sugar")) {
			score=score+10;
		}
		if(Arrays.asList(bowlStuff).contains("Strawberries")) {
			score=score+10;
		}
		if(Arrays.asList(bowlStuff).contains("Whipped heavy cream")) {
			score=score+10;
		}
		
		for (int i = 0; i < bowlStuff.length; i++) {
			if (bowlStuff[i] != null) {
				total++;
			}
		}
		
		if(total>7){
			score = score - total + 7;
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("\033[H\033[2J");
		System.out.println("        ,ε  ,░  '  ≥      .");
		System.out.println("        ,»-░░   φφφφ▓╬║▒▒φ░φφ╗╗ç");
		System.out.println("       ░ .φφ▄▓▓▒╣╬▓▓▓╬╠╠╬╚╣╣╬╠╠╬╣░");
		System.out.println("     ;░   ╚╬╬╬╬▒╬▒╙▀█╬╩╩╙╙╣╬╣▓╬╠║░░░,.");
		System.out.println("    /░░ .  ╠╬╠╬▓╬╬╗.    │░░░░╠╬▒╬╠▒▒░");
		System.out.println("   ╒░░░░    ░╙║▓╣╬╠╣░░░ ,▓▓▒▓╣▓╬▒╬╩\"     [\"");
		System.out.println("   ╙░ ░░░░░   ╙╚╝╜╚╬▓░φ▓▓╬╬╠╠▀╣█▀╙'     φ░");
		System.out.println("   ⌠▒░▒░░░░  ;∩░   `╠╚╙╙╝╬░' `╙         ░░");
		System.out.println("   ╙░╠▒▒░░░░░░░░   ;     └           ≤φ░'");
		System.out.println("   └▒░░╚╬╬φ░░░░░   ]░          ..,,;░││' [");
		System.out.println("    ╬╠φ░░╙╚╠╠φ▒░φφ░░░≥░;≤░░░░░░░░░│░\"   φ");
		System.out.println("    ╠░╚╠▒░░░░╙╙╚╩╩░░▒░░░░░░░░░ΓΓ\"\"   ,░░");
		System.out.println("     ╠░░╚╠╬╠φ░░░    │.          ,░░≥░Γ");
		System.out.println("      ╚╠░░│╙╚╩░░░░░░░░░░░≥░≥≥░░░░Γ\"   ≤\"");
		System.out.println("        ╙╬▒φ░░░│' \"\"░ΓΓ\"\"ⁿ²\"\"      .;ⁿ");
		System.out.println("            ╙╚╠▒≥░░░Γ░░.  ,,░,;;≤\"^");
		System.out.println("                 `\"\"\"\"\"\"\"\"\"\"`");

		System.out.println("You successfully baked a cake, yay!!!");
		Thread.sleep(1000);
		System.out.println("Your score is...");
		Thread.sleep(1000);
		System.out.println(Main.CYAN_BRIGHT + "\uD83E\uDD73" + score + "\uD83E\uDD73" + Main.RESET);
		Thread.sleep(1000);
		System.out.println("The time it took you was " + Main.PURPLE_BRIGHT + (Main.stop("stopwatch")/1000) + " seconds." + Main.RESET);
		Thread.sleep(1000);
		System.out.println("No matter what you got, robo chef is proud of you for doing your best and learning something new :)");
		while(true){
			System.out.println("Press [P] to play again and [Q] to quit.");
			String uInput = input.nextLine();
			if (uInput.equals("p")){
				Main.start();
			} else if (uInput.equals("q")){
				System.out.println("Robot chef says: beep boop thanks for playing, have a jazzy rest of your day!");
				Thread.sleep(2000);
				System.exit(0);
			} else {
				System.out.println("Please check your reading abilities and enter a valid option.");
			}
		}
	}

	public static void start() throws InterruptedException {
		String uInput;
		Boolean ynBowl = false, ynCakePan = false;
		String[] bowlStuff = new String[999];
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("\033[H\033[2J");
			System.out.println(
					"=========================================================================================");
			System.out.println();
			System.out.println("Welcome to... COMMAND-LINE");
			System.out.println();
			System.out.println(
					"       _..._       .-'''-.        .-'''-.                                          ___   ");
			System.out.println(
					"    .-'_..._''.   '   _    \\     '   _    \\                                     .'/   \\  ");
			System.out.println(
					"  .' .'      '.\\/   /` '.   \\  /   /` '.   \\     .     .--.   _..._            / /     \\ ");
			System.out.println(
					" / .'          .   |     \\  ' .   |     \\  '   .'|     |__| .'     '.   .--./) | |     | ");
			System.out.println(
					". '            |   '      |  '|   '      |  '.'  |     .--..   .-.   . /.''\\  | |     | ");
			System.out.println(
					"| |            \\    \\     / / \\    \\     / /<    |     |  ||  '   '  || |  | | |/`.   .' ");
			System.out.println(
					"| |             `.   ` ..' /   `.   ` ..' /  |   | ____|  ||  |   |  | \\`-' /   `.|   | ");
			System.out.println(
					". '                '-...-'`       '-...-'`   |   | \\ .'|  ||  |   |  | /(\"'`     ||___|  ");
			System.out.println(
					" \\ '.          .                             |   |/  . |  ||  |   |  | \\ '---.   |/___/  ");
			System.out.println(
					"  '. `._____.-'/                             |    /\\  \\|__||  |   |  |  /'\"\"'.\\  .'.--.  ");
			System.out.println(
					"    `-.______ /                              |   |  \\  \\   |  |   |  | ||     ||| |    | ");
			System.out.println(
					"             `                               '    \\  \\  \\  |  |   |  | \\'. __// \\_\\    / ");
			System.out.println(
					"                                            '------'  '---''--'   '--'  `'---'   `''--' ");
			System.out.println();
			System.out.println(Main.RED_BRIGHT + "Full screen your terminal for the best experience.");
			System.out.println();
			System.out.println(Main.RESET + "You are at the main menu.");
			System.out.println("========================");
			System.out.print(Main.YELLOW_BRIGHT + "Press any key to start: ");
			uInput = input.nextLine();
			System.out.print("\033[H\033[2J");

			System.out.println(Main.RESET
					+ "Command-Line Cooking is a cooking simulation game where you learn to bake your choice of dessert.");
			System.out.println();
			Thread.sleep(1000);
			System.out.println(
					"Freely explore the kitchen and whip up a delicious concoction with the ingredients available.");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("At the end, you'll be scored on tastiness by our very professional robot judge.");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("Polish your skills to perfection so you can flex on your friends in a real kitchen.");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("Ready?");
			System.out.println();
			System.out.println("Press any key to continue");
			uInput = input.nextLine();
			System.out.print("\033[H\033[2J");

			System.out.println("What would you like to bake today?");
			System.out.println();
			while (true) {
				System.out.println(
						"Press [1] for Japanese Strawberry Shortcake \uD83C\uDF70     OR     [2] for Chocolate Chip Cookies \uD83C\uDF6A     OR     [3] for Apple Pie \uD83E\uDD67");
				System.out.println();
				System.out.println(Main.RED_BRIGHT + "Options [2] and [3] will be available in ver. 1.2. Stay tuned!"
						+ Main.RESET);
				uInput = input.nextLine();
				if (uInput.equals("1")) {
					Main.strawbShort(ynBowl, ynCakePan, bowlStuff);
					break;
				} else {
					System.out.println("Please check your reading abilities and enter a valid option.");
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Main.start();
	}
}