import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		BigDecimal a = in.nextBigDecimal();
		BigDecimal b = in.nextBigDecimal();
		
		
		
		System.out.println(a.remainder(b));
		
		
		
	}

}
