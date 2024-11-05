//очередь
class Queue {
	private char[] q;
	private int putloc, getloc; //указатель на элементы очереди

	//конструктор создающий очередь на базе массива с размером size
	

	public Queue (int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	//конструктор очереди на основе объекта Queue
	Queue(Queue ob) {
		//установка указателей
		putloc = ob.putloc;
		getloc = ob.getloc;
		//выделение места под массив
		q = new char[ob.q.length];
		//копирование элементов
		for(int i=getloc; i < putloc; i++)
			q[i] = ob.q[i];
	}
	//конструктор очереди с начальными значениями
	Queue(char[] a) {
		putloc = 0;
		putloc = 0;
		q = new char[a.length];

		for(int i=0; i < a.length; i++)
                        put(a[i]);
	}



	//метод для помещения символа в очередь
	public void put(char ch) {
		if(putloc==q.length) {
			System.out.println(" - невозможно вставить символ, так как очередь переполнена.");
			return;
		}
		q[putloc++] = ch;
	}

	//метод для извлечения символа из очереди
	public char get() {
		if(getloc == putloc) {
			 System.out.println(" -  невозможно извлечь символ, так как очередь пуста");
			 return (char) 0;

		}
		return q[getloc++];
	}
}

class QDemo {
	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("использование очереди bigQ  для сохранения символов");
		for(i=0; i < 26; i++)
			bigQ.put((char) ('A' + i));

		//извлекаем элементы из очереди bigQ
		System.out.print("содержимое bigQ: ");
		for(i=0; i < 25; i++) {
			ch = bigQ.get();
			if(ch != (char) 0)
				System.out.print(ch);
		}
		System.out.println("\n");

		//использование очереди smallQ
		for(i=0; i < 5; i++) {
			System.out.print("попытка сохранения " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		System.out.print("содержимое smallQ: ");
		for(i=0; i < 5; i++) {
                        ch = smallQ.get();
                        if(ch != (char) 0) System.out.print(ch);
		}
		
		//bigQ.q[3] = 'E'; попытка изменения значения у закрытой переменной класса Queue
		//bigQ.putloc = 50; попытка изменения закрытого указателя в классе Queue

		Queue q1 = new Queue(10);
		char[] name = {'I', 'v', 'a', 'n'};

		Queue q2 = new Queue(name);

                System.out.println();
		int i2;

		for(i2=0; i2 < 10; i2++) 
                        q1.put((char) ('A' + i2));

		Queue q3 = new Queue(q1);
		System.out.print("содержимое q1: ");
		for(i2=0; i2 < 10; i2++)
                        ch = q1.get();
			System.out.print(ch);
		}
		System.out.println("\n");

		System.out.print("содержимое q2(на базе массива): ");
                for(i2=0; i2 < 4; i2++)
                        ch = q2.get();
                        System.out.print(ch);
                }
                System.out.println("\n");

		System.out.print("содержимое q3(на базе очереди q1): ");
                for(i2=0; i2 < 10; i2++)
                        ch = q3.get();
                        System.out.print(ch);
                }
                System.out.println("\n");


	}
}


