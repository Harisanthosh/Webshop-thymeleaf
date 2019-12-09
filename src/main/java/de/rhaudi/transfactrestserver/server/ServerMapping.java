package de.rhaudi.transfactrestserver.server;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.currentTimeMillis;


public class ServerMapping implements ServletRequestListener {


    private static long previousMillis = 0;
    private static long waitTime = 50;

    private static Map<String, Integer> statistics = new HashMap<>();


    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        long currentMillis = currentTimeMillis();

        if (currentMillis - previousMillis >= waitTime) {
            previousMillis = currentMillis;
            ServletRequest servletRequest = servletRequestEvent.getServletRequest();

            HttpServletRequest request = (HttpServletRequest) servletRequest;

            String remoteAdress = servletRequest.getRemoteAddr();
            String path = request.getRequestURI();

            if(path.contains("/stats")){
                System.out.println("Aufruf von Statistik");
                return;
            }

            if (statistics.containsKey(remoteAdress)) {

                statistics.put(remoteAdress, statistics.get(remoteAdress) + 1);

            } else {
                if (remoteAdress.equals("0:0:0:0:0:0:0:1")) {
                    System.out.println("Aufruf von localhost");
                    return;
                }
                statistics.put(remoteAdress, 1);

            }
        }
    }

    public static Map<String, Integer> getStatistics() {
        return statistics;
    }

}
