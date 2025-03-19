public class TemperatureConverter {
    public static void main(String[] args) {
        int fahrenheit = 94;
        double temperature = ((fahrenheit - 32) * 5.0 / 9.0);
        System.out.println("The temperature is " + temperature + " degrees Celsius");

        double roundedTemperature = Math.round(temperature);
        System.out.println("The temperature is " + roundedTemperature + " degrees Celsius");
    }
}
