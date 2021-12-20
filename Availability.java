package P3_code;


import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
public class Availability {
	public void available(int i) 
	{
		Properties p1=new Properties();
		File f1=new File("J:\\jan\\food.properties");
		try
		{
			FileInputStream fs1=new FileInputStream(f1);
			p1.load(fs1);
			if(i==1)
			{
		    System.out.println(p1.getProperty("a"));
			}
			if(i==2)
			{
				 System.out.println(p1.getProperty("b"));
			}
			if(i==3)
			{
				 System.out.println(p1.getProperty("c"));
			}
		}
		catch(Exception fs1)
		{
						System.out.println(fs1);
		}
		
	}
	

	public static void main(String[] args)
	{
		Availability  a1=new Availability();
		a1.available(1);

	}

}
