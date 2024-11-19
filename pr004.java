class Avtomobil {
	private int pass; //количество пассажиров
	private int v; //объём топливного бака в л.
	private double rash; //расход топлива в л. на 100 км.
	
	Avtomobil(int p, int V, double r) {
		pass = p;
		v = V;
		rash = r;
	}

	void rasst() {
		System.out.println("Расстояние  на полном баке: " + ((int)(v/rash *100)));
        }

        int rasst2() {
	        return (int)(v/rash *100);
	}
	double fuelNeeded(int km) {
		return ((double)km/100)*rash;
	}

	//методы доступа к переменным экземпляра
	int getPass() {
		return pass;
	}
	void setPass(int p) {
		pass = p;
	}
	int getV() {
		return v;
	}
	void setV(int V) {
		v = V;
	}
	double getRash() {
		return rash;
	}
	void setRash(double r) {
		rash = r;
	}	
}
class Truck extends Avtomobil {
	private int cargocap; //грузоподъемность

	//конструктор
	Truck(int p, int V, double r, int c) {
		super(p, V, r);
		cargocap = c;
	}

	int getCargo() {
		return cargocap;
	}
	void putCargo(int c) {
		cargocap = c;
	}
}
class pr004 {
	public static void main(String args[]) {
		//Создание экземпляра класса
	        Avtomobil lada = new Avtomobil(4, 40, 5.5);
		Avtomobil porshe = new Avtomobil(1, 100, 14.0);
		Truck gazelnext = new Truck(2, 100, 25.5, 3500);
		Truck ural = new Truck(3, 200, 35.1, 5000);
	        int rasst, rasst2;

	        //Присваивание значения внутренним переменным экземпляра класса
		/*
	        lada.pass = 4;
	        lada.v = 40;
	        lada.rash = 5.5;

		porshe.pass =1;
		porshe.v = 100;
                porshe.rash =14.0;
		*/

		System.out.println("Для расстояния в 10 км ладе нужно " + lada.fuelNeeded(10) + "литров бензина");
		System.out.println("Для расстояния в 10 км уралу нужно " + ural.fuelNeeded(10) + "литров бензина");
		System.out.println("урал перевезет " + ural.getCargo() + "кг. грузов");
		System.out.println("Для расстояния в 10 км газели нужно " + gazelnext.fuelNeeded(10) + "литров бензина");
		rasst=10;
		System.out.println("Для расстояния в 10 км порше нужно " + porshe.fuelNeeded(rasst) + "литров бензина");

		
		//Расчет расстояния, которое lada проедет на полном баке
		//rasst = (int) (lada.v/lada.rash * 100);
		//rasst2 = (int) (porshe.v/porshe.rash * 100);

		System.out.print("Для Lada: ");
		lada.rasst();
		rasst = lada.rasst2();
		System.out.println("Результат Вызова метода rasst2(): " + rasst);

		System.out.print("Для Porshe: ");
		porshe.rasst();
		System.out.println("Результат Вызова метода rasst2(): " + porshe.rasst2() );
        }
}
     
