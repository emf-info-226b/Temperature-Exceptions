package temperatureexceptions.temp.exceptions;

/**
 * Application "TemperatureExtremeException".
 *
 * Exception qui est lancée lorsqu'une température dépasse un certain seuil
 * qu'on souhaite ne jamais dépasser.
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 17 mars 2020
 * @version 0.1
 */
public class TemperatureExtremeException extends TemperatureException {

    public final static double TEMPERATURE_MAX_EN_CELSIUS = 1000.0;  // Ici on va fixer 1000[°C]
    public final static double TEMPERATURE_MAX_EN_KELVINS = TEMPERATURE_MAX_EN_CELSIUS + 273.15;
    public final static double TEMPERATURE_MAX_EN_FAHRENHEITS = TEMPERATURE_MAX_EN_CELSIUS * 9 / 5 + 32;

    @Override
    public String getMessage() {
        return "La température est extrême, elle dépasse la limite supérieure fixée !";
    }

}
