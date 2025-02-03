class animal {
    int c;
    animal(){

    }
    animal(int c) {
        this.c=c;
            System.out.println("Base class: c " + c);
        }
    }
    class lion extends animal {
        int b;
    lion(){}
        lion(int c,int b) {
            super(c);
            this.b = b;
        
        System.out.println("Child class: c " + c + " b " + b);
        }
    }
public class single_inheritance {
    public static void main(String args[]) {
        lion x = new lion(10, 20);
    }
}
