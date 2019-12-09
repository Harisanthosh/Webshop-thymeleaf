package de.rhaudi.transfactrestserver.ssh;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class Launch {

    private static Session session;

    public static boolean SSHConnectPps02() {
        //The starting point, used to create sessions and manage identities.
        JSch jsch = new JSch();
        try {
            jsch.addIdentity("pps06.ppk");
            //oracle : login, pps03... : ip , 24226 : port
            session = jsch.getSession("oracle", "pps02.hs-el.de", 24226);
            //adding a configuration to the session
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            //The used ssh tunnel; order : source port , ip , port
            session.setPortForwardingL(1562, "127.0.0.1", 1521);
            System.out.println("Verbunden mit PPS02");

        } catch (JSchException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public static boolean SSHConnectPps03() {
        //The starting point, used to create sessions and manage identities.
        JSch jsch = new JSch();
        try {
            jsch.addIdentity("pps06.ppk");
            //oracle : login, pps03... : ip , 24226 : port
            session = jsch.getSession("oracle", "pps03.hs-el.de", 24226);
            //adding a configuration to the session
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);

            session.connect();
            //The used ssh tunnel; order : source port , ip , port
            session.setPortForwardingL(1562, "127.0.0.1", 1521);
            System.out.println("Verbunden mit PPS03");

        } catch (JSchException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static int SSHDisconnet() {
        System.out.println("Disconnected...");
        session.disconnect();
        return 0;
    }
}