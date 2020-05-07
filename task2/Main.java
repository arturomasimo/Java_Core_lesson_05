package lession5_1;

public class Main {

	public static void main(String[] args) {
		
		Summa x1 = new Summa ();
		System.out.println("екземпляр класу Х1 з конструктором без змінних ");
		System.out.println(x1);
		
		System.out.println();
		
		Summa x2 = new Summa (10);
		System.out.println("екземпляр класу Х2 з конструктором на 1 змінну ");
		System.out.println(x2);
		System.out.println(x2.GetSumma(4));
		System.out.println(x2.GetSumma(12,8));
		System.out.println();
		
		Summa x3 = new Summa (2,3);
		System.out.println("екземпляр класу Х3 з конструктором на 2 змінних ");
		System.out.println(x3);
		System.out.println(x3.GetSumma(4));
		System.out.println(x3.GetSumma(12,8));
		System.out.println();

		Summa x4 = new Summa (2,10, 100);		
		System.out.println("екземпляр класу Х4 з конструктором на 3 змінних ");
		System.out.println(x4);
		System.out.println(x4.GetSumma(4));
		System.out.println(x4.GetSumma(12,8));
		System.out.println();
		
		x4 = x4.GetSumma(100);
		System.out.println("екземпляр класу Х4 із збільшеням на 100");
		System.out.println(x4);
		System.out.println(x4.GetSumma(4));
		System.out.println(x4.GetSumma(12,8));
		System.out.println();
		
	}

}
