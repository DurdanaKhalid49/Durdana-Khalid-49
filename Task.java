class Triangle{
	double hyp;
	double base;
	double per;
		Triangle(double base,double per)
		{
		this.hyp=hyp;
		this.base=base;
		this.per=per;
		}
			Triangle(float base,float per)
			{
			this.hyp=hyp;
			this.base=base;
			this.per=per;
			}
				Triangle()
				{
				hyp=hyp;
				base=base;
				per=per;
				}
					public double getbase(double base,double per)
					{
					base=Math.sqrt((hyp*hyp)-(per*per));
					return base;
					}
						public double gethyp(double base,double per)
					{
					hyp=Math.sqrt((base*base)+(per*per));
					return hyp;
					}
					 		public double getper(double base,double per)
					{
					per=Math.sqrt((hyp*hyp)-(base*base));
					return per;
					}
}

class Task{
	public static void main(String args[])
	{
	           Triangle obj=new Triangle(34.4d,4.5d);
	           System.out.println("The base of right angle triangle is "+ obj.getbase(34.4d,4.5d));
	           System.out.println("The hyptonus of right angle triangle is "+ obj.gethyp(34.4d,4.55d));
	           System.out.println("The perpendicular of right angle triangle is "+ obj.getper(34.4d,4.55d));
	}
}