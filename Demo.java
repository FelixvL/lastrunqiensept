class Demo {  // CA
	public static void main(String... args){
		Arts karel = new Arts();
		karel.BelleBellen();
	}
}
abstract class Arts{

}
class Chirurg extends Arts{
	void BelleBellen(){
		System.out.println("Hoe gaat het?");
	}

}













