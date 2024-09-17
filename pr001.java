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
	}
}


