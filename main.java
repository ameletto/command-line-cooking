import java.lang.Thread;
import java.util.Scanner;
import java.util.Hashtable;
// inclued methods & arrays

class Main {

	// private static final Hashtable<String, Long> tasks = new Hashtable<String,
	// Long>();
	// /**
	// * Start the Watch for a Task with Id
	// *
	// * @param id
	// */
	// public static void start(String taskId) {
	// tasks.put(taskId, new Long(System.currentTimeMillis()));
	// }

	// /**
	// * Stop the watch
	// *
	// * @param id
	// * @return
	// */
	// public static long stop(String taskId) {
	// return System.currentTimeMillis()
	// - ((Long) tasks.remove(taskId)).longValue();
	// }

	public static void mainMenu() {
		System.out.print("\033[H\033[2J");
		System.out.println("=========================================================================================");
		System.out.println();
		System.out.println("Welcome to... COMMAND-LINE");
		System.out.println();
		System.out.println("       _..._       .-'''-.        .-'''-.                                          ___   ");
		System.out.println(
				"    .-'_..._''.   '   _    \\     '   _    \\                                     .'/   \\  ");
		System.out.println(
				"  .' .'      '.\\/   /` '.   \\  /   /` '.   \\     .     .--.   _..._            / /     \\ ");
		System.out
				.println(" / .'          .   |     \\  ' .   |     \\  '   .'|     |__| .'     '.   .--./) | |     | ");
		System.out.println(". '            |   '      |  '|   '      |  '.'  |     .--..   .-.   . /.''\\  | |     | ");
		System.out.println(
				"| |            \\    \\     / / \\    \\     / /<    |     |  ||  '   '  || |  | | |/`.   .' ");
		System.out.println("| |             `.   ` ..' /   `.   ` ..' /  |   | ____|  ||  |   |  | \\`-' /   `.|   | ");
		System.out
				.println(". '                '-...-'`       '-...-'`   |   | \\ .'|  ||  |   |  | /(\"'`     ||___|  ");
		System.out
				.println(" \\ '.          .                             |   |/  . |  ||  |   |  | \\ '---.   |/___/  ");
		System.out.println(
				"  '. `._____.-'/                             |    /\\  \\|__||  |   |  |  /'\"\"'.\\  .'.--.  ");
		System.out
				.println("    `-.______ /                              |   |  \\  \\   |  |   |  | ||     ||| |    | ");
		System.out.println(
				"             `                               '    \\  \\  \\  |  |   |  | \\'. __// \\_\\    / ");
		System.out.println("                                            '------'  '---''--'   '--'  `'---'   `''--' ");
		System.out.println();
		System.out.println("Full screen your terminal for the best experience.");
		System.out.println();
		System.out.println("You are at the main menu.");
		System.out.println("========================");
		System.out.print("Press any key to start: ");
	}

	public static void strawbShort() {
		String[] fridgeInventory = { "Strawberries", "Eggs", "Whole milk", "Unsalted butter", "Mint sprigs",
				"Heavy cream" };
		String[] pantryInventory = { "Cake flour", "Sugar" };
		String[] cupboardInventory = { "Bowl", "Cake pan" };
		boolean hasBowl = false;
		boolean hasCakePan = false;
		Scanner input = new Scanner(System.in);

		System.out.print("\033[H\033[2J");
		System.out.println("Press [0] to go back");
		System.out.println("");
		System.out.println("======================================================================");
		System.out.println("|                                                                     |");
		System.out.println("| [1] Fridge                                                          |");
		System.out.println("| [2] Freezer                     [3] Oven                            |");
		System.out.println("|                                               [4] Cupboard          |");
		System.out.println("|                                                                     |");
		System.out.println("|                  [5] Pantry                                         |");
		System.out.println("|                                                                     |");
		System.out.println("|                                [6] Sink                             |");
		System.out.println("|                                                         [7] Garbage |");
		System.out.println("|=====================================================================|");
		System.out.println();
		System.out.println("You are in the kitchen.");
		System.out.println("Where would you like to go first? Press the number that corresponds with the location.");
//trycatch
		String uInput = input.nextLine();
		if (uInput.equals("0")) {
			Main.mainMenu();
		} 
		else if (uInput.equals("1")) {
			System.out.println("[0] Back to main menu");
			System.out.println();
			System.out.println("==============");
			for (int i = 0; i < fridgeInventory.length; i++) {
				System.out.println("[" + (i + 1) + "] " + fridgeInventory[i]);
			}
			System.out.println("==============");
			System.out.println("You are at the fridge.");
			if (hasBowl == false) {
				System.out.println("Hint: you need something to put your ingredients in.");
				Main.strawbShort();
			} 
			else {
				while (true) {
					System.out.println("Which ingredient would you like to put in your bowl? Press the number that corresponds with the ingredient. Press [D] when done.");
					uInput = input.nextLine();
					if (uInput.equals("1")) {
						System.out.println("Strawberries... in the bowl!");
					} else if (uInput.equals("2")) {
						System.out.println("Eggs... in the bowl!");
					} else if (uInput.equals("3")) {
						System.out.println("Whole milk... in the bowl!");
					} else if (uInput.equals("4")) {
						System.out.println("Unsalted butter... in the bowl!");
					} else if (uInput.equals("5")) {
						System.out.println("Mint sprigs... in the bowl!");
					} else if (uInput.equals("6")) {
						System.out.println("Heavy cream... in the bowl!");
					} else if (uInput.equals("d")) {
						Main.strawbShort();
						break;
					} else {
						System.out.println("You put nothing in your bowl. lol get rekt.");
					}
				}
			}
		}
	else if(uInput.equals("2"))
	{
		System.out.println("You are at the freezer.");
		System.out.println("There's nothing in here that you need.");
		System.out.println("Press any key to go back.");
		uInput = input.nextLine();
		Main.strawbShort();
	}
	else if(uInput.equals("3"))
	{
		// have putting cake in oven graphics
		System.out.println("[0] Main menu");
		System.out.println();
		System.out.println("You are at the oven.");
		if(hasCakePan == false){
			System.out.println("Hint: you need something to bake your cake in. Press [0] to go back.");
			while(true){
				uInput = input.nextLine();
				if (uInput.equals("0")){
					Main.strawbShort();
					break;
				}
				else{
					System.out.println("You literally have nothing to do here, please go back.");
				}
			}
		}
		else{
			while(true){
				System.out.println("Would you like to put your cake in the oven? Press [Y] if yes or [N] if no.");
				while(true){
					uInput = input.nextLine();
					if(uInput.equals("y")){
						System.out.println("Cake... in the oven!");
						try {
							Thread.sleep(1000);
						} catch(InterruptedException e) {
							System.out.println(":D");
						}
						System.out.println("20min left");
						try {
							Thread.sleep(1000);
						} catch(InterruptedException e) {
							System.out.println(":D");
						}
						System.out.println("10min left");
						try {
							Thread.sleep(1000);
						} catch(InterruptedException e) {
							System.out.println(":D");
						}
						System.out.println("5min left");
						try {
							Thread.sleep(1000);
						} catch(InterruptedException e) {
							System.out.println(":D");
						}
						System.out.println("1min left");
						try {
							Thread.sleep(1000);
						} catch(InterruptedException e) {
							System.out.println(":D");
						}
						System.out.println("Congrats! Your cake has succesfully finished baking. Now it's time to decorate :P");
						try {
							Thread.sleep(1000);
						} catch(InterruptedException e) {
							System.out.println(":D");
						}
						Main.strawbShort();
						break;
					}
					else if(uInput.equals("n")){
						System.out.println("Okay then. Press [0] to go back");
						while(true){
							uInput = input.nextLine();
						if(uInput.equals("0")){
							Main.strawbShort();
							break;
						}
						else{
							System.out.println("??? Please check your reading and try again.");
						}
						}
						}
					}
				}	
	}}
	else if(uInput.equals("4"))
	{
		System.out.println("==============");
		for (int i = 0; i < cupboardInventory.length; i++) {
			System.out.println("[" + (i + 1) + "] " + cupboardInventory[i]);
		}
		System.out.println("==============");
		System.out.println("You are at the cupboard.");
		System.out.println("Which container would you like to use first? Press the number that corresponds with the container.");
		while(true){
			uInput = input.nextLine();
			if(uInput.equals("1")){
				hasBowl = true;
				System.out.println("Bowl acquired!");
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					System.out.println(":D");
				}
				Main.strawbShort();
				break;
			}
			else if(uInput.equals("2")){
				hasCakePan = true;
				System.out.println("Cake pan acquired!");
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					System.out.println(":D");
				}
				Main.strawbShort();
				break;
			}
			else{
				System.out.println("You got nothing because that was not a valid option, please try again.");
			}
		}
		
	}else if(uInput.equals("5"))
	{
		System.out.println("==============");
		for (int i = 0; i < pantryInventory.length; i++) {
			System.out.println("[" + (i + 1) + "] " + pantryInventory[i]);
		}
		System.out.println("==============");
		System.out.println("You are in the pantry.");
		System.out.println("Which ingredient would you like to put in your bowl? Press the number that corresponds with the ingredient. Press [D] when done.");
		while(true){
			uInput = input.nextLine();
			if(uInput.equals("D")){
				Main.strawbShort();
				break;
			}
			else if(uInput.equals("1")){
				System.out.println("Flour... in the bowl!");
			}
			else if(uInput.equals("2")){
				System.out.println("Sugar... in the bowl!");
			}
			else{
				System.out.println("There's literally nothing in your bowl because you don't know how to read. Please try again.");
		}}
	}else if(uInput.equals("6"))
	{
		while(true){
		System.out.println("You are at the sink.");
		System.out.println("Would you like some water? Press [Y] if yes or [N] if no.");
		while(true){
			uInput = input.nextLine();
			if(uInput.equals("y")){
				System.out.println("What would you like to do with the water?");
				System.out.println("[1] Pour it into the bowl");
				System.out.println("[2] Drink it because hydrate or diedrate");
				System.out.println("[3] Water the plant over there");
				uInput = input.nextLine();
				if(uInput.equals("1")){
					System.out.println("Water... in the bowl!");
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println(":D");
					}
					break;
				}
				else if(uInput.equals("2")){
					System.out.println("Ahh, that was some hydrating dihydrogen monoxide.");
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println(":D");
					}
					break;
				}
				else if(uInput.equals("3")){
					System.out.println("You water the plant and...");
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println(":D");
					}
					System.out.println("The plant grows into a giant venus flytrap, spreading across the kitchen floor and breaking through the ceiling.");
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println(":D");
					}
					System.out.println("\"Mmm this growth spurt has made me really hungry\"");
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println(":D");
					}
					System.out.println("The plant looks down and sees...");
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println(":D");
					}
					System.out.println("You! A mere human being.");
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println(":D");
					}
					System.out.println("\"What a kind offering from the gods, don't mind if I do\"");
					try {
						Thread.sleep(1000);
					} catch(InterruptedException e) {
						System.out.println(":D");
					}
					System.out.print("\033[H\033[2J");
					System.out.println("Unfortunately, you were eaten by your house plant. All game progress has been lost. Moral of the story: Never water your plants. Press any key to go back to the main menu.");
					uInput = input.nextLine();
					Main.mainMenu();
					break;
				}
				else{
					System.out.println("You got nothing because that was not a valid option, please try again.");
				}
			}
	}}}}

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
