import java.io.*;

class Demo {  // EL
	public static void main(String... args){
		System.out.println("baantje trekken");
		Zwembad tongelreep = new Zwembad();
		tongelreep.aantalCM = 35;
		Zwemmer pieter = new Zwemmer();
		pieter.z = tongelreep;
		try{
			pieter.zwemmen();
		}catch(Throwable e){
			System.out.println("Geen plons voorlopig");
		}
	}
}

class Zwemmer{
	Zwembad z = new Zwembad();
	void zwemmen() throws Exception, IOException{
		if(z.aantalCM < 50){

				throw new IOException();

		}else{
			System.out.println("FF mijn brilletje opzetten");
		}
	}
}
class KanaalZwemmer extends Zwemmer{
	void zwemmen() throws Exception{
		System.out.println("Ik wil ook op Brexit");
	}
}
class Zwembad{
	int aantalCM = 50;
}








