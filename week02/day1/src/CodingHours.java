public class CodingHours {

    public static void main(String[] args) {

        int workHours = 6;
        int workDays = 5;
        int longSemester = 17;
        int averageWork = 52;


        System.out.println("An attendee average coding hours during a semester are " + workHours*workDays*longSemester+ " hours");


        System.out.println("The coding hours are " + (100*(workHours*workDays*longSemester)/(averageWork*longSemester)) +
                "% of the average work hours during the semester");


    }

}
