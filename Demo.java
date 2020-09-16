class Demo {  // CH
	public static void main(String... args){
		System.out.println("Hij doet het");
	}
}
abstract class Arts{
	abstract protected void BelleBellen();
}
abstract class Chirurg extends Arts{


}
class KaakChirurg extends Chirurg{
	void BelleBellen(){
		System.out.println("Heb je goed gepoetst?");
	}

}













