class Demo {  // CG
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
	protected void BelleBellen(){
		System.out.println("Heb je goed gepoetst?");
	}

}













