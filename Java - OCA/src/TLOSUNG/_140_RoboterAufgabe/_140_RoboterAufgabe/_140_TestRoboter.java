package TLOSUNG._140_RoboterAufgabe._140_RoboterAufgabe;

public class _140_TestRoboter {

    public static void main(String[] args){
        _140_Roboter x = new _140_Roboter("Herbert");
        _140_Roboter y = new _140_Roboter("Bernd");
        System.out.println(x.getName() + " und " + y.getName());

        _140_Roboter z = new _140_Roboter("Stefan");
        z.setName("Bernd");
        System.out.println(z.getName());  // Herbert

        _140_Roboter z1 = new _140_Roboter("Stefan");
        System.out.println(z1.getName());  // Stefan


    }
}
