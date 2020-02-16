package net.annalight;

public class Main {

    public static void main(String[] args) {
        int next;
        int appear = 0;
        int A = 4;
        int count = 0;
        boolean isAppear;
        while (count < 1000){
            next = (int) (Math.random() * 10);
            if(next > A){
                // event A appears
                if (1 < A){
                    A--;
                }
                appear++;
                isAppear = true;
            } else if (next < A){
                // event A not appears
                if (A < 8){
                    A++;
                }
                isAppear = false;
            } else {
                if (Math.random() > 0.5){
                    // event A appears
                    if (1 < A){
                        A--;
                    }
                    appear++;
                    isAppear = true;
                } else {
                    if (A < 8){
                        A++;
                    }
                    isAppear = false;
                }
            }
            System.out.println((isAppear ? "1" : "0") + " d: " + next + " A:" + A);
            count++;
        }
        System.out.println("A appears:" + appear);
        System.out.println("A Not appears:" + (count-appear));
    }
}
