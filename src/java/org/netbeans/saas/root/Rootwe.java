/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.saas.root;

import java.io.IOException;
import org.netbeans.saas.RestConnection;
import org.netbeans.saas.RestResponse;

/**
 * Rootwe Service
 *
 * @author Cristina
 */
public class Rootwe {

    /**
     * Creates a new instance of Rootwe
     */
    public Rootwe() {
    }
    
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Throwable th) {
        }
    }

    /**
     *
     * @return an instance of RestResponse
     */
    public static RestResponse getResto() throws IOException {
        String[][] pathParams = new String[][]{};
        String[][] queryParams = new String[][]{};
        RestConnection conn = new RestConnection("https://ws.docencia.ces.siani.es/a12/Binary/webresources//binary", pathParams, queryParams);
        sleep(1000);
        return conn.get(null);
    }

    /**
     *
     * @param num
     * @return an instance of RestResponse
     */
    public static RestResponse binary(String num) throws IOException {
        String[][] pathParams = new String[][]{};
        String[][] queryParams = new String[][]{{"num", num}};
        RestConnection conn = new RestConnection("https://ws.docencia.ces.siani.es/a12/Binary/webresources//binary", pathParams, queryParams);
        sleep(1000);
        return conn.get(null);
    }
}
