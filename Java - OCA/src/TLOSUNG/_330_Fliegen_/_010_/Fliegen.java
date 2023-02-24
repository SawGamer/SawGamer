package TLOSUNG._330_Fliegen_._010_;

interface Fliegen {
    void fliegen();
}

class Biene implements Fliegen {
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

