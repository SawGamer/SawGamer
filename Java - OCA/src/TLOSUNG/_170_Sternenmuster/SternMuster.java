package TLOSUNG._170_Sternenmuster;

public class SternMuster {
    //Abdullah

    public void EchteckShape(int row,int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
        public void RwDreiecke(int row){
            for (int i=0; i<row;i++){
                for (int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    public void Dreiecke(int idk){
        int num1=idk/2;
        for (int i=0; i<idk;i+=2){
            for (int k=0;k<num1;k++){
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){

                System.out.print("* ");
            }
            num1-=1;
            System.out.println();
        }
    }


}
