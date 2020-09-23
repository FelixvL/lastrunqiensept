
// YZ
class Demo{
	public static void main(String[] args){
		System.out.println("Start");
		Server s = new Server();
		System.out.println(s.app);
		App a = new iApp();
		s.app = a;
		System.out.println(s.app.prijs);
	}
}

class Server{
	App app;
	App install(){
		System.out.println("a");
		return new iApp();
	}
}

class App{
	int prijs = 12;
}
class iApp extends App{
	int prijs = 24;
}