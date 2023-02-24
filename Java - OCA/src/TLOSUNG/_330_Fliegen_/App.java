package TLOSUNG._330_Fliegen_;

abstract class Fliegen {
    abstract void fliegen();
}

class Biene extends Fliegen {
    @Override
    public void fliegen() {
        System.out.println("Summsumm");
    }
}

class App {
    public static void main(String[] args) {
        Biene b = new Biene();
        abflug(b);
    }

    public static void abflug(Fliegen f) {
        f.fliegen();
    }
}

