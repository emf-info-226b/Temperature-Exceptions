package temperatureexceptions;

import temperatureexceptions.temp.Temperature;
import temperatureexceptions.temp.TemperatureEnCelsius;
import temperatureexceptions.temp.TemperatureEnKelvins;
import temperatureexceptions.temp.exceptions.TemperatureException;

/**
 * Application "TemperatureExceptions".
 *
 * Démonstration du concept des exceptions.
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 17 mars 2020
 * @version 0.1
 */
public class TemperatureExceptions {

    public static void main( String[] args ) {

        try {
            // On crée la température la plus froide possible et on l'affiche
            Temperature t1 = new TemperatureEnKelvins( 0 );
            System.out.println( t1 );   // Du coup c'est toString() qui sera appelée automatiquement

            // On crée une température glaciale et on l'affiche
            Temperature t2 = new TemperatureEnCelsius( 0 );
            System.out.println( t2 );
            System.out.println( "En fahrenheits ça donne : " + t2.getFahrenheits() +" [°F]" );

            // On crée une température bouillante et on l'affiche
            Temperature t3 = new TemperatureEnCelsius( 100 );
            System.out.println( t3 );
            System.out.println( "En fahrenheits ça donne : " + t3.getFahrenheits() +" [°F]" );

            /////////////////////////////////////////////////////////
            // Les lignes ci-dessous (si décommentées) vont générer une exception !
            // Essayez en faisant du pas par pas dans le débogueur !
            /////////////////////////////////////////////////////////
            
            // On crée une température trop chaude et on l'affiche
            //Temperature t4 = new TemperatureEnCelsius( 1000000 );
            //System.out.println( t4 );

            // On crée une température trop froide et on l'affiche
            //Temperature t5 = new TemperatureEnKelvins( -100 );
            //System.out.println( t5 );
            
        }
        catch ( TemperatureException ex ) {
            System.out.println( "==============================" );
            System.out.println( "Il y a eu une exception !" );
            System.out.println( "------------------------------" );
            System.out.println( "Le message est [" + ex.getMessage() + "]" );
            System.out.println( "------------------------------" );
            ex.printStackTrace();
        }

    }

}
