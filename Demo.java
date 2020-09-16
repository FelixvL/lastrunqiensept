class Demo {  // DD
	public static void main(String... args){
		SpijkerStof sp = new Broek();
		Wasmachine w = new Wasmachine();
		w.wassen((Wasbaar)sp);
		System.out.println("Einde");
	}
}
class Wasmachine{
	void wassen(Wasbaar w){
		System.out.println("wasjes");
		w.wassen();
	}
	
}

class Broek extends Kleding implements SpijkerStof{

}

class ZitPoef implements SpijkerStof{

}

class Kleding implements Wasbaar{
	void wassen(){
		System.out.println("Wassen in Kleding");
	}
}

interface Wasbaar{
	void wassen();
}

interface SpijkerStof{

}

class Blouse extends Kleding{

}









