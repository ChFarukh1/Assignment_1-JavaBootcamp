public class ConvertDistance {
    public static void main(String[] args) {
        double distanceInKm = 2614;

        double distanceInMeters = distanceInKm * 1000;
        double distanceInFeet = distanceInKm * 3280.84;
        double distanceInInches = distanceInKm * 39370.1;
        double distanceInCentimeters = distanceInKm * 100000;

        System.out.println("Distance in meters: " + distanceInMeters);
        System.out.println("Distance in feet: " + distanceInFeet);
        System.out.println("Distance in inches: " + distanceInInches);
        System.out.println("Distance in centimeters: " + distanceInCentimeters);
    }
}
