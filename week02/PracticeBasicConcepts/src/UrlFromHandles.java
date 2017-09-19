import java.util.Arrays;
import java.util.List;

public class UrlFromHandles {

    public static void main(String[] args){

        System.out.println(urlsFromHandles(Arrays.asList("ghhandle1", "ghhandle2")));
    }

    static List<String> urlsFromHandles(List<String> handle){
            String a = "https://github.com/greenfox-academy/";

                handle.add(a);

    }

}
