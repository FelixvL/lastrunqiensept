
// TR
class Demo{
	public static void main(String[] args){
		System.out.println("Start");
		System.out.println(new Server().install().prijs);
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