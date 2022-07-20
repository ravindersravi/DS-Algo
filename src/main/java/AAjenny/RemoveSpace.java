package AAjenny;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "This#string%contains^special*characters&.";
        str=str.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(str);
        str =str.replaceAll("\\s","");
        System.out.println(str);
    }
}
