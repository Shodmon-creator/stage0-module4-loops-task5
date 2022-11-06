package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int i,j;
        for ( i = 1; i <=cathetusLength; i++) {
              for ( j = 0; j < i; j++) {
                System.out.print('8');
            }
            System.out.println();
        }
    }

}
