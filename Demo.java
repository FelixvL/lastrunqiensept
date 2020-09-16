class Demo {  // DI
	public static void main(String... args){
		Wasmachine wm = new Wasmachine();
		wm.wassen(new Broek());
		wm.wassen(new Blouse());
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

}









