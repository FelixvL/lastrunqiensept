class Demo {  // EB
	public static void main(String... args){
		System.out.println("baantje trekken");
	}
}

class Zwemmer{
	Zwembad z = new Zwembad();
	void zwemmen(){
		if(z.aantalCM < 50){
			throw new Exception();
		}else{
			System.out.println("FF mijn brilletje opzetten");
		}
	}
}

class Zwembad{
	int aantalCM = 50;
}








