import java.util.Random;
public class random_number {
	public static void main(String[] args) {
		Random r = new Random();
		int total=0;
		for(int i=0; i<10; i++)
		    {
		      int randomint = r.nextInt(1000);
		      System.out.print(" " + randomint);
		      total = total + randomint ;
		    }

		System.out.println("\n total of all random numbers generated = " + total);
	}
}