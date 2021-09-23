
public class BabyMaker
	{

		public static void main(String[] args)
			{
				
				Baby myB1 = new Baby ("N'Golo", 8.2, true);
				
				System.out.println("My first baby is " + myB1.name);
				
				Baby myB2 = new Baby ("Carl", 7.9, false);
				
				System.out.println("My SECOND baby is " + myB2.name);
				
				if(myB1.isAdopted || myB2.isAdopted)
					{
						System.out.println("He is loved.");
					}
				myB1.score();
				
				//home edit 9/22/21
				
			}

	}
