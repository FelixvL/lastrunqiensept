import java.io.*;
// XB
class Demo{
	public static void main(String[] args){
		RDW rdw = new RDW();
		Auto waggie = new SportAuto();
		Long l = rdw.rijexamen(waggie);
		System.out.println("ready"+l);
	}
}
class RDW{
	void rijexamen(Auto sa){
		sa.rijden();
	}
}
class Auto{
	int rijden() throws RuntimeException{
		System.out.println("riA");
		return 7;
	}
}
class SportAuto extends Auto{
	int rijden() throws IOException{
		System.out.println("riSA");
		return 9;
	}

}