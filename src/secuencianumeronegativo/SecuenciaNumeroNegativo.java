/*
7. Leer una secuencia de números, hasta que se introduce un número negativo y mostrar la suma
de dichos números.
 */
package secuencianumeronegativo;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class SecuenciaNumeroNegativo {

    public static void main(String[] args) {
        int numero;
        int resultadoSuma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

            if (numero < 0) {
                break;
            }
            resultadoSuma = resultadoSuma + numero;
        } while (numero >= 0);
        JOptionPane.showMessageDialog(null, resultadoSuma);

    }

}
