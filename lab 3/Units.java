import java.util.*; 
class Units{
	public static void main(String args []){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter amount of consumed units:");
	int u=s.nextInt();
	if(u<=50){
	System.out.println("Your electriciity bill is:"+u*10);
	}
	else if(u>50||u<=100){
	int b,v;
	b=u-50;
	v=(50*10)+(b*15);
	System.out.println("Your Electricity bill is:"+v);
	}
	else if(u>100||u<=200){
	int b,v;
	b=u-100;
	v=(50*10)+(50*15)+(b*20);
	System.out.println("Your Electricity bill is:"+v);
	}
	else if(u>200||u<=300){
	int b,v;
	b=u-200;
	v=(50*10)+(50*15)+(100*20)+(b*25);
	System.out.println("Your Electricity bill is:"+v);
	}
	else if(u>300){
	int b,v;
	b=u-300;
	v=(50*10)+(50*15)+(100*20)+(200*25)+(b*30);
	System.out.println("Your Electricity bill is:"+v);
	}
	}
}