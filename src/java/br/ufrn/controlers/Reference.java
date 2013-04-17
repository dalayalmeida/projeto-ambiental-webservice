/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.controlers;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge
 */
public class Reference {

    public AtualizarWidgetsRMI getReference(String url) {

        AtualizarWidgetsRMI atualizarWidgetsRMI;
        try {
            atualizarWidgetsRMI = (AtualizarWidgetsRMI) Naming.lookup(url);
            System.out.println("Referencia recuperada");
            return atualizarWidgetsRMI;
        } catch (NotBoundException ex) {
            Logger.getLogger(Reference.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Reference.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Reference.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
