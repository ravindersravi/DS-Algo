package dto.Cleancode;

import java.util.Locale;
import java.util.Optional;

public class NullCheckCases {
    private static Printer printer;
    // int printer = 100;
 //  Printer printer ;
    public static void main(String[] args) {
        printer  = new Printer();
        Boolean b = isChecking(printer);


    }
    public static boolean isChecking(Printer printer){
        String s  = Optional.ofNullable(printer.getBrand().toUpperCase(Locale.ROOT)).orElse("user");
     // Integer name = Optional.ofNullable(printer.getBrand().length()).orElse(0);
              //.get().length()).orElse(0);
      //  System.out.println(printer.getBrand().length()+"---------");
        System.out.println(s+"   sdfsdfsd  : ");
        return false;
    }
}
/*
"C:\Program Files\Java\jdk1.8.0_311\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\lib\idea_rt.jar=60511:C:\Program Files\JetBrains\IntelliJ IDEA 2021.2.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_311\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\rt.jar;C:\Users\Ravinder_Sabbani\Documents\CompletableFeatureExample\target\classes;C:\Users\Ravinder_Sabbani\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.0.6\jackson-databind-2.0.6.jar;C:\Users\Ravinder_Sabbani\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.0.6\jackson-core-2.0.6.jar;C:\Users\Ravinder_Sabbani\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.9.7\jackson-annotations-2.9.7.jar" dto.Cleancode.NullCheckCases
Exception in thread "main" java.util.NoSuchElementException: No value present
	at java.util.Optional.get(Optional.java:135)
	at dto.Cleancode.NullCheckCases.isChecking(NullCheckCases.java:16)
	at dto.Cleancode.NullCheckCases.main(NullCheckCases.java:11)

Process finished with exit code 1
 */
