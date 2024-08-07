public class ConvertTemperature {
    public static void main(String[] args) {
        double fahrenheit = 108;
        double centigrade = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperature in Centigrade: " + centigrade + "C");
    }
}
