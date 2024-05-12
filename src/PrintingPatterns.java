import java.util.Scanner;

public class PrintingPatterns {
public static void print(int a)
{ for(int i=1;i<=a;i++)
{ 
	for(int j=1;j<=i;j++)
	{ System.out.print("*");
		
	}
		
	System.out.println("");	
		
}
}
public static int findOccurance(String name, char ch)
{ 
	int count=0;
	for(int i=0;i<name.length();i++)
	{ 
		if(name.charAt(i)==ch)
		{
			count++;
		}
	}
	
	
	
	return count;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=10;
   //print(a);
   
   
  String name="amrit bharath";
  Scanner input= new Scanner(System.in);
  char ch=input.next().charAt(0);

int result = findOccurance(name,ch);	
System.out.print(result);
	}

}


