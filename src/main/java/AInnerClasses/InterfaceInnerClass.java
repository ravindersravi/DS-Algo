package AInnerClasses;

interface DemoInterface{
     class InnerClass{
        public void demo(){
            System.out.println("Demo method");
        }
    }

}

public class InterfaceInnerClass implements DemoInterface{

    public static void main(String[] args) {
        DemoInterface.InnerClass di= new DemoInterface.InnerClass();
        di.demo();
    }
}


