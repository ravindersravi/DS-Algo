package AAADpseries;


class SIngleton{

    private static SIngleton instance;

    private SIngleton(){}

    public static synchronized SIngleton getInstance(){
        if(instance == null){
            instance = new SIngleton();
        }
        return instance;
    }




}
public class GFG {
}
