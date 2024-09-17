class pr001 {
	public static void main(String args[]) {
		System.out.println("Первая программа на Java");
		//Выводим строку на консоль
		int Var1 = 1024;
		int Var2345678;
		//System.out.println(Var2345678); Ошибка: переменной не присвоено значение 
		Var2345678 = 411;
		System.out.println(Var1/2);
                System.out.println("Результат целочисленного деления: " + Var2345678/2);
		System.out.println("Результат деления приведением типа данных: " + (double)Var2345678/2);

		double Var3 = (double)Var2345678/2;

		//Пример использования оператора if
		//if(Var1 = 0)
		//      System.out.println("Условие Var1=0 выполнено"); Несовместимость типов в условии
                if(Var1/2 == 512)
			System.out.println("Условие \" Var1/2==512\" выполнено");
		if(true)
		System.out.println("Строка для проверки");

		//Пример использования оператора for
		for (int i=0; i<10; i++)
			System.out.println("Строка номер " + i);
		//i = 10; Переменная i локальная и существует только во время выполнения цикла
                System.out.println();
		int j;
		for (j=0; j<10; j++)
			System.out.println(j + " ");
		System.out.println();
	}
}	
