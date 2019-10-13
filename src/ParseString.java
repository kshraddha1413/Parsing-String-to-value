
public class ParseString {

	public static void main(String[] args) {
		String numbarAsSting="2019";
		System.out.println("Number Enterd as string"+numbarAsSting);
		
		int number=Integer.parseInt(numbarAsSting);
		System.out.println("interger number after parsing "+number);
		
		System.out.println(numbarAsSting+=1);//output show concanate the sting 
		System.out.println(number+=1);//after paring it will take as number and 1 in number

//		String numbarAsSting1="2019a";//this error can handle by catch exception
//		int number1=Integer.parseInt(numbarAsSting1);//it can only parse numbers as string
		//not character into number.it will erreor.
		
		String doubleNumberAsString="2019.125";
		double doublenumber=Double.parseDouble(doubleNumberAsString);
		System.out.println(doublenumber);
		
	}
}
