import java.util.*;////update bit
public class updateBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0/1");   //0=clear , 1=set
		int operater = sc.nextInt();
		
		int n = 5;
		int position = 1;
		int bitMask = 1<<position;
		
		if(operater==1) {
			//set operation
			int or = bitMask | n;
			System.out.println("set operation performing: "+or);
		}else {
			int newbitMask = ~(bitMask);
			int and = newbitMask & n;
			System.out.println("clear operation performing: "+and);
		}
	}

}
