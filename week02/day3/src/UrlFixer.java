public class UrlFixer {

    public static void main(String... args){

        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Also, the URL is missing a crutial component, find out what it is and insert it too!

        if(url.endsWith("bots")) {
            url.replace("bots", "odds");
            System.out.println("https//www.reddit.com/r/nevertellmetheodds");
        }

    }

}
