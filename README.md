# REST-API-CLIENT

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: HAMEED HILAL

*INTERN ID*: CT04XHI

*DOMAIN*: JAVA

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

*Project Title*: Live Weather App using Java and Public API

# Project Description:
The Live Weather App is a robust desktop application developed using Java that leverages public APIs to fetch real-time weather data and display it through an intuitive graphical user interface (GUI). This project highlights how modern applications can consume web-based services to provide users with up-to-date information. Built on the Java Swing framework, the application ensures that users receive live weather updates with a seamless and visually appealing experience. The primary goal of this project is to demonstrate how Java applications can interact with web services via HTTP requests, parse JSON responses, and present the information in a user-friendly manner.


The application relies on the Open-Meteo Weather API, which provides weather information for various locations across the globe. In this project, the location is fixed to Chennai, Tamil Nadu, India with the geographic coordinates Latitude: 13.0827 and Longitude: 80.2707. By making HTTP GET requests to the API endpoint, the app retrieves weather data in JSON format. The retrieved JSON data is then parsed using the org.json library, Instead of using Maven We Add the org.json dependency in pom.XML to extract relevant information such as temperature, wind speed, and time of the update. This data is displayed on the GUI, making it accessible for users to view at a glance.


The application features a simple layout with a weather information display panel and a Refresh Button. The refresh functionality allows users to update the weather data on demand. The GUI is designed with a modern and minimalistic aesthetic, making it easy to navigate. The temperature, wind speed, and time are displayed in a structured format using JLabel components. Additionally, the app implements error handling to notify users if the weather data cannot be fetched due to network issues or API errors.


To develop this application, several technologies and tools were utilized. The backend logic is written in Java, while the graphical interface is built using Java Swing. HTTP requests are managed through HttpURLConnection, a built-in Java API that enables seamless communication with web services. The org.json library is used to parse JSON responses and extract weather data. The app's lightweight design ensures that it can run on any machine with JDK 8 or above installed.


The installation and execution of the application are straightforward. First, users need to download the project source code and set up the necessary libraries, including the org.json.jar file. After compiling the project using the javac command, users can launch the app via the terminal using the java command or using any java compiler for run the app. It will display live weather data with the option to refresh the information at any time.


This project serves as an excellent introduction to API integration in Java applications. It demonstrates how applications can connect to external web services, fetch dynamic data, and present it in a visually appealing format. The app's architecture is both scalable and maintainable, making it easy to expand with additional features like location-based searches or extended weather forecasts. Furthermore, the project emphasizes the importance of error handling and user experience in application development.


In conclusion, the Live Weather App is a practical example of how Java applications can interact with public APIs to deliver dynamic content to users. It highlights the power of combining Java programming with web technologies to create interactive and informative applications. The project provides a solid foundation for developers looking to explore API integration and GUI development in Java.

# OUTPUT

![Image](https://github.com/user-attachments/assets/35416e98-3de9-4c98-a855-027af813a6e8)

