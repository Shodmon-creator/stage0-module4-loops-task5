package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 1 || i == height || j == 0 || j == length - 1) {
                    System.out.print('8');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
