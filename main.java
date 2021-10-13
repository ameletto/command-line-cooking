import java.lang.Thread;
import java.util.Scanner;
import java.util.Hashtable;

class Main {
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
		return System.currentTimeMillis()
				- ((Long) tasks.remove(taskId)).longValue();
	}

    public static void main(String[] args) throws InterruptedException {
        Main.start("urmom");
        System.out.println("hi" + "\uD83C\uDF5E");
        Thread.sleep(1000);
        // System.out.print("\033[H\033[2J");
    }
}
        
