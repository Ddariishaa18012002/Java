class help {
	public static void main(String args[]) throws java.io.IOException {
		char choice;
	        System.out.println("Справка по операторам: ");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" Выберите номер раздела:  ");
		chooce = (char) System.in.read();

		System.out.println("\n");
		switch(choice) {
			case '1':
				System.out.println("Оператор if:\n");
                                System.out.println("if(условие) оператор;");
                                System.out.println("else оператор;");
				break;
			case '2':
				System.out.println("Оператор switch:\n");
                                System.out.println("switch (выражениe) {");
                                System.out.println(" case константа:");
				System.out.println("  последовательность операторов");
                                System.out.println("  break;");
                                System.out.println(" ... ");
				System.out.println("} ");
                                break;
			default:
				System.out.println("Неверный выбор раздела");
                 }
	}
}




                

