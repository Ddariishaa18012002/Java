class pr_trilogy {
	public static void main(String args[]) throws java.io.IOException {

		//Чтение с клавиатуры
		char ch;
		System.out.print("Нажмите клавишу на клавиатуре и ENTER: ");
		ch = (char) System.in.read();
		System.out.println("Вы нажали клавишу: " + ch);

                //Угадывание буквы
		//Пример использования проверки условий
		char answer = 'r';
		if (ch == answer)
			System.out.println("Буква указана верно");
		else
			System.out.println("Неверная буква");
        }
}	
