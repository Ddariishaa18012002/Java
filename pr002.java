class pr002 {
	public static void main(String args[]) {
		byte b, bb, bbb; //8 bits
		short s, ss, sss; //16 bits
		int i, ii, I; //32 bits
		long l, ll, L; //64 bits
		b = 127;
		bb = (byte)130;
		s = 32000;
		ss = (short)33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;
		///bbb = sss; Автопреобразования нету, пишем byte, short, int - ручками
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);
		System.out.println();
				
		//Пример использования разных целых типов :
		ii = 700000; // длина в миллиметрах
		int V = ii * ii * ii; // находим объем
		System.out.println("Объем куба: " + V);
		long VV = (long)ii*ii*ii;
		System.out.println("Объем куба, правильный: " + VV);

		double d, dd;
		d = b/2;
		System.out.println("d + " + d);
		dd = (double)b/2;
		System.out.println("dd = " + dd);

		//Символьный тип данных
		System.out.println("Примеры использования символьного типа\n"); 
		char ch; 
		ch = 'D';
		System.out.println("Значение ch: " + ch);
		ch++;
		System.out.println("Новое значение ch: " + ch);
		ch = 97;
		System.out.println("Новейшее значение ch, с кодом 97: " + ch);
		I = (int)ch;
		System.out.println("I int ch: " + I);
		ch = 'А';
		for (i=0; i<63; i++) {
			I = (int)ch;
			System.out.print("Код символа " + ch + ": " + I + " \n");
			ch++;
		}

		//Логический тип данных
		System.out.println("Примеры использования логического типа\n");
		boolean bool;
		bool = false;
		System.out.println("Значение bool: " + bool);
		bool = true;
		System.out.println("Новое значение bool: " + bool);
		if(bool)
			System.out.println("Вывод строки, если bool - true");
		if(!bool)
			System.out.println("Вывод строки, если инверсия bool - true");
		bool = ch=='я';
		if(bool)
			System.out.println("Символ ch равен букве - я, ");

		//Логическое операции над значениями 
		System.out.println("\n");
		boolean p, q;
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		p = true; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));

		p = true; q = false;
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (!p));

		p = false; q = true;
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (!p));

		p = false; q = false;
                System.out.print(p + "\t" + q + "\t");
                System.out.print((p&q) + "\t" + (p|q) + "\t");
                System.out.println((p^q) + "\t" + (p|q) + "\t");
		
		//Пример неожиданного повышения типов данных
		System.out.println("\n");
		byte b11;
		int i11;
		b11 = 10;
		i11 = b11 * b11;

		b11 = 10;
		b11 = (byte)(b11 * b11);
		System.out.println("i11 и b11: " + i11 + " " + b11);
	}
}

