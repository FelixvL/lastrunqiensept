class Demo {  // CB
	public static void main(String... args){
		Arts karel = new Chirurg();
		karel.BelleBellen();
	}
}
abstract class Arts{
	void BelleBellen(){
		System.out.println("Wat is je naam?");
	}
}
class Chirurg extends Arts{
	void BelleBellen(){
		System.out.println("Hoe gaat het?");
	}

}













