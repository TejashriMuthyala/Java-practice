import java.util.*;
class stringtoken{
    public static void main(String args[]){
        StringTokenizer sb=new StringTokenizer("Tejashri is learning frontend developing along with Java");
        while(sb.hasMoreTokens()){
            System.out.println(sb.nextToken());
        }
    }
}