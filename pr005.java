//Массивы и строки

class Arrays {
	public static void main(String args[]) {
		int[] sample = new int[10];
		int sample1[] = new int[10];
		int i;

		for(i = 0; i < 10; i++)
			sample[i] = 2*i;
		for(i = 0; i < 10; i++)
			System.out.println("Элемент массива с индексом " + i + ": " + sample[i]);
                //Поиск мин и макс значения в массиве
		System.out.println();
		sample1[0] = 99;
		sample1[1] = 20;
		sample1[2] = 90;
		sample1[3] = -242;
		sample1[4] = -20;
		sample1[5] = 3;
		sample1[6] = 53;
		sample1[7] = 51;
		sample1[8] = -67;
		sample1[9] = 22;
		// sample1[10] = 423; - Выход за границы массива вызывает ошибку периода исполнения
		int max, min;
		min = max = sample1[0];
		for (i = 1; i < 10; i++) {
			if (sample1[i] < min) min = sample1[i];
			if (sample1[i] > max) max = sample1[i];
		}
		System.out.println("Минимальное и максимальное значения: " + min + " " + max);

		//Инициализация массива
		System.out.println();
		int[] sample2 = {87,100,-42, 34, 25, -25, -424, 62, 74, 8};
		min = max = sample2[0];
                for (i = 1; i < 10; i++) {
                        if (sample1[i] < min) min = sample2[i];
                        if (sample1[i] > max) max = sample2[i];
                }
                System.out.println("Минимальное и максимальное значения: " + min + " " + max);

		//Пузырьковая сортировка массива
		System.out.println();
		int size = sample2.length;
		int a, b, t;
		//Отображение исходного массива
		System.out.print("исходный массив");
		for(i=0; i < size; i ++)
			System.out.println(" " + sample2[i]);
		System.out.println();

		//собственно сортировка
		for(a=1; a < size; a ++)
			for(b= size-1; b >= a; b--) {
				if(sample2[b-1]>sample2[b]) {
					t = sample2[b-1];
					sample2[b-1] = sample2[b];
					sample2[b] = t;
				}
			}

		//отображение отсортированного массива
		System.out.print("Отсортированный массив");
		for(i=0; i < size; i ++)
                        System.out.println(" " + sample2[i]);
                System.out.println();

		//Двумерные массивы
		System.out.println();
		int [][] arr2D = new int [10][20];
		int t2, i2; 
		for(t2=0; t2<10; t2++) {
			for(i2=10; i2<30; i2++) {
				arr2D[t2][i2-10] = (t2*100)+i2+1;
				if (t2==0)
				       	System.out.print(arr2D[t2][i2-10] + " ");
				else
					System.out.print(arr2D[t2][i2-10] + " ");
			}
			System.out.println();
		}

		//Двумерный массив с разным количеством элементов в строке
		System.out.println();

		int [][] riders = new int[7][];
		riders[0] = new int[10];
		riders[1] = new int[10];
		riders[2] = new int[10];
                riders[3] = new int[10];
		riders[4] = new int[10];
                riders[5] = new int[2];
		riders[6] = new int[2];

		for(int i3=0; i3<7; i3++)
			for(int j3=0; j3<riders[i3].length; j3++)
				riders[i3][j3] = i3 + j3 + 10;
		
		System.out.println("Количество пассажиров в рабочие дни недели: ");
		for(int i3=0; i3<5; i3++){
                        for(int j3=0; j3<riders[i3].length; j3++)
                                System.out.print(riders[i3][j3]  + " ");
	       		System.out.println();
		}
		
		System.out.println();
		System.out.println("Количество пассажиров в выходные  дни: ");
                for(int i3=5; i3<7; i3++){
                        for(int j3=0; j3<2; j3++)
                                System.out.print(riders[i3][j3] + " ");
                        System.out.println();
		}

		//Ссылки на массивы
		System.out.println();
		for (int i3=0; i3<10; i3++)
			sample[i3] = i3;
		for (int i3=0; i3<10; i3++)
                        sample1[i3] = -i3;

                System.out.println("Массив sample[]:");
		for (int i3=0; i3<10; i3++)
                        System.out.println(sample[i3] + " ");
                System.out.println();
		System.out.println("Массив sample[]:");
		for (int i3=0; i3<10; i3++)
                        System.out.print(sample[i3] + " ");
                System.out.println();
		System.out.println("sample[]: " + sample + " sample1[]: " + sample1);
		sample1 = sample;
		sample1[4] = 1111;
		System.out.println("Массив sample[] после изменения элемента с индексом 4 в sample1[]:");
		for (int i3=0; i3<10; i3++)
                        System.out.print(sample[i3] + " ");
                System.out.println();
                System.out.println("sample[]: " + sample + " sample1[]: " +  sample1);
		
		//копирование массива
		System.out.println();
		int[] sample3 = new int[10];
		for (int i3=0; i3<10; i3++)
			sample3[i3] = -i3;
		if(sample1.length >= sample3.length)
			for(int i3=0; i3<sample3.length; i3++)
				sample1[i3] = sample3[i3];

		//вывод содержимого sample1 после копирования
		System.out.println("Массив  sample1[] после копирования:");
		for (int i3=0; i3<sample1.length; i3++)
                        System.out.print(sample[i3] + " ");
		System.out.println();

				//Цикл "for-earh"
		System.out.println();
		int summ = 0;
		for (int i3=0; i3<10; i3++)
			summ += sample3[i3];
		System.out.println(summ);

		summ = 0;
		for (int x : sample3) {
			System.out.println("Очередное значение: " + x);
			summ += x;
		}
		System.out.println(summ);

		//for-earh для двухмерного массива
		summ = 0;
		int val = 22;
		boolean found = false;
		for(int[] x : riders) {
			for(int y : x) {
				if(y == val) {
					found = true;
					break;
				}
				System.out.println("Значение: " + y);
				summ += y;
			}
			System.out.println("Новая строка массива");
		}
		System.out.println("Сумма: " + summ);
		if(found)
			System.out.println("Значение найдено");


				//Работа со строками
		System.out.println();
		String str1 = new String("СтрокаAC");
		String str2 = "СтрокаAB";
		String str3 = new String(str2);
		String str4 = new String(str2);
		//Эксперементы со ссылочными переменными str2 и str3
		str3  = str2;
		System.out.println(str3 + " " + str2);
		if (str3 == str2)
			System.out.println("Ссылки указывают на один и тот же объект");
		str2 = "Новая строка 2, строка взамен str2";
		System.out.println(str3 + " " + str2);
		if (str3 == str2)
			System.out.println("Ссылки указывают на один и тот же объект");
		else
			System.out.println("Ссылки указывают на разные объекты");

		//Методы, выполняемые для строковых объектов
		//Методы сравнения строк
		System.out.println();
		if (str1.equals(str2))
			System.out.println("Строки str1 и str2 равны");
		else
			System.out.println("Строки str1 и str2 не равны");
		if (str3.equals(str4))
                        System.out.println("Строки str3 и str4 равны");
                else
                        System.out.println("Строки str3 и str4 не равны");
		//Использование оператора сравнения для проверки равенства ссылок str1 и str2
		if(str1==str2)
			System.out.println();

		int result;
		result = str1.compareTo(str3);
		System.out.println("Результат сравнения строк: " + result);

		//Определение длины строки
		System.out.println("Длина строки str1: " + str1.length());

		//Возврат символа в строке по номеру индекса
		System.out.println("Первый символ в строке str1: " + str1.charAt(0) + "\n" + ((int)str1.charAt(1)));
		char ch;
		for (int i3 = 0; i3 < str1.length(); i3++)
			System.out.print(str1.charAt(i3));
		System.out.println();

		//Возврат индекса, с которого начинается подстрока
		System.out.println("Первое вхождение подстроки \"рок\" в str2: " + str2.indexOf("рок"));

		System.out.println("Последнее вхождение подстроки \"рок\" в str2: " + str2.lastIndexOf("рок"));

		//Массивы строк
		//
		System.out.println();
		String[] strs = {"Элеметы","строкого","массива","для","примера"};
		System.out.println("Исходный массив: ");
		for (String s : strs)
			System.out.println(s + " ");
		System.out.println("\n");

		strs[1] = "изменённого строкового";
		strs[3] = "для ещё одного";

		System.out.println("Изменённый массив: ");
		for (String s : strs)
			System.out.print(s + " ");
		System.out.println("\n");

		//Использование подстрок
		str2 = "";
		for (String s : strs)
		str2 += " " + s;
		System.out.println("Строка str2: " + str2);
		String substr = str2.substring(10, 33);
		System.out.println("Строка str2: " + str2 + "\nПодстрока substr: " + substr);


		//Оператор switch, управляемый строками
		//
		String command = "";
		switch(command) {
			case "connect":
				System.out.println("Подключение");
				break;
			case "cancel":
                                System.out.println("Отмена");
                                break;
			case "disconnect":
				System.out.println("Отключение");
                                break;
			default:
				System.out.println("Неверная команда");
                                break;

		}

		//Текстовые блоки
		String str5 = """
			просто текст
			Lorem ipsum dolor sit amet,
			consectetur adipiscing elit,
			sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
		Ещё один текст
		 Ut enim ad minim veniam,
		quis nostrud exercitation ullamco
		laboris nisi ut aliquip ex ea commodo consequat.
	       	Duis aute irure dolor in reprehenderit in
		voluptate velit esse cillum dolore eu
		fugiat nulla pariatur. Excepteur sint
		occaecat cupidatat non proident,
		sunt in culpa qui officia deserunt mollit anim id est laborum.

			""";
		System.out.println("Текстовый блок str5: " + str5);

		//Аргументы командной строки
		//
		System.out.println("""
				1
				2
				3
				""");
		System.out.println("Программе передано " + args.length + " аргументов");
		System.out.println("Список аргументов: ");
		for (String s : args)
			System.out.println();
	}
}
