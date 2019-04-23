import java.util.*;
class Choice{
	public static void main(String args []){
	Scanner s=new Scanner(System.in);
	System.out.print("enter any number:");
	int a=s.nextInt();
	System.out.print("enter any number:");
	int b=s.nextInt();
	System.out.print("enter any operator(+,-,/,*):");
	char opt=s.next().charAt(0);
	switch(opt){
		    case '+':
		    	     System.out.print("The Answer is:"+(a+b));
		    	     break;
		    case '-':
		    if(a>b){
		    	     System.out.print("The Answer is:"+(a-b));
		    	     }
		    else if(b>a){
		    	     System.out.print("The Answer is:"+(b-a));
		    	    }	     
		    	     break;
		    case '*':
		    	     System.out.print("The Answer is:"+(a*b));
		    	     break;
		    case '/':
		    if(a>b){
		    	     System.out.print("The Answer is:"+(a/b));
		    	     }
		    else if(b>a){
		    	     System.out.print("The Answer is:"+(b/a));
		    	    }	     
		    	     break;
		    	     default:
		    	      System.out.print("Invalid choice");
		    	      }
		    	      }
		    	      }

		    	     
