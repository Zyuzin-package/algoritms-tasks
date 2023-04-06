package src;

public class variableSwap {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("a: "+a +" | "+ "b: "+ b);
        int c = a;
        a = b;
        b = c;
        System.out.println("a: "+a +" | "+ "b: "+ b);

        int e = 5;
        int d = 10;

        d = d+e;
        e = d-e;
        d = d-e;
        System.out.println("d: "+d +" | "+ "e: "+ e);

    }
}
