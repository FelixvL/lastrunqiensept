class Demo{   // HA
    static int x = 50;
    public static void main(String[] args) {
        new Y().z(x);

    }
}

class Y{
    int x = 10;
    static int y = 20;
    final int z = 60;
    public void z(int z){
        int x = 30;
        int y = 40;
        System.out.println(this.x);
        System.out.println(Y.y);
        System.out.println(x);
        System.out.println(this.z);
        System.out.println(y);
        System.out.println(z);
    }
}