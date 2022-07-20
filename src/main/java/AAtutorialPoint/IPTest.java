package AAtutorialPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.HashMap;
import java.util.Map;

public class IPTest {
    public static void main(String[] args) {

    }
    public static String getRemoteAddr(HttpServletRequest request) {
        String remoteAddr = request.getHeader("X-FORWARDED-FOR");
        if (remoteAddr == null || "".equals(remoteAddr)) {
            remoteAddr = request.getRemoteAddr();
        }

        if(remoteAddr != null){
            return remoteAddr.split(",")[0];
        }

        else return "";
    }
}
