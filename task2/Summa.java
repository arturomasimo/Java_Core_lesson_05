package lession5_1;

public class Summa {
	private int a;
	private int b;
	private int c;
	// перевантажую конструктори
	public Summa () {
		this.a=0;
		this.b=0;
		this.c=0;
	}
	
	public Summa (int a) {
		this.a=a;
		this.b=0;
		this.c=0;
	}	
	
	public Summa (int a, int b) {
		this (a);
		this.b = b;
		this.c =0;
		}
	public Summa (int a, int b, int c) {
		this (a, b);
		this.c =c;
	}
	void SetSumma (int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
// перевантажую методи	
	public Summa GetSumma (int x) {
		Summa r = new Summa();
		r.a = a*x;
		r.b= b*x;
		r.c= c*x;
		return r;
	}
	public Summa GetSumma (int x, int y) {
		Summa r = new Summa();
		r.a = a*(x+y);
		r.b = b*(x+y);
		r.c = c*(x+y);
		return r;
		
	}

	@Override
	public String toString() {
		return "Summa [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	
	
	}
	


