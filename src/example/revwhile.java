package example;

public class revwhile {

	public static void main(String[] args) {
	
			int number= 123456;
			int reverse=0;
			int reminder;
			while(number!=0)
			{
				reminder=number%10;
				reverse=reverse*10+reminder;
				number=number/10;
				
			}
			System.out.println("reverse of a number:"+reverse);
			
		// TODO Auto-generated method stub

	}

}
