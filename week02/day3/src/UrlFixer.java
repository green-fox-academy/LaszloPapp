public class UrlFixer {

    public static void main(String... args){

        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Also, the URL is missing a crutial component, find out what it is and insert it too!

        if(url.endsWith("bots")) {
            System.out.println("https//www.reddit.com/r/nevertellmetheodds");
        }
        System.out.println(url.replace("bots", "odds"));

    }

}
