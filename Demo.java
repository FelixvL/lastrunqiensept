class Demo {  // BE
	public static void main(String... args){
		int[][][] go = {    { {5,6,2,8,9}}, {{4,5,6,7},{4,25}},{{8,7,9} }     };

		for(int a = 0; a < go[1].length; a++){
			System.out.println("Boe");
			for(int b = 0; b < go[1][a].length; b++){
				System.out.println(">>"+go[1][a][b]);
			}
		}

	}

}














