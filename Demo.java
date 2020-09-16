class Demo {  // CI
	public static void main(String... args){
		System.out.println("Hij doet het");
		KaakChirurg kees = new KaakChirurg();
		kees.BelleBellen(25);

	}
}
abstract class Arts{
	abstract void BelleBellen();
}
abstract class Chirurg extends Arts{


}
class KaakChirurg extends Chirurg{
	int BelleBellen(int a){
		System.out.println("Heb je goed gepoetst?");
		return 5;
	}

}













