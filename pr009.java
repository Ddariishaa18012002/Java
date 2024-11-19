//Основы наследования
class TwoDShape {
	private double width;
	private double height;
	int common;
	//конструктор без параметров
	TwoDShape() {
		width = height = 0.0;
	}
	//конструктор с двумя параметрами
	TwoDShape(double w, double h) {
		width = w; 
		height = h;
	}
	//конструктор объекта с одинаковой высотой и шириной
	TwoDShape(double x) {
                width =  height = x;
        }
	void showDim() {
		System.out.println("Ширина и высота: " + width + " и " + height);
	}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		if(w>200)
			width = 200;
		else width = w;
	}
	void setHeight(double h) {
		if(h>290)
			width = 290;
		else height = h;
	}
}
class Triangle extends TwoDShape {
	String style;

	//Конструктор по умолчанию
	Triangle() {
		super();
		style = "отсутствует";
	}
	//конструктор с тремя параметрами
	Triangle (String s, double w, double h) {
		//вызов конструктора суперкласса
		super(w, h);
		//Установка значений для переменной подкласса
		style = s;
	}
	//конструктор с одним параметром
	Triangle(double x) {
		super(x);
		style = "закрашенный";
	}
	// конструктор с демонстрацией доступа к одноименной переменной суперкласса
	Triangle(int a, int b) {
		super.common = a;
		common = b;
		System.out.println("значение common в суперклассе: " + super.common);
		System.out.println("значение common в подклассе: " + common);
	}

	double area() {
		return getWidth()*getHeight()/2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	}
}
class Rectangle extends TwoDShape {
	String outline;
	int common;

	//Конструкторы
	Rectangle() {
		super();
		outline = "отсутствует";
	}

	Rectangle (String o, double w, double h) {
		//вызов конструктора суперкласса
		super(w, h);
		//Установка значений для переменной подкласса
		outline = o;
	}

	Rectangle(double x) {
                super(x);
                outline = "сполошная";
	}

	double area() {
		return getWidth()*getHeight();
	}
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	void showOutline() {
		System.out.println("Рамка: " + outline);
	}
}
class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle("контурный", 8.0, 12.0);
		Triangle t3 = new Triangle(4.0);
		Triangle t4 = new Triangle(5,10);
		Rectangle r1 = new Rectangle("сплошная", 4.0, 4.0);
		Rectangle r2 = new Rectangle(5.0);
		System.out.println();
/*
		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "закрашенный";
		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "контурный";
		r1.setWidth(4.0);
		r1.setHeight(4.0);
		r1.outline = "сплошная";
		r2.setWidth(8.0);
		r2.setHeight(12.0);
		r2.outline = "пунктирная";
*/
		t1 = t2;

		System.out.println("Информация об объекте t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь: " + t1.area());
		System.out.println();
		System.out.println("Информация об объекте t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Площадь: " + t2.area());
		System.out.println();

		System.out.println("Информация об объекте t3: ");
                t2.showStyle();
                t2.showDim();
                System.out.println("Площадь: " + t3.area());
                System.out.println();

		System.out.println("Информация об объекте r1: ");
		r1.showOutline();
		r1.showDim();
		if(r1.isSquare())
			System.out.println("Является квадратом");
		else
			System.out.println("Не является квадратом");
		System.out.println("Площадь: " + t1.area());
		System.out.println();
		System.out.println("Площадь: " + t2.area());
		System.out.println();
		System.out.println("Информация об объекте r2: ");
		r1.showOutline();
		r1.showDim();
		if(r2.isSquare())
			System.out.println("Является квадратом");
		else
			System.out.println("Не является квадратом");
		System.out.println("Площадь: " + t2.area());
		System.out.println();

		}
}
