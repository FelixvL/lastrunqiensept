class Demo {  // CF
	public static void main(String... args){
		System.out.println("Hij doet het");
	}
}
abstract class Arts{
	abstract void BelleBellen();
}
abstract class Chirurg extends Arts{


}
class KaakChirurg extends Chirurg{
	protected int BelleBellen(){
		System.out.println("Heb je goed gepoetst?");
		return 3;
	}

}













