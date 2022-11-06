package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int ne = height;
        int nsp = 0;
        for (int i = 0; i < height; i++) {
            for (int sp = 0; sp < nsp; sp++) {
                System.out.print(" ");
            }
            for (int e = 0; e < ne; e++) {
                System.out.print('8');
            }
            System.out.println();
            if (i <height / 2) {
                ne -= 2;
                nsp+=1;
            } else {
                ne += 2;
                nsp-=1;
            }
        }


    }
}
