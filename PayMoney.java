import java.util.*;

public class PayMoney{

	@SuppressWarnings("resource")
	public static void main (String[] args) {
		int counter, num, item, target=0, sum=0, array[];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of tansaction array:  ");
		num  = sc.nextInt();
		
		array = new int[num]; // creating the array to store the numbers declaration of array
		System.out.println("Enter the value of the array:");
		// loop to store each no in array
		for(counter=0; counter<num; counter++) {
			array[counter]=sc.nextInt();
		}
		System.out.println("Enter the value of target");
		item=sc.nextInt();
		
		if(array[0]<item) {
		System.out.println("Enter the total no of targets that needs to be achieved");
		target = sc.nextInt();
		}
		for(counter=0; counter<num; counter++) {
			sum = array[counter]+sum;
			
				if(sum>=item) {
				System.out.println("Target achieved after "+(counter+1)+" transactions");
				break;
				}
		}
		if(counter==num) {
			System.out.println("not achived");
		}
	}
}