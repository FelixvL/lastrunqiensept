// XA
class Demo{
	public static void main(String[] args){
		RDW rdw = new RDW();
		SportAuto waggie = new SportAuto();
		rdw.rijexamen(waggie);
		System.out.println("ready");
	}
}
class RDW{
	void rijexamen(SportAuto sa){
		sa.rijden();
	}
}
class Auto{
	int rijden() throws Exception{
		System.out.println("riA");
		return 7;
	}
}
class SportAuto extends Auto{
	int rijden(){
		System.out.println("riSA");
		return 9;
	}

}