// XG
class Demo{
	public static void main(String[] args){
		RDW rdw = new RDW();
		Auto waggie = new SportAuto();
		rdw.rijexamen(waggie);
		rdw.rijexamen(new Auto());
		System.out.println("ready");
	}
}
class RDW{
	void rijexamen(Auto sa){
		int getal;
		try{
			getal = sa.rijden();
		}catch(LekkeBandException e){
			System.out.println("opgelost");
		}
		System.out.println(getal);
	}
}
class Auto{
	int rijden() throws LekkeBandException {
		System.out.println("riA");
		return 7;
	}
}
class SportAuto extends Auto{
	int rijden() throws LekkeBandException{
		System.out.println("riSA");
		return 9;
	}

}
class LekkeBandException extends Exception{}