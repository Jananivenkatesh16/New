package P3_code;

public class Food extends Availability
{
public void order(int menuOption)
{
	int foodItem;
switch (menuOption)
{
 
case 1: 
foodItem = 1; 
System.out.println("You've ordered Burger");
 
break;

 case 2:
 
foodItem = 2;
System.out.println("You've ordered fries");

 break;
 
case 3:
 
foodItem = 3; 
System.out.println("You've ordered soda");

 break;
default:
 System.out.println("Invalid option.");
 
}
}
public static void main(String[] args) 
{
	Food f1=new Food();
	f1.order(1);
	f1.available(2);
	}
}
