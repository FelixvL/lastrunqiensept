// VF
class Demo{
	public static void main(String[] args){
		Meedoen m = x -> x * 3;
		new Irr().gaan(m);
	}
}

interface Meedoen{
	default void ikdoemee(){
		System.out.println("in Meedoen");
	}
	int doen(int getal);
}

class Speler implements Meedoen{
	public int doen(int naam){
		System.out.println("Speler"+naam);
		return 7;
	}
}

class Irr {
	void gaan(Meedoen r){
		System.out.println(r.doen(5));
	}
}

