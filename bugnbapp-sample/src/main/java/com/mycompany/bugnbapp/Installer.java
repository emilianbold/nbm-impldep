package com.mycompany.bugnbapp;

import org.netbeans.core.network.utils.HostnameUtils;
import org.netbeans.core.network.utils.NativeException;
import org.openide.modules.ModuleInstall;
import org.openide.util.Exceptions;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        try {
            String host = HostnameUtils.getNetworkHostname();
            System.out.println("Hostname is " + host);
        } catch (NativeException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

}
