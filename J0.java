package smJv;
public class J0 {
//static{  
//	  System.out.println("\n\t Static block is invoked");  
//	  System.exit(0);  
//	  }
//   int a=57;
//	  static void cube(int x){  
//		  System.out.println("\n\t "+x*x*x);  
//		  }      
	public static void main(String[] args)throws Exception
	{
/*
		int a=5;
		double b=7.5;
		int c=(int)b;
		byte d=(byte)b;
		byte f=4;
		byte g=17;
		byte h=(byte)(a+g);
		char i='J';
		short j=19;
		long k=65216;
		float l=57;
		System.out.println("\n\t H is : "+h);
		int m=10;  
		int n=-10;  
		boolean o=true;  
		boolean p=false;  
		System.out.println("\t "+~m);
		System.out.println("\t "+~n);
		System.out.println("\t "+!o);
		System.out.println("\t "+!p);
		System.out.println("\t "+(10<<2));//10*2^2=10*4=40  
		System.out.println("\t "+(10<<3));//10*2^3=10*8=80  
		System.out.println("\t "+(20<<2));//20*2^2=20*4=80  
		System.out.println("\t "+(15<<4));
	    System.out.println("\t "+(20>>2));  
	    System.out.println("\t "+(20>>>2)); 
	    System.out.println("\t "+(-20>>2));  
	    System.out.println("\t "+(-20>>>2));
	    
	    int q=10;  
	    int r=5;  
	    int s=20;  
	    System.out.println("\t "+(q<r&&q++<s));
	    System.out.println("\t "+q); 
	    System.out.println("\t "+(q<r&q++<s)); 
	    System.out.println("\t "+q);
	     
	        a:    
	    	for(int i = 0; i<= 10; i++) {    
	    	b:    
	    	for(int j = 0; j<=15;j++) {    
	    	c:    
	    	for (int k = 0; k<=20; k++) {    
	    	System.out.println("\t "+k);    
	    	if(k==5) {    
	    	 break a;    
	    	}    
	    	}    
	    	}  
	    	}

	        for(int i=0;i<=7;i++)
	        {
	        	for(int j=0;j<=5;j++)
	        	{
	        		System.out.print(" *");
	        	}
	        	System.out.println();
	        }

		for(int i=0;i<=7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

		for(int i=0;i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

        aa:  
        for(int i=1;i<=3;i++){    
                bb:  
                for(int j=1;j<=3;j++){    
                    if(i==2&&j==2)
                    {
                        continue aa;   
                    }    
                    System.out.println(" "+i+" "+j);    
                }    
        } 

		int i=1;  
	    do{  
	        if(i==5)
	        {  
	            i++;  
	            continue; 
	        }  
	        System.out.println(" \t "+i);  
	        i++;  
	    }while(i<=10); 
 
		J0 Ob0=new J0();
		System.out.println("\n\t "+Ob0.a);
 
		cube(10);

        Student.change();
	    Student s1 = new Student(111,"Karan");  
	    Student s2 = new Student(222,"Aryan");  
	    Student s3 = new Student(333,"Sonoo");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();

		int u=5,v=7;
		double a=67.4667,b=98.757,d=60;
		double dr=Math.toRadians(d);
		System.out.println("\n  Maximum Value : "+Math.max(a,b));
		System.out.println("  Sine of 60 : "+Math.sin(dr));
		System.out.println("  Cosine of 60 : "+Math.cos(dr));
		System.out.println("  Tangent of 60 : "+Math.tan(dr));
		System.out.println("  Sinhyperbolic of 60 : "+Math.sinh(dr));
		System.out.println("  Coshyperbolic of 60 : "+Math.cosh(dr));
		System.out.println("  Tanhyperbolic of 60 : "+Math.tanh(dr));
		System.out.println("  arcsin of 60 : "+Math.asin(dr));
		System.out.println("  arccos of 60 : "+Math.acos(dr));
		System.out.println("  arctan of 60 : "+Math.acos(dr));
		System.out.println("  Math.random() method : "+Math.random());
		System.out.println("  Math.rint() method : "+Math.rint(d));
		System.out.println("  Math.ulp() method : "+Math.ulp(d));
		System.out.println("  Math.toIntExact() method : "+Math.toIntExact(u));
	    System.out.println("  Math.addExact() method : "+Math.addExact(58,63));

		Integer a=5;
		int b=a;
		System.out.println("\n\t  a : "+a);
		System.out.println("\t  b : "+b);

		String StrArr[]= {"   Programming ","with","javaTpoint","tutorials !"};
		System.out.println("\n\t String array size : "+StrArr.length+"\n");
		for(int i=0;i<StrArr.length;i++)
		{
		System.out.print(" "+StrArr[i]);
		}

		String str1="Programming with javaTpoint tutorials !";
		System.out.println(str1.lastIndexOf("ls",36)); //The second argument i.e,(35)should be >=str1.length().

		System.out.println("\n\t\sJava\sProgramming\swith\sjavaTpoint\stutorials\s!");
	
		String str2="\t Programming with javaTpoint tutorials !";
		String arrStr[]=str2.split(" ");
		for(String wrd:arrStr)
		{
			System.out.print(wrd+" ");
		}

		int arr[]= {43,76,98};
		try {
			int qt=arr[3]/0;
		}
		catch(ArrayIndexOutOfBoundsException index)
		{
			System.out.print("\n\t Array index is out of bound !");
		}
		catch(ArithmeticException arithmetic)
		{
			System.out.print("\n\t Invalid devision by Zero !");
		}
		catch(Exception exc)
		{
			System.out.print("\n\t Common Exception !");
		}

		try
		{
			double quotient=7/0;     // If no exception found 
			System.out.println("\n\t The quotient of 7 and 0 is : "+quotient);
			System.out.println("\t Operation successful !");
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n\t Arithmetic Exception handled !");
		
*/
	}
}