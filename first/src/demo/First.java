package demo;

public class First {

	public static void main(String[] args) {
		
		double persentage = 72;
		
		if(persentage>=35 && persentage <50)
		{
			
			System.out.println("You Are Pass");
			
		}
		else if(persentage>= 50 && persentage <60)
		{
			System.out.println("Second Class");	
			
		}
		else if (persentage>=60 && persentage < 70)
		{
			System.out.println("First Clsaa");
		
		}
		else if (persentage >= 70 && persentage <= 100)
		{
		  System.out.println("Distintion");
		}
		else
		{
			System.out.println("Better Luck For Next Time");

		}
			

	}

}

