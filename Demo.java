class Demo {  // DO
	public static void main(String... args){
		Wasmachine wm1 = new Wasmachine();
		Wasmachine wm2 = new Wasmachine();
		wm2.wassen(null);
		wm1.wassen(new Broek());
		System.out.println(wm1.gewicht);
	}
}
class Wasmachine{
	static int gewicht = optillen();
	void wassen(Kleding w){
		if(w == null){
			gewicht = 10;
			return;
		}
		System.out.println("wasjes" + w.temperatuur);
		w.wassen();
	}
	int optillen(){
		System.out.println("aan het optillen");
		return 9;
	}	
}
class Broek extends Kleding{
	int temperatuur = 4;
}
class Kleding implements Wasbaar{
	int temperatuur = 6;
	public void wassen(){
		System.out.println("Wassen in Kleding"+ temperatuur);
	}
}
interface Wasbaar{
	void wassen();
}
class Blouse extends Kleding{
	int temperatuur = 7;
	public void wassen(){
		System.out.println("Blouse"+temperatuur);
	}
}









