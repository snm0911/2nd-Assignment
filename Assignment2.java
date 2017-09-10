import java.util.Scanner;

public class Assignment2 {
	public static void main(String args[])
	{
		String org,del,mod = null;
		int len;
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Give me a sentence : ");
		org = sc.nextLine();
		
		System.out.print("Give me characters to delete : ");
		del = sc.nextLine();
		
		System.out.println("Original sentence : "+org);
		len = del.length();
		mod=org;
		for(int a=0; a<len; a++)
		{
			mod = mod.replaceAll(""+del.charAt(a),"");
		}
		
		System.out.println("Modified sentence : "+mod);

	}
}