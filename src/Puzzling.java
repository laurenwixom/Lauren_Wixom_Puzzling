import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Puzzling {
	//printsum
	public ArrayList<Integer> getNumberSum(int [] x){
		ArrayList<Integer> greaterthan10 = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
  			sum += x[i]; // sum = sum + x[i];
  			if (x[i] > 10) {
  				greaterthan10.add(x[i]);
  			}
		}
	System.out.println(sum);
	return greaterthan10;
	}

	//shufflenames
	public ArrayList<String> shuffleName(String [] namesArr){
		List<String> namesList = Arrays.asList(namesArr);
		Collections.shuffle(namesList);
		System.out.println(namesList);
		ArrayList<String> namesShorterThan5 = new ArrayList<String>();
		for (int i=0; i < namesArr.length; i++) {
			if (namesArr[i].length() > 5) {
				namesShorterThan5.add(namesArr[i]);
			}
			
		}
  		return namesShorterThan5;	
		}
	
	//alphabet
	public ArrayList<String> shuffleAlpha(String[] alphArr){
		List<String> alphaList = Arrays.asList(alphaArr);
		Collections.shuffle(alphaList);
		System.outprintln(alphaList);
		ArrayList<string> vowels = new ArrayList<String>(); {
		char first = (alphaList.charAt(0));
		char last = alphaList.charAt(shuffleAlpha.length() - 1);
		}
	}
	
	
	//randomnumbers
	public ArrayList<String> shuffleName(String [] namesArr){
		List<String> namesList = Arrays.asList(namesArr);
		Collections.shuffle(namesList);
		System.out.println(namesList);
		ArrayList<String> namesShorterThan5 = new ArrayList<String>();
		for (int i=0; i < namesArr.length; i++) {
			if (namesArr[i].length() > 5) {
				namesShorterThan5.add(namesArr[i]);
			}
			
		}
  		return namesShorterThan5;	
	
}
	
	public ArrayList<String> shuffleOutput(String [] numArr){
		List<String> numberList = Arrays.asList(numArr);
		Collections.shuffle(numberList);
		System.out.println(numberList);
		ArrayList<String> suffleOutput = new ArrayList<String>();
		for (int i=0; i < numArr.length; i++) {
			if (numArr[i].length() <= 100) {
				shuffleOutput.add(numArr[i]);
			}
			
		}
  		return shuffleOutput;	
	
}
 
	//minmax
	public ArrayList <String> minMax (String [] Arr) {
		List <String> numberList = Arrays.asList(Arr);
		Random.nextInt(numberList);
		System.out.println(numberList);
		
		for (int i = 0; i < numberList.length; i++)
		    {
		        if (number[i] < min)
		        {
		            min = number[i];
		        }
		        if (number[i] > max)
		        {
		            max = number[i];
		        }
		    }
		    System.out.println("Max:" + max);
		    System.out.println("Min:" + min);
		}
		
	
	//randomstring
	public static <String> random alphaString(int count) {
	while (count-- != 0) {
		int character = (int)(Math.random()alphaString.length());
		builder.append(alphaString.charAt(character));
		}
		return builder.toString();
		}
}
	
	



//generatearray

public static void main(String[] args) { 
	int n = 0;  
	for (int i = 0; i < n; i++) { 
		 
        int index 
            = (int)(AlphaString.length() 
                    * Math.random()); 


        sb.append(AlphaString 
                      .charAt(index)); 
    } 

    return sb.toString(); 
} 
    System.out.println(RandomString 
    .getAlphaNumericString(n)); 
} 
} 
}









