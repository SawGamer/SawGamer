package TLOSUNG._140_RoboterAufgabe._140_RoboterAufgabe;

public class _140_Roboter {

    private String name;

    public _140_Roboter(String name){
        this.name = name;
        setName("Herbert");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        String temp = name;
        name = "Herbert";
        this.name = name;

    }
}
