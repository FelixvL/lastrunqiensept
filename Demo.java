// YJ
class Demo{
	public static void main(String[] args){
		System.out.println("Start");
		Server s = new Server();
		System.out.println(s.app);
		App a = new App(25);
		s.app = a;
		System.out.println(s.app.prijs);
	}
}
class Server{
	App app = new iApp(55);
	App install(){
		System.out.println("a");
		return new iApp(23);
	}
}

class App{
	int prijs = 12;
	App(int prijs){
		System.out.println("hup app"+prijs);
		this.prijs = prijs;
	}
}
class iApp extends App{
	iApp(int prijs){
		super(14);
		System.out.println("hup iapp"+prijs);
		this.prijs = prijs;
	}
}