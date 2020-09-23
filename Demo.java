// YG
class Demo{
	public static void main(String[] args){
		System.out.println("Start");
		Server s = new Server();
		System.out.println(s.app);
		iApp a = new iApp(25);
		s.app = a;
		System.out.println(s.app.prijs);
	}
}
class Server{
	iApp app = new iApp(55);
	App install(){
		System.out.println("a");
		return new iApp(23);
	}
}

class App{
	int prijs = 12;
	App(int prijs){
		System.out.println("hup app");
		this.prijs = prijs;
	}
}
class iApp extends App{
	iApp(int prijs){
		super(14);
		System.out.println("hup iapp");
		prijs = prijs;
	}
}