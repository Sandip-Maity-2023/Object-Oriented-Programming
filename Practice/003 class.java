 class  room {
    
        float length,breadth;
        void get(float a,float b){
            length=a;
            breadth=b;
        }
    }

    class area{
        public static void main(String[] args) {
            float area;
room x=new room();
x.get(10, 20);
area=x.length*x.breadth;
System.out.println("area="+area);
        }
    }