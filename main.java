import java.lang.Thread;
import java.util.Scanner;
import java.util.Hashtable;
// inclued methods & arrays

class Main {
	
	// private static final Hashtable<String, Long> tasks = new Hashtable<String, Long>();
	// 	/**
	// 	 * Start the Watch for a Task with Id
	// 	 * 
	// 	 * @param id
	// 	 */
	// 	public static void start(String taskId) {
	// 		tasks.put(taskId, new Long(System.currentTimeMillis()));
	// 	}

	// 	/**
	// 	 * Stop the watch
	// 	 * 
	// 	 * @param id
	// 	 * @return
	// 	 */
	// 	public static long stop(String taskId) {
	// 		return System.currentTimeMillis()
	// 				- ((Long) tasks.remove(taskId)).longValue();
	// 	}

		public static void mainMenu(){
			System.out.println("=========================================================================================");
			System.out.println();
			System.out.println("Welcome to... COMMAND-LINE");
			System.out.println();
			System.out.println("       _..._       .-'''-.        .-'''-.                                          ___   ");
			System.out.println("    .-'_..._''.   '   _    \\     '   _    \\                                     .'/   \\  ");
			System.out.println("  .' .'      '.\\/   /` '.   \\  /   /` '.   \\     .     .--.   _..._            / /     \\ ");
			System.out.println(" / .'          .   |     \\  ' .   |     \\  '   .'|     |__| .'     '.   .--./) | |     | ");
			System.out.println(". '            |   '      |  '|   '      |  '.'  |     .--..   .-.   . /.''\\  | |     | ");
			System.out.println("| |            \\    \\     / / \\    \\     / /<    |     |  ||  '   '  || |  | | |/`.   .' ");
			System.out.println("| |             `.   ` ..' /   `.   ` ..' /  |   | ____|  ||  |   |  | \\`-' /   `.|   | ");
			System.out.println(". '                '-...-'`       '-...-'`   |   | \\ .'|  ||  |   |  | /(\"'`     ||___|  ");
			System.out.println(" \\ '.          .                             |   |/  . |  ||  |   |  | \\ '---.   |/___/  ");
			System.out.println("  '. `._____.-'/                             |    /\\  \\|__||  |   |  |  /'\"\"'.\\  .'.--.  ");
			System.out.println("    `-.______ /                              |   |  \\  \\   |  |   |  | ||     ||| |    | ");
			System.out.println("             `                               '    \\  \\  \\  |  |   |  | \\'. __// \\_\\    / ");
			System.out.println("                                            '------'  '---''--'   '--'  `'---'   `''--' ");
			System.out.println();
			System.out.println("Full screen your terminal for the best experience.");
			System.out.println();
			System.out.println("You are at the main menu.");
			System.out.println("========================");
			System.out.print("Press any key to start: ");
		}

		public static void strawbShort(){
			String[] fridgeInventory = {"Strawberries", "Eggs", "Whole milk", "Unsalted butter", "Mint sprigs", "Heavy cream"};
			String[] pantryInventory = {"Cake flour", "Sugar"};
			String[] cupboardInventory = {"Bowl", "Cake pan"};
			String[] sinkInventory = {"Water"};
			boolean hasBowl = false;
			Scanner input = new Scanner(System.in);
			
			System.out.println("======================================================================");
			System.out.println("|                                                                     |");
			System.out.println("| [1] Fridge                      [3] Stovetop                        |");
			System.out.println("| [2] Freezer                     [4] Oven                            |");
			System.out.println("|                                               [5] Cupboard          |");
			System.out.println("|                                                                     |");
			System.out.println("|                  [6] Pantry                                         |");
			System.out.println("|                                                                     |");
			System.out.println("|                                [7] Sink                             |");
			System.out.println("|                                                         [8] Garbage |");
			System.out.println("|=====================================================================|");
			System.out.println();
			System.out.println("You are in the kitchen.");	
			System.out.println("Where would you like to go first? Press the number that corresponds with the location.");
			
			String uInput = input.nextLine();
			if(uInput.equals("1")){
				System.out.println("==============");
				for(int i=0; i<inventory.length; i++){
					System.out.println("["+(i+1)+"] "+inventory[i]);
				}
				System.out.println("==============");
				System.out.println("You are at the fridge.");

				System.out.println("Which ingredient would you like to use first? Press the number that corresponds with the ingredient");
				uInput = input.nextLine();
				if(uInput.equals("1")){
				}
			}
			else if(uInput.equals("2")){
				System.out.println("You are at the freezer.");
				System.out.println("You can go to the kitchen or the pantry.");
				System.out.println("Where would you like to go first? Press the number that corresponds with the location.");
				uInput = input.nextLine();
			}
			else if(uInput.equals("3")){
				System.out.println("You are at the stovetop.");
				System.out.println("You can go to the kitchen or the pantry.");
				System.out.println("Where would you like to go first? Press the number that corresponds with the location.");
				uInput = input.nextLine();
			}
			else if(uInput.equals("4")){
				System.out.println("You are at the oven.");
				System.out.println("You can go to the kitchen or the pantry.");
				System.out.println("Where would you like to go first? Press the number that corresponds with the location.");
				uInput = input.nextLine();
			}
			else if(uInput.equals("5")){
				System.out.println("==============");
				for(int i=0; i<inventory.length; i++){
					System.out.println("["+(i+1)+"] "+inventory[i]);
				}
				System.out.println("You are at the cupboard.");
				System.out.println("==============");
				System.out.println("You are at the fridge.");
				System.out.println("Which ingredient would you like to use first? Press the number that corresponds with the ingredient");
				uInput = input.nextLine();
				System.out.println("Bowls
				Cake pan");
				
				System.out.println("Where would you like to go first? Press the number that corresponds with the location.");
				uInput = input.nextLine();
			}
			else if(uInput.equals("6")){
				System.out.println("You are in the pantry.");
				System.out.println("You can go to the kitchen or the pantry.");
				System.out.println("Where would you like to go first? Press the number that corresponds with the location.");
				uInput = input.nextLine();
			}
			else if(uInput.equals("7")){
				System.out.println("You are at the sink.");
				System.out.println("You can go to the kitchen or the pantry.");

		}

		public static void chocChipCook(){
			
		}

		public static void applePie(){
			
		}

		public static void main(String[] args) throws InterruptedException {
			Scanner input = new Scanner(System.in);
			// Main.start("urmom");
			mainMenu();
			String uInput = input.nextLine();
			System.out.print("\033[H\033[2J");

			System.out.println("Command-Line Cooking is a cooking simulation game where you learn to bake your choice of dessert...");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("but it's not like the other cooking simulation games out there because you have no instructions!");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("Polish your skills to perfection so that you can flex on your friends when you go to a real kicthen.");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("Ready?");
			System.out.println();
			System.out.println("Press any key to continue");
			uInput = input.nextLine();
			System.out.print("\033[H\033[2J");

			System.out.println("What would you like to bake today?");
			System.out.println();
			while(true){
				System.out.println("Press [1] for Japanese Strawberry Shortcake \uD83C\uDF70     OR     [2] for Chocolate Chip Cookies \uD83C\uDF6A     OR     [3] for Apple Pie \uD83E\uDD67");
				uInput = input.nextLine();
				if (uInput.equals("1")){
					strawbShort();
					break;
				}
				else if (uInput.equals("2")){
					chocChipCook();
					break;
				}
				else if (uInput.equals("3")){
					applePie();
					break;
				}
				else{
					System.out.println(uInput);
					System.out.println("Please check your reading abilities and enter a valid option.");
				}
			}
			
			
		}
	}
			
