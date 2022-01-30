package intro.java;

import java.io.IOException;
import java.net.InetAddress;

public class AssignmnetThree {
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
        String ipAddress="127.0.0.1";
        InetAddress giveAddress=InetAddress.getByName(ipAddress);
        System.out.println("sending ping request to:"+ipAddress);
        if(giveAddress.isReachable(1000)){
            System.out.println("host is reachable");
        }
        else{
            System.out.println("host is not reachable");
        }
        long end=System.currentTimeMillis();
        long time=(end-start)>>1;
        System.out.println("the median time in milliseconds:"+time);
    }
}
