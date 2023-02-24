package TLOSUNG._230_BinaereZahlen;

public class _230_Binaerzahlen {

        public static String intToBinaryToString(int number) {
            StringBuilder result = new StringBuilder();
            for(int i = 7; i >= 0 ; i--) {
                int displayMask = 1 << i;
                if((number & displayMask) == 0){
                    result.append("0 ");
                }else {
                    result.append("1 ");
                }
            }
            return result.toString();
        }
    public static void main(String[] args) {
        int i = 0;
        while (i <=255){
            System.out.println(intToBinaryToString(i));
            i++;
        }
    }
}
