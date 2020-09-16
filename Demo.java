import java.io.*;
class Demo {  // ER
	public static void main(String... args){
		System.out.println("baantje trekken");
		Zwembad tongelreep = new Zwembad();
		tongelreep.aantalCM = 35;
		Zwemmer pieter = new Zwemmer();
		pieter.z = tongelreep;
		new KanaalZwemmer();new Zwemmer();
		try{
			pieter.zwemmen();
		}catch(Exception e){
			System.out.println("Emmers Kopen");
		}
		catch(IOException e2){
			System.out.println("Badmeester halen");
		}
		catch(Throwable e3){
			System.out.println("Geen plons voorlopig");
		}
		System.out.println("ff afdrogen");
	}
}
class Zwemmer{
	Zwemmer(){
		z.aantalCM +=10;
	}
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








