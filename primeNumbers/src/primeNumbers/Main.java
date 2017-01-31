package primeNumbers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * @author drewry pope
 */
public class Main {
	/* Original method, divide i against every number up to i 
	public static void main(String[] args) 
	{
		List<Integer> primeNumbers= new ArrayList<Integer>();
		for (int iO = 0; iO < 100; iO++) {
			for (int iI = 2; iI <= iO; iI++) {
				if (iI == iO) {
					primeNumbers.add(iO);
				} else if (0 == (iO % iI)) {
					break;
				}
			} 
		}
		Iterator<Integer> itr = primeNumbers.iterator();
		System.out.print(itr.next());
		while(itr.hasNext()) {
	         System.out.print(", " + itr.next());
	    }
	} */
	
	//New method, divide i against every found prime up to i
	public static void main(String[] args)
	{
		List<Integer> primeNumbers= new ArrayList<Integer>(); //initialize new ArrayList to store primes
		for (int iO = 2; iO <= 100; iO++) { //For numbers 2 to 100
			for (int iI = 0; iI <= primeNumbers.size(); iI++) { //For primeNumbers index 0 to end of List
				if (iI == primeNumbers.size()) { //if on last iteration, 
					primeNumbers.add(iO); //then add iO as prime
				}else if (0 != iO % primeNumbers.get(iI)) { //if iO is not divisible by primeNumber(iI)
					continue; //then continue from beginning of inner for loop
				}
				break; //exit inner For loop if number divides by primeNumber(iI) or number was added as prime
			} 
		}
		Iterator<Integer> itr = primeNumbers.iterator();  //initialize an iterator to output array
		System.out.print(itr.next()); //print first prime without a comma
		while(itr.hasNext()) { //while there's still more integers to iterate
	         System.out.print(", " + itr.next()); //print next number with minor formatting
	    }
	}
}