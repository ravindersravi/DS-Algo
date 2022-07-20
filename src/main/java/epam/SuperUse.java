package epam;

class AA{
    public int i;
    public int j;
    AA(){
        i=1;
        j=2;
    }
}
class BB extends AA{
    int a;
    BB(){
        super();
    }
}

public class SuperUse {
    public static void main(String[] args) {
        AA obj = new BB();
        System.out.println(obj.i + " "+ obj.j);
    }
}
