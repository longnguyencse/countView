import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private static final String URL_CONT = "http://www.10puzzle.com/piece/28202-work-and-secret-camera-ikorn-solutions-with-year-end-party-2016-and-happy-new-year-2017.html";

    public static void main(String[] args) {
        String url = "http://www.google.com";
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimeTask(), 2*1000, 2*60*1000);


    }
}