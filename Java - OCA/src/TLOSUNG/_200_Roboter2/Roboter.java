package TLOSUNG._200_Roboter2;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Roboter {


    private static int[] position = {0,0};
    private static String name;
    private static String orientation;
    private static int steps = 0;
    private final static int nameLength = 10;
    private final static int northOrEast = 1;
    private final static int southOrWest = -1;
    private static Scanner scanner = new Scanner(System.in);

    Roboter(){
    }

    public static String getName() {
        return name;
    }
    public static void setName(String name) {
        Roboter.name = name;
    }
    public static String getOrientation() {
        return orientation;
    }
    public static void setOrientation(String orientation) {
        Roboter.orientation = orientation;
    }
    public static int getSteps() {
        return steps;
    }
    public static void setSteps(){
        System.out.print("Wieviele Schritte: ");
        String input = scanner.nextLine();
        setSteps(Integer.parseInt(input));
    }
    public static void setSteps(int steps) {
        Roboter.steps = steps;
    }
    public static int[] getPosition(){
        return position;
    }

    public static void askOrientation(){
        boolean whileLoop = true;
        String orientation = "";
        while(whileLoop){
            System.out.println("In welche Richtung soll es gehen?");
            System.out.println("(1) Norden \n(2) Sueden \n(3) Osten \n(4) Westen");
            System.out.print("Zahl: ");
            String input = scanner.nextLine();
            switch (input){
                case "1": orientation = "north"; whileLoop = false;break;
                case "2": orientation = "south"; whileLoop = false;break;
                case "3": orientation = "east"; whileLoop = false;break;
                case "4": orientation = "west"; whileLoop = false;break;
                default:System.out.println("Fehlerhafte Eingabe!");
            }
            System.out.println("_________________________________");
        }
        setOrientation(orientation);
    }

    // north(y) or east(x) = 1 / south(y) or west(x) = -1
    public static void arrayPosition(){
        if(multiplikationOrientation(getOrientation()) == northOrEast){
            if(getOrientation().equals("north")){
                position[1] = getSteps()*multiplikationOrientation(getOrientation())+getPosition()[1];   // wenn "north" = x-achse = int[]{x,y}
            }else if(getOrientation().equals("east")){
                position[0] = getSteps()*multiplikationOrientation(getOrientation())+getPosition()[0];    // wenn "east" = y- achse = int[]{x,y}
            }
        }else if(multiplikationOrientation(getOrientation()) == southOrWest){
            if(getOrientation().equals("south")){
                position[1] = getSteps()*multiplikationOrientation(getOrientation())+getPosition()[1];
            }else if(getOrientation().equals("west")){
                position[0] = getSteps()*multiplikationOrientation(getOrientation())+getPosition()[0];
            }
        }
    }

    public static void clearPosition() {
        String xPos = "";
        String yPos = "";
        boolean isStartPoint = false;

        System.out.println("ArrayPos: " + getPosition()[0] + " " + getPosition()[1]);
        if ((getPosition()[0] == 0) & (getPosition()[1]) == 0){
            System.out.println(getName() + " befindest sich auf der Startposition" + "\n");
            isStartPoint = true;
        }
        if(getPosition()[1] < 0){
            yPos = "Sueden";
        }else{
            yPos = "Norden";
        }
        if(getPosition()[0] < 0){
            xPos = "Westen";
        }else{
            xPos = "Osten";
        }

        if(!isStartPoint){
            if((getPosition()[0] == 0)){
                System.out.println(getName() + " befindest sich " + abs(getPosition()[1]) + " Schritte im " + yPos);
            }else if(getPosition()[1] == 0){
                System.out.println(getName() + " befindest sich " + abs(getPosition()[0]) + " Schritte im " + yPos);
            }else{
                System.out.println(getName() + " befindest sich " + abs(getPosition()[0]) + " Schritte im " + xPos);
                System.out.println("und " + abs(getPosition()[1]) + " Schritte im " + yPos);
            }
        }
    }
    public static int multiplikationOrientation(String orientation){
        if(orientation.equals("north") || orientation.equals("east")){
            return 1;
        }else{
            return -1;
        }
    }

    public static void createName(){
        System.out.print("Name des Roboters: ");
        String name = scanner.nextLine();
        if(name.length() <= nameLength){
            setName(name);
        }else{
            System.out.println("Dein Name ist zu lang und wurde auf 10 Zeichen gekuerzt.");
            System.out.println("Der Name lautet jetzt: " + name.substring(0,nameLength) + "\n");
            setName(name.substring(0,nameLength));
        }
    }

    public static void mainMenu(){
        boolean mainLoop = true;
        while (mainLoop){
            System.out.println("\nBitte auswahl treffen: ");
            System.out.println("(1) Bewegen");
            System.out.println("(2) Standort");
            System.out.println("(3) Abbrechen");
            System.out.print("Zahl: ");
            String input = scanner.nextLine();
            System.out.println();
            switch (input){
                case "1": Roboter.askOrientation();
                    Roboter.setSteps();
                    Roboter.arrayPosition();
                    break;
                case "2": Roboter.clearPosition();break;
                case "3": mainLoop = false;
            }
            System.out.println("_________________________________");
        }
    }
}
