class Demo {  // DL
	public static void main(String... args){
		Wasmachine wm = new Wasmachine();
		wm.wassen(new Broek());
		wm.wassen(new Blouse());
	}
}


class Wasmachine{
	void wassen(Kleding w){
		System.out.println("wasjes" + w.temperatuur);
		w.wassen();
	}
	
}

class Broek extends Kleding implements SpijkerStof{
	int temperatuur = 4;
}

class ZitPoef implements SpijkerStof{
	int temperatuur = 5;
}

class Kleding implements Wasbaar{
	int temperatuur = 6;
	public void wassen(){
		System.out.println("Wassen in Kleding");
	}
}

interface Wasbaar{
	void wassen();
}

interface SpijkerStof{

}

class Blouse extends Kleding{
	int temperatuur = 7;
}









