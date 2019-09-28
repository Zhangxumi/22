public class InputScanner{
	public static void main(String[] args){
		
		final string youngsister = "YOUNGER";
		final string oldersister = "OLDER";
		final string sister = "SECRET";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please input the age of your sister:"):
		int age = scan.nextInt();
		
		String nickname = sister;
		
		if(age < 18){
			nickname = youngsister;
		}
		
		if(age >= 18){
			nickname = oldersister;
		}
		
		switch( nickname ){
			case youngsister:
			     System.out.println(""you are young");
				 break;
			case oldersister:
			     System.out.println(""you are old");
			case sister:
			     System.out.println("It is a secret");
			default:
			     System.out.println("Please try again");
		} 
	}
}