package in.kanha;

public class Operators {
	
	public static void main(String[] args) {

//*************************************************************************************	
//	1. Arithmetic Operator :->
//	==========================
		/*  <<  +   -  *  /   %  >>  */
    
//		eg ->
		 
   /*	int a = 5;
 		int b = 15;
		
		System.out.println(a+b); // 20
		System.out.println(a-b); // -10
		System.out.println(b-a); // 10
		System.out.println(a*b); // 75
		System.out.println(b/a); // 3 (Division("/") will give the value) 
		System.out.println(b%a); // 0 (Modulus("%") will give the reminder) */
	
//*************************************************************************************
//	2. Assignment Operator :->
//	==========================	
		/*  << =  +=  -=  *=  /=  %= >>  */
		
//		eg ->
		
	/*	int n = 20; // here 20 assign to n
		System.out.println(n += 10); // 30
		System.out.println(n -= 10); // 20
		System.out.println(n *= 10); // 200
		System.out.println(n /= 10); // 20
		System.out.println(n %= 10); // 0 */
		
//*************************************************************************************
//	3. Relational / Comparison Operator	:->
//	=======================================
		/*  <<  <   >   <=   >=  ==   !=  >>  */
//		Note -> Always relational operator will return boolean as output.   
//		eg ->
		
	/*	int a = 10;
		int b = 30;
		System.out.println(a<b); // true
		System.out.println(a>b); // false
		System.out.println(a<=b); // true
		System.out.println(a>=b); // false
		System.out.println(a==b); // false
		System.out.println(a!=b); // true */
		
//**************************************************************************************
//	4. Logical Operator :->	
//	=======================	
		/*  <<  &&  ||  !  >>  */
//		logical AND - "&&" (Both condition should be true)
//		logical OR - "||"  (Any one condition should be true)
//		logicaL NOR - "!"
//		                 login -> mail -> id && password
//		                 login -> netflix -> mob || mail
		
//		Note->
//		1. && will check both the condition, it reurn true when both the condition should true.
//	       If the 1st condition is false it not go for 2nd conditon, return direct false.
//	    2. || will return true if the 1st condition is true only. And if 1st conditon is not true 
//	       then it will check the 2nd condition.		
	    		
//		eg ->
		
	/*	int a = 15;
		int b = 25;
		int c = 15;
		System.out.println(a<b && b>c); // true
		System.out.println(a>b && a==c); // false
		System.out.println(a>c || a==c); // true
		System.out.println(b==a || c>a); // false
		System.out.println(a==c); //true
		System.out.println(!(a==c)); //false */
		
//************************************************************************************************
//	5. Unary Operator :->
//	=====================
		/*  <<  ++   --  >>  */
			                    
//		    ++ : increment by 1
//		            1. post increment (a++) 1st assign then increment
//		            2. pre increment  (++a) 1st increment then increment
		
//		    -- : decrement by 1
//		            1. post decrement (a--) 1st assign then decrement
//		            2. pre decrement  (--a) 1st decrement then increment
//		eg ->
		
		
	/*	int a = 5;
		System.out.println(a); // 5
		int b = a++;
		System.out.println(b); // 5
		System.out.println(a); // 6

		int c = 10;
		System.out.println(c); // 10
		int d = ++c; 
		System.out.println(d); // 11
		System.out.println(c); // 11
		
		int e = 15;
		System.out.println(e); // 15
		int f = e--;
		System.out.println(f); // 15
		System.out.println(e); // 14
		
		int g = 20;
		System.out.println(g); // 20
		int h = --g;
		System.out.println(h); // 19
		System.out.println(g); // 19 */
		
//*********************************************************************************************
//	6. Ternary Operator :->
//	=======================
		
//		condition ? true : false;
		
//		eg ->
		
		int a = 25;
		int b = 30;
		
		int max = (a>b) ? a : b;
		System.out.println(max);
		
		int c = 55;
		int d = 100;
		int e = 190;
		
		int big = (c>d) ? (c>e ? c : e) : (d>e ? d : e);
		System.out.println(big);
		
		
	}

}
