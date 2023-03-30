package JavaEssential.hw4.t5;

public class Fahrenheit extends ConverterTemperature {

    @Override
    double convert(double cel) {
        return (cel*1.8)+32;
    }
}
