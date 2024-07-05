import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // display our weather app gui
                new WeatherAppGui().setVisible(true);
                /*
                 * compile and run using the classpath
                 * compile:- javac -cp
                 * ".;C:\Users\PANZA AKHILESHWAR\OneDrive\Desktop\weatherapp\lib\json-simple-1.1.1.jar"
                 * AppLauncher.java WeatherApp.java WeatherAppGui.java
                 * run:- java -cp
                 * ".;C:\Users\PANZA AKHILESHWAR\OneDrive\Desktop\weatherapp\lib\json-simple-1.1.1.jar"
                 * AppLauncher
                 */

            }
        });
    }
}