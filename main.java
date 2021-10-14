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
			System.out.println("You are at the main menu.");
			System.out.println("========================");
			System.out.print("Press any key to start: ");
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
			System.out.println("Press [1] for Strawberry Shortcake \uD83C\uDF70     OR     [2] for Chocolate Chip Cookies \uD83C\uDF6A     OR     [3] for Apple Pie \uD83E\uDD67");
			
		}
	}
			
