import java.util.Scanner;

public class Main {

    static double distanceBetweenTwoPoints(double xOne , double yOne , double xTwo , double yTwo) {
        return Math.hypot(xOne - xTwo, yOne - yTwo);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Grid Height : ");
        int yGridLength = keyboard.nextInt();
        System.out.print("Grid Length : ");
        int xGridLength = keyboard.nextInt();
        System.out.print("Radius Length : ");
        int radiusLength = keyboard.nextInt();

        if (xGridLength < radiusLength || yGridLength < radiusLength) {
            System.out.print("Radius needs to be smaller than grid");

        }

        for (int y = 0; y < yGridLength; y++) {
            for (int x = 0; x < xGridLength ; x++) {
                if ( distanceBetweenTwoPoints((double) xGridLength / 2, (double) yGridLength /2,x,y) <= radiusLength && distanceBetweenTwoPoints((double) xGridLength / 2, (double) yGridLength / 2,x,y) > radiusLength - 1) {
                    System.out.print("# ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}