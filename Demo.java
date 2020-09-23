// VH
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
	int doen();
}
class Irr {
	void gaan(Meedoen r){
		System.out.println(r.doen(5));
	}
}

