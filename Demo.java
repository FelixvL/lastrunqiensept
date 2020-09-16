class Demo {  // AE
	public static void main(String... args){
		Fiets fiets = new Fiets();
		Fiets fiets2 = new Mountainbike();
	}

}

class Fiets{
	Fiets(){
		System.out.println("in Fiets");	
	}
}

class Mountainbike extends Fiets{
	Mountainbike(){
		System.out.println("in Moutainbike");	
	}
}














