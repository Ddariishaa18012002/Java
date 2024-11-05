// управление доступом к членам класса
class Mod {
        private int alpha; //закрытая переменная
                public int beta; //открытая переменная
                int gamma; //переменная с доступом по умолчанию
                void setAlpha(int a) {
                        alpha = a;
                }
                int getAlpha() {
			return alpha;
                }

}
//пример передачи объектов методам
class Block {
	int a, b, c;
	int V;

	Block(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		V = a * b * c;
	}

	//проверка эквивалентности двух параллелепипедов
	boolean sameBlock(Block ob) {
		if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
		else return false;
	}

	//проверка равенства объемов
	boolean sameV(Block ob) {
		if(ob.V == V) return true;
		else return false;
        }
}
// класс отказоустойчивого массива
class FailSoftArray {
	private int[] a;
	private int errval;
	public int length;

	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	public int get(int index) {
		if(indexOK(index)) 
			return a[index];
		return errval;
		
	}
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	private boolean indexOK(int index) {
		if(index >=0 & index < length)
			return true;
		return false;
	}
}
//класс для метода с передачей параметров по значению
class CallByValue {
	void noChange(int i11, int j11) {
		i11 = i11 + j11;
		j11 = -j11;
	}
}
//класс для вызова метода с передачей параметров по ссылке
class CallByRef {
	int a12, b12;
	CallByRef (int i12, int j12) {
		a12 = i12;
		b12 = j12;
	}
	void change(CallByRef ob5) {
                ob5.a12  = ob5.a12 + ob5.b12;
                ob5.b12 = -ob5.b12;
        }
}
// класс для возвращения объекта при возврате метода
class ErrorMsg {
	String[] msgs = {
		"ошибка вывода",
		"ошибка ввода",
		"переполнение диска",
		"выход индекса за границы диапазона"
	};
	//возврат сообщения об ошибке
	String getErrorMsg(int i13) {
		if(i13>=0 & i13<msgs.length) return msgs[i13];
		else return "отсутствует код ошибки";
	}
}

//возврат объекта определенного в программе

class Err {
	String msg; // сообщение об ошибке
	int severity; // уровень серьезности ошибки
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}
class  ErrorInfo {
	String[] msgs2 = {
                "ошибка вывода",
                "ошибка ввода",
                "переполнение диска",
                "выход индекса за границы диапазона"
        };
	int[] howBad = {3, 3, 2, 4};
	Err getErrorInfo(int i14) {
		if(i14 >= 0 & i14 < msgs2.length)
			return new Err(msgs2[i14], howBad[i14]);
		else
			return new Err("отсутствует код ошибки", 0);
	}

}

//перегрузка методов
class Overload {
	void ovlDemo() {
		System.out.println("без параметров");
	}
	void ovlDemo(int a15) {
                System.out.println(" один параметр типа int: " + a15);
        }
	int ovlDemo(int a15, int b15) {
		System.out.println("два  параметра типа int: " + a15 + " " + b15);
		return a15+b15;
        }
	double ovlDemo(double a15, double b15) {
                System.out.println("два  параметра типа double: " + a15 + " " + b15);
                return a15-b15;
        }
}

//влияние автопреобразование типов на перегрузку методов
class Overload2 {
        void f(int x) {
		System.out.println("внутри f(int): " + x);
	}
	void f(double x) {
                System.out.println("внутри f(double): " + x);
        }
	void f(byte x) {
                System.out.println("внутри f(byte): " + x);
        }

}

class pr007 {
	public static void main(String[] args) {
		Mod ob = new Mod();
		//Измнение закрытой переменной осуществляется через методы, заданные внутри класса  Mod
		ob.setAlpha(77);
		System.out.println("Значение ob.alpha: " + ob.getAlpha());
		
		//прямой доступ к переменной запрещен: ob.alpha = 100;
		ob.beta = 242;
		ob.gamma = 34;

		//пример использования класса отказа устойчивого поведения массива
		System.out.println();
		FailSoftArray fs = new FailSoftArray(5, -999);
		int x;

		//пример работы класса без вывда сообщений о неправилтных индексах
		
		System.out.println("скрытая от пользователя обработка ошибок:");
		for(int i=0; i<(fs.length * 2); i++)
			fs.put(i, i*10);
		for(int i=0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -999) System.out.print(x + " ");
		}
		System.out.println();

		// пример работы класса с выводом сообщений об ошибках

		for(int i=0; i < (fs.length * 2); i++) 
                        if(!fs.put(i, i*10))
				System.out.println("индекс " + i + " выходит за границы массива");
		for(int i=0; i < (fs.length * 2); i++) {
                        x = fs.get(i);
                        if(x != -999) System.out.print(x + " ");
			else
				System.out.println("индекс " + i + " выходит за границы массива");
		}
		System.out.println();
		
		// пример использования методов класса с параметрами в виде объектов(класс Block)
		System.out.println();
		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);
		System.out.println("ob1 эквивалентен по размерам ob2: " + ob1.sameBlock(ob2));
		System.out.println("ob1 эквивалентен по размерам ob3: " + ob1.sameBlock(ob3));
		System.out.println("ob1 эквивалентен по объему  ob3: " + ob1.sameBlock(ob3));

		//пример передачи параметров объекту по значению
		System.out.println();
		CallByValue ob4 = new CallByValue();
		int a11 = 15, b11 = 20;

		System.out.println("a11 и b11 перед вызовом: " + a11 + " " + b11);

		ob4.noChange(a11, b11);
		System.out.println("a11 и b11 после  вызова метода ob4.noChange: " + a11 + " " + b11);
		//при передаче параметров методу объекта по значению, значение аргументов не изменяются
		
		//пример передачи параметров по ссылке
		System.out.println();
		CallByRef ob6 = new CallByRef(15, 20);

		System.out.println("ob6.a12 и ob6.b12 перед вызовом: " + ob6.a12 + " " + ob6.b12);
		ob6.change(ob6);
		System.out.println("ob6.a12 и ob6.b12 после  вызова метода ob6.noChange: " + ob6.a12 + " " + ob6.b12);

		System.out.println();
		//пример возврата строки при выполнении метода
		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(20));

		System.out.println();
		//пример возврата произвольного объекта определенного в программе
		ErrorInfo err2 = new ErrorInfo();
		Err e;
		e = err2.getErrorInfo(2);
		System.out.println(e.msg + ", уровень серьезности: " + e.severity);
		e = err2.getErrorInfo(20);
                System.out.println(e.msg + ", уровень серьезности: " + e.severity);

		//демонстрация перегрузки методов(overload)
		Overload ob7 = new Overload();
		int resI;
		double resD;

		ob7.ovlDemo();
		System.out.println();
		ob7.ovlDemo(2);
                System.out.println();
		resI = ob7.ovlDemo(4, 6); 
		System.out.println("результат вызова ob7.ovlDemo(4, 6): " + resI);
		System.out.println();
		resD = ob7.ovlDemo(5.1, 3.5);
		System.out.println("результат вызова ob7.ovlDemo(5.1, 3.5): " + resD);
		System.out.println();

		//перегрузка с автопреобразованием типов
		Overload2 ob8 = new Overload2();
		int i18=10;
		double d18 = 10.1;
		byte b18 = 99;
		short s18 = 10;
		float f18 = 11.5F;
		ob8.f(i18);
		ob8.f(d18);
		ob8.f(b18);
                ob8.f(s18);
		ob8.f(f18);
	




	}
}
 



