package temperatureexceptions.temp;

import temperatureexceptions.temp.exceptions.TemperatureException;
import temperatureexceptions.temp.exceptions.TemperatureExtremeException;
import static temperatureexceptions.temp.exceptions.TemperatureExtremeException.TEMPERATURE_MAX_EN_KELVINS;
import temperatureexceptions.temp.exceptions.TemperatureImpossibleException;
import static temperatureexceptions.temp.exceptions.TemperatureImpossibleException.TEMPERATURE_MIN_EN_KELVINS;

/**
 * Application "TemperatureEnKelvins".
 *
 * Classe qui représente une température en Kelvins.
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 17 mars 2020
 * @version 0.1
 */
public class TemperatureEnKelvins extends Temperature {

    private final double kelvins;

    public TemperatureEnKelvins( double kelvins ) throws TemperatureException {
        if ( kelvins < TEMPERATURE_MIN_EN_KELVINS ) {
            throw new TemperatureImpossibleException();
        }
        if ( kelvins > TEMPERATURE_MAX_EN_KELVINS ) {
            throw new TemperatureExtremeException();
        }
        this.kelvins = kelvins;
    }

    @Override
    public double getKelvins() {
        return kelvins;
    }

    @Override
    public double getCelsius() {
        return getKelvins() - 273.15;
    }

    @Override
    public double getFahrenheits() {
        return getCelsius() * 9 / 5 + 32;
    }

}
