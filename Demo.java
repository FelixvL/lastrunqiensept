class Demo {  // EC
	public static void main(String... args){
		System.out.println("baantje trekken");
	}
}

class Zwemmer{
	Zwembad z = new Zwembad();
	void zwemmen(){
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
	int aantalCM = 50;
}








