class OuterClass {
    int x = 10;

    class InnerClass {//Nested class example
        int y = 5;
    }
}
public class NestedClassExample {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
