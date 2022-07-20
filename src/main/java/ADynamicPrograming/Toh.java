package ADynamicPrograming;

public class Toh {
    public static void main(String[] args) {
    towerOfHanoi(3, "Source-1", "Destination-3","Helper-2");
    }
    //n no of disks
    static void towerOfHanoi(int n, String source1, String destination3, String helper2){
        if(n<=0){
            return;
        }
        else{
            //source-->helper
            towerOfHanoi(n-1,source1,helper2,destination3);
            System.out.println("Disk "+n+" Moved from "+source1+" to "+destination3);
            //2nd move helper-->desti with help of source
            towerOfHanoi(n-1,helper2,destination3,source1);
        }
    }
}
