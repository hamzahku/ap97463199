package assignment7;

import  java.util.*;

public class Main {

    public static void main(String[] args) {

        Shape []shapArray = new Shape[10];

        Random random = new Random();

        int rand;
        int rndnum1,rndnum2;

        for(int i =0; i<10 ; i++){
            rand =random.nextInt(3);
            rndnum1 = random.nextInt(10);
            rndnum2 = random.nextInt(10);
            switch (rand){
                case 0:
                    shapArray[i] = new Circle(rndnum1);
                    break;
                case 1:
                    shapArray[i] = new Rectangle(rndnum1,rndnum2);
                    break;
                case 2:
                    shapArray[i] = new Square(rndnum1);
                    break;
            }
        }

        Arrays.sort(shapArray);
        System.out.println("\n\n");

        for(Shape shape: shapArray) {
            System.out.format("%s\n", shape.toString());
        }

    }
}
