import java.util.*;
class Input{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter C++ marks:");
	int c=s.nextInt();
	System.out.println("Enter Data Structure marks:");
	int d=s.nextInt();
	System.out.println("Enter Operatin system's marks:");
	int o=s.nextInt();
	int sum=c+d+o;
	System.out.println("Your Obtained marks are:"+sum);
	float p=(sum*100)/300;
    System.out.println("Your Percentage is:"+p+"%");
    if(p>=90){
    System.out.println("Your grade is A");
    }
    else  if(p<90||p>=80){
    System.out.println("Your grade is B");
    }
    else  if(p<=79||p>=70){
    System.out.println("Your grade is C");
    }
    else  if(p<=69||p>=60){
    System.out.println("Your grade is D");
    }
    else  if(p<60){
    System.out.println("You are fail");
    }
    else
     System.out.println("invalid");
	}
}