package math;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber3 {
	
	public static void main(String[] args) {
		
		 System.out.println(ThreadLocalRandom.current().nextInt());
		 System.out.println(ThreadLocalRandom.current().nextDouble());
		 System.out.println(ThreadLocalRandom.current().nextBoolean());
		 
	}
}
