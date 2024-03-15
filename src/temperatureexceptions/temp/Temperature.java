package temperatureexceptions.temp;

import java.text.DecimalFormat;

/**
 * Application "Temperature".
 *
 * Classe abstraite dont le but est d'être une base pour les versions plus
 * spécifiques TemperatureEnKelvins, TemperatureEnCelsius et
 * TemperatureEnFahrenheits.
 *
 * Rappel : s'il n'y a pas de limite supérieure pour une température (car on
 * peut exciter toujours davantage des molécules), il y a clairement une limite
 * inférieure : le zéro absolu. Les molécules sont figées, totalement à l'arrêt.
 * Plus de vibrations. Moins que rien ce n'est pas possible !<br>
 * Donc 0 kelvins c'est le minimum !<br>
 * Celsius = Kelvins - 273.15<br>
 * Fahrenheits = Celsius * 9/5 + 32<br>
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 17 mars 2020
 * @version 0.1
 */
public abstract class Temperature {

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat( "#,##0.00" );
        return df.format( getCelsius() ) + " [°C]";
    }

    protected abstract double getKelvins();

    public abstract double getCelsius();

    public abstract double getFahrenheits();
}
