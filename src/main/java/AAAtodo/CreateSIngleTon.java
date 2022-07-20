package AAAtodo;

public class CreateSIngleTon {
    private static CreateSIngleTon sIngleTon =null;

    public String s;

    private CreateSIngleTon(){
        s="Hello I am a string part of Singleton class";
    }
    public static CreateSIngleTon  getObj(){
        if (sIngleTon == null) {
            sIngleTon = new CreateSIngleTon();
        }
        return sIngleTon;
    }


}
