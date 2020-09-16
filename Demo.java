class Demo {  // EI
	public static void main(String... args){
		System.out.println("baantje trekken");
		Zwembad tongelreep = new Zwembad();
		tongelreep.aantalCM = 35;
		Zwemmer pieter = new Zwemmer();
		try{
			pieter.zwemmen();
		}catch(Throwable e){
			System.out.println("Geen plons voorlopig");
		}
	}
}

class Zwemmer{
	Zwembad z = new Zwembad();
	void zwemmen() throws Throwable{
		if(z.aantalCM < 50){
			try{
				throw new Throwable();
			}catch(Exception t){
				System.out.println("FF de kraan aanzetten");
			}
		}else{
			System.out.println("FF mijn brilletje opzetten");
		}
	}
}

class Zwembad{
	int aantalCM = 50;
}








