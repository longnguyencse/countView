import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.TimerTask;

/**
 * Created by long on 1/6/17.
 */
public class TimeTask extends TimerTask {
//    private static final String URL_CONT = "http://www.10puzzle.com/piece/28317-t%E1%BA%A5t-ni%C3%AAn-new-year-s-eve-party-ikornsolutions-vn.html";
    private static final String URL_CONT = "http://l.facebook.com/?u=http%3A%2F%2Fwww.10puzzle.com%2Fpiece%2F28202-work-and-secret-camera-ikorn-solutions-with-year-end-party-2016-and-happy-new-year-2017.html%3Fv%3Dsearch%26q%3Dikorn%26offset%3D0&e=ATPYdESupzKUtvaIelh60hiURqkGZ0-she9Kq8TS7LUXo7pEW-PhXxfDX388FR7x4zelNg7JiL1Unpcy-Fs8LyklcO_3161KBRIGL9J5aOjQac7a8Jk6aZa0Zv3F8xsOAqdHPJs";

    @Override
    public void run() {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(URL_CONT));

            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Destop is support");
            try {
                Thread.sleep( 2*60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("killall firefox");
                runtime.exec("rm ~/.mozilla/firefox/*.default/*.sqlite ~/.mozilla/firefox/*default/sessionstore.js");
                runtime.exec("rm -r ~/.cache/mozilla/firefox/*.default/*");

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            System.out.print("Destop is no support");
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + URL_CONT);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
