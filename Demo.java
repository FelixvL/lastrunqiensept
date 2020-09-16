class Demo {  // EF
	public static void main(String... args){
		System.out.println("baantje trekken");
		Zwembad tongelreep = new Zwembad();
		tongelreep.aantalCM = 35;
		Zwemmer pieter = new Zwemmer();
		pieter.zwemmen();
	}
}

class Zwemmer{
	Zwembad z = new Zwembad();
	void zwemmen() throws Exception{
		if(z.aantalCM < 50){
			try{
				throw new Exception();
			}catch(Throwable t){
				System.out.println("FF de kraan aanzetten");
			}
		}else{
			System.out.println("FF mijn brilletje opzetten");
		}
	}
}

class Zwembad{
	static int aantalCM = 50;
}








