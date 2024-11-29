import java.util.Scanner;

class atm
{
public static void main(String []args )
{
	double tot;
	int bal=5000;
	int a=2006;
	Scanner sc=new Scanner(System.in);
	System.out.println("\t\twelcome to atm!!");
	System.out.println("\t\tinsert your card");
        System.out.println("\t\t1.enter your pin:");
int choo=sc.nextInt();
if(choo==2006)
	{
        System.out.println("\t\tenter option");
	System.out.println("\t\t1.DEPOSITE");
	System.out.println("\t\t2.WITHDRAW");
	System.out.println("\t\t3.MINI STATEMENT");
System.out.println("\t\t4.Quit");
int opt=sc.nextInt();

	}
		
	
		
	
	int opt=sc.nextInt();
	switch(opt)
	{
		case 1:
		    System.out.println("\t\tENTER THE AMOUNT TO BE DOPISITED:");
			double dep=sc.nextDouble();
			tot=dep+bal;
			System.out.println("\t\tTHE AMOUNT IS SUCESSFULLY DEPOSITED");
			System.out.println("\t\tYOUR ACCOUNT BALANCE IS:"+tot);
			System.out.println("\n\t\t\tTHANKING YOU");
			System.out.println("\t\t\tVISIT AGAIN");
			break;
		case 2:
		    System.out.println("\t\tENTER THE AMOUNT TO BE WITHDRAW:");
			double wid=sc.nextDouble();
			tot=bal-wid;
			System.out.println("\t\tYOUR ACCOUNT BALANCE IS:"+tot);
			System.out.println("\t\tTHANKING YOU..!!!");
			System.out.println("\t\tVISIT AGAIN");
	        break;
	    case 3:
		    System.out.println("\t\tYOUR ACCOUNT BALANCE IS:"+bal);
			System.out.println("\t\tFURTHER DETAIL VISIT YOUR ACCOUNT BRANCH...");
			System.out.println("\t\tTHANKING YOU");
			break;
		case 4:
		    System.out.println("\t\tENTER CORRECT OPTION");
			break;
	}
}
}
