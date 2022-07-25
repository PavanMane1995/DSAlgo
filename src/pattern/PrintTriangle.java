package pattern;

public class PrintTriangle {

    public static void main(String[] args) {
        print(4,4);
    }

    public static void print(int r, int c){
        if(r==0 && c==0){
            return;
        }
        if(r>c){
            System.out.print("* ");
            print(r, ++c);
            System.out.print("* ");
        }else{
            System.out.println();
            print(--r, 0);
            System.out.println();
        }
    }
}
