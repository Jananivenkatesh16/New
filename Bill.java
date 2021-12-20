package P3_code;

public class Bill extends Food
{
	public static double itemprice;
	public static void menu() 
	{ 

		System.out.println("Welcome \n1. Burger \n2. Fries \n3. Soda "); 

		}

public static double itemPrice(int foodItem)

 {
 
if (foodItem == 1) 

{
	 itemprice = 100.00; 
System.out.println("The price of burger is:"+itemprice);

 
}
 
if (foodItem == 2) 

{ 
	itemprice = 50.50;
 System.out.println("The price of fries is:"+itemprice); 



 }
 
if (foodItem == 3)

 { 
	itemprice = 30.00; 
System.out.println("The price of soda is:"+itemprice);
 


}
 
 

return itemprice; 

} 
public void quantity(int quantity)
{
System.out.println("Enter quantity:"+quantity);  
	 
}

public void total(int quantity)
{
	double Total=quantity * itemprice;
	System.out.println("total price of the order: " +Total);
	System.out.println("!!!!! ENJOY YOUR MEAL!!!!!");
}
public static void main(String[] args) {
	 Bill b1=new Bill();
	 b1.menu();
	 b1.order(1);
	 b1.itemPrice(3);
	 b1.available(2);
	 b1.quantity(3);
	 b1.total(3);
	 
	 
		

	}

}
