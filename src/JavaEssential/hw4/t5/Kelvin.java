package JavaEssential.hw4.t5;

public class Kelvin extends ConverterTemperature{
    @Override
    double convert(double cel) {
        return cel+273.15;
    }
}
