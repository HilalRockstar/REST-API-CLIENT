import javax.swing.*;
import org.json.JSONObject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main extends JFrame {
    private JLabel weatherLabel;
    private JButton refreshButton;

    public Main() {
        setTitle("Live Weather App");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        weatherLabel = new JLabel("Fetching Weather Data...", JLabel.CENTER);
        weatherLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(weatherLabel, BorderLayout.CENTER);

        refreshButton = new JButton("Refresh");
        refreshButton.setFont(new Font("Arial", Font.BOLD, 15));
        add(refreshButton, BorderLayout.SOUTH);

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fetchWeatherData();
            }
        });

        fetchWeatherData();
        setVisible(true);
    }

    private void fetchWeatherData() {
        String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=13.0827&longitude=80.2707&current_weather=true";
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            conn.disconnect();

            JSONObject obj = new JSONObject(content.toString());
            JSONObject current = obj.getJSONObject("current_weather");
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String currentTime = sdf.format(new Date());
            String weather = "<html>🌡️ Temperature: " + current.getDouble("temperature") + "°C<br>" +
                    "🌬️ Wind Speed: " + current.getDouble("windspeed") + " km/h<br>" +
                    "⏰ Time:"+ currentTime;

            weatherLabel.setText(weather);
        } catch (Exception ex) {
            weatherLabel.setText("Failed to fetch weather data!");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
