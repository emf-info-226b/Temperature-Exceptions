package temperatureexceptions.temp;

import temperatureexceptions.temp.exceptions.TemperatureException;
import temperatureexceptions.temp.exceptions.TemperatureExtremeException;
import static temperatureexceptions.temp.exceptions.TemperatureExtremeException.TEMPERATURE_MAX_EN_FAHRENHEITS;
import temperatureexceptions.temp.exceptions.TemperatureImpossibleException;
import static temperatureexceptions.temp.exceptions.TemperatureImpossibleException.TEMPERATURE_MIN_EN_FAHRENHEITS;

/**
 * Application "TemperatureEnFahrenheits".
 *
 * Classe qui représente une température en Fahrenheits.
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 17 mars 2020
 * @version 0.1
 */
public class TemperatureEnFahrenheits extends Temperature {

    private final double fahrenheits;

    public TemperatureEnFahrenheits( double fahrenheits ) throws TemperatureException {
        if ( fahrenheits < TEMPERATURE_MIN_EN_FAHRENHEITS ) {
            throw new TemperatureImpossibleException();
        }
        if ( fahrenheits > TEMPERATURE_MAX_EN_FAHRENHEITS ) {
            throw new TemperatureExtremeException();
        }

        this.fahrenheits = fahrenheits;
    }

    @Override
    public double getKelvins() {
        return getCelsius() + 273.15;
    }

    @Override
    public double getCelsius() {
        return ( getFahrenheits() - 32 ) * 5 / 9;
    }

    @Override
    public double getFahrenheits() {
        return fahrenheits;
    }

}
