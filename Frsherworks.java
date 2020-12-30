import java.io.*;
import java.lang.String;
import java.util.*;
import org.json.JSONObject;
public class Fresherworks {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 public void Insert( ) throws IOException
	 {
	   Scanner in = new Scanner (System.in);
	  System.out.println("Enter the company_name: ");
	 String company_name=in.next();
	 System.out.println("Enter the company_location: ");
	 String company_location=in.next();
	 System.out.println("Enter the salary: ");
	 int salary=in.nextInt();
	 System.out.println("Enter the ceo: ");
	  char ceo=(char) in.nextInt();     
	  JSONObject obj=new JSONObject(); 
	  obj.put("company_name",company_name);    
	  obj.put("company_location",company_location);    
	  obj.put("salary",salary);
	  obj.put("ceo",ceo);
	  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Fresherworks.txt",true)));
	  pw.print(obj);
	  System.out.println("Details added successfully.");
	  pw.close();
	 }
	public static void main(String args[]) throws IOException
	{
	  Fresherworks in = new Fresherworks();
	  in.Insert();
	}
	 
	}
