package demo;

public class Age {

	public static void main(String[] args) {
		
		int age = 35;
		
		if(age>0 && age<=10)
		{
			System.out.println("New Born Child");
		}
		
		else if(age>10 && age<=20)
		{
			System.out.println("Teenger");
			
		}
		else if(age>20 && age <=30)
		{
			System.out.println(" Young ");
		}
		else
		{
			System.out.println("Old");
		}
	}

}
