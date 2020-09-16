class Demo {  // BC
	public static void main(String... args){
		int[][][] go = {    { {5,6,2,8,9}}, {{4,5,6,7},{4,25}},{{8,7,9} }     };

		for(int a = 0; a < go[0].length; a++){
			for(int b = 0; b < go[0][a].length; b++){
				System.out.println(">>"+go[0][a][b]);
			}
		}

	}

}














