
public class Class1 {

	public static void main(String[] args) {
System.out.print("hello");
	}
//chiffre
	// Entiers du plus grand au plus petit 
	long monLong = 0;
	int monEntier = 1; //99%
	short monShort = 2;
	byte monByte = 3;

//flot 
	double monDouble = 3.5;
	
	float monFloat = (float)6.3;

	
	//bool
	boolean monBoolean = true;  // true ou false 

// char
	char monChar = 'v';
	char monChar2 = 25;
	int m = 'r';
	
	String maChaine = "maChaine";
	maChaine = null;
	monChar = null;   // c faux un  type primitif ne peut pas valoir null// 
	
	
	// maChaine = null; 
	System.out.pintln(maChaine.charAt(3)); 
	
//transformer un chiffre en chaine de caracteres 

	
	int aa = 3;
	String g = ""+aa; // "3"
	String g = String.valueOf(aa);
	
	
	
	aa += 5; // aa = aa + 5;
	
	aa++;
	++aa; 
	
	
	boolean bb = 5>3; 
	
	boolean bb = (aa!=5) ? false : (1 == 3) ? false : true;
	
	
}




