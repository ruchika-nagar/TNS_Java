import java.util.Scanner;
public class T_4_Calc_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//15/9/23 OOP
	//create class in different dont create it in main method
	T_4_calculator c1=new T_4_calculator();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two number:");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	c1.setNo1(num1);
	
	c1.setNo2(num2);
	System.out.println(c1.toString());
	System.out.println("addition:"+c1.getAdd());
	System.out.println("Substraction:"+c1.getSub());
	System.out.println("Multiplication:"+c1.getMul());
	System.out.println("Division:"+c1.getDiv());
	}
	}
