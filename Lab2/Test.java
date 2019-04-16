class Test{
	public static void main(String args[])
	{
	int d=48;
	int e=67;
	int f=0;
	f=d & e;
	System.out.println("d & e:"+f);
	f=d | e;
	System.out.println("d | e:"+f);
	f=d ^ e;
	System.out.println("d ^ e:"+f);
	f=~d;
	System.out.println("~d:"+f);
	f=d << 2;
	System.out.println("d << 2:"+f);
	f=d >> 2;
	System.out.println("d >> 2:"+f);
	f=d >>> 2;
	System.out.println("d >>> 2:"+f);
	}
}