import org.json.JSONObject;

public class JsonParser {
    public static void parseWeatherData(String jsonData) {
        JSONObject obj = new JSONObject(jsonData);
        JSONObject current = obj.getJSONObject("current_weather");

        System.out.println("🌤️ Weather Data:");
        System.out.println("----------------");
        System.out.println("Temperature: " + current.getDouble("temperature") + "°C");
        System.out.println("Wind Speed: " + current.getDouble("windspeed") + " km/h");
        System.out.println("Weather Code: " + current.getInt("weathercode"));
    }
}
