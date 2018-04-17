/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import org.netbeans.saas.root.Rootwe;
import org.netbeans.saas.RestResponse;

/**
 *
 * @author Cristina
 */
public class FactorBin {

    public static void main(String[] args) {

        try {
            int arg0 = 5;
            pack.Factorial_Service service = new pack.Factorial_Service();
            pack.Factorial port = service.getFactorialPort();
            // TODO process result here
            int result = port.calcFactorial(arg0);
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            String num = "5";

            RestResponse result = Rootwe.binary(num);
            //TODO - Uncomment the print Statement below to print result.
            System.out.println("The SaasService returned: "+result.getDataAsString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
