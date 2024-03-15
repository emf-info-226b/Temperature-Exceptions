package temperatureexceptions.temp;

import temperatureexceptions.temp.exceptions.TemperatureException;
import temperatureexceptions.temp.exceptions.TemperatureExtremeException;
import static temperatureexceptions.temp.exceptions.TemperatureExtremeException.TEMPERATURE_MAX_EN_CELSIUS;
import temperatureexceptions.temp.exceptions.TemperatureImpossibleException;
import static temperatureexceptions.temp.exceptions.TemperatureImpossibleException.TEMPERATURE_MIN_EN_CELSIUS;

/**
 * Application "TemperatureEnCelsius".
 *
 * Classe qui représente une température en Celsius.
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 17 mars 2020
 * @version 0.1
 */
public class TemperatureEnCelsius extends Temperature {

    private final double celsius;

    public TemperatureEnCelsius( double celsius ) throws TemperatureException {
        if ( celsius < TEMPERATURE_MIN_EN_CELSIUS ) {
            throw new TemperatureImpossibleException();
        }
        if ( celsius > TEMPERATURE_MAX_EN_CELSIUS ) {
            throw new TemperatureExtremeException();
        }

        this.celsius = celsius;
    }

    @Override
    public double getKelvins() {
        return getCelsius() + 273.15;
    }

    @Override
    public double getCelsius() {
        return celsius;
    }

    @Override
    public double getFahrenheits() {
        return getCelsius() * 9 / 5 + 32;
    }

}
