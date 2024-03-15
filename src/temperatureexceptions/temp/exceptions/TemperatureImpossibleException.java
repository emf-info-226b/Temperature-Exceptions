package temperatureexceptions.temp.exceptions;

/**
 * Application "TemperatureImpossibleException".
 *
 * Exception qui est lancée lorsqu'une températeure impossible est rencontrée.
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 17 mars 2020
 * @version 0.1
 */
public class TemperatureImpossibleException extends TemperatureException {

    public final static double TEMPERATURE_MIN_EN_KELVINS = 0;
    public final static double TEMPERATURE_MIN_EN_CELSIUS = TEMPERATURE_MIN_EN_KELVINS - 273.15;
    public final static double TEMPERATURE_MIN_EN_FAHRENHEITS = TEMPERATURE_MIN_EN_CELSIUS * 9 / 5 + 32;

    @Override
    public String getMessage() {
        return "Une température plus petite que 0 kelvins est impossible !";
    }

}
