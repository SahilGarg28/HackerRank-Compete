import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String ss=s.substring(8);
        String nt=s.substring(0,8);
        String[] ti=nt.split(":");
        StringBuilder all=new StringBuilder();
        int hh=Integer.parseInt(ti[0]);
        if(ss.equals("PM"))
        {
            
            if(hh==12)
            {
                hh=12;
            }
            else{
            hh+=12;
            }
            all.append(hh).append(":").append(ti[1]).append(":").append(ti[2]);
            
            nt=all.toString();
            
        }
        if(ss.equals("AM"))
        {
            if(hh==12)
            {
                String a="00";
                all.append(a).append(":").append(ti[1]).append(":").append(ti[2]);
            
                nt=all.toString();
            }
        }
    return nt;

    }

}

public class time_conversion{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
