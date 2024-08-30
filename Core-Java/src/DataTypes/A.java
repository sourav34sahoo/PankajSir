package DataTypes;

public class A {
	byte b = 1;
	short s = 2;
	int i = 3;
	long l = 12l;
	float f = 12.35f;
	double d = 12.46732d;
	char ch = 'a';
	String st = "sourav";
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.b);  //1
		System.out.println(a1.s);  //2
		System.out.println(a1.i);  //3
		System.out.println(a1.l);  //12
		System.out.println(a1.f);  //12.35
		System.out.println(a1.d);  //12.46732
		System.out.println(a1.ch); //a
		System.out.println(a1.st); //Sourav
	}

}
