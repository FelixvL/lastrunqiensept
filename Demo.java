class Demo {  // DG
	public static void main(String... args){
	//	SpijkerStof sp = new Broek();
	//	Wasmachine w = new Wasmachine();
	//	w.wassen((Wasbaar)sp);
	//	System.out.println("Einde");
		Dier dier = new Slang();
		dier.lopen();
	}
}

class Organisme{
	void lopen(){
		System.out.println("in organisme");
	}
}

class Dier extends Organisme{
	
}
class Hond extends Dier{
	void lopen(){ //2
		System.out.println("in hond");
	}
}
class Slang extends Dier{

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









