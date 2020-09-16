class Demo {  // EA
	public static void main(String... args){
		System.out.println("baantje trekken");
	}
}

class Zwemmer{
	Zwembad z = new Zwembad();
	void zwemmen(){
		if(z.aantalCM < 50){
			throw new Error();
		}else{
			System.out.println("FF mijn brilletje opzetten");
		}
	}
}

class Zwembad{
	int aantalCM = 50;
}








