# WeatherApp

## Overview
WeatherApp is a Java application designed for weather forecasting. It features a graphical user interface (GUI) that allows users to input a location and retrieve current weather data such as temperature, weather condition, humidity, and wind speed.

## Features
- **GUI:** Intuitive interface for user interaction.
- **Weather Data Retrieval:** Utilizes external APIs or services for fetching weather information.
- **JSON Parsing:** Parses JSON data to extract weather details.
- **Dynamic Weather Display:** Updates weather information in real-time based on user input.

## Installation
To run WeatherApp locally, follow these steps:
1. Clone the repository:
2. Navigate to the project directory:

3. Compile the Java files:
javac -cp .;path/to/json-simple-1.1.1.jar AppLauncher.java WeatherApp.java WeatherAppGui.java

4. Run the application:
java -cp .;path/to/json-simple-1.1.1.jar AppLauncher


Make sure to replace `path/to/json-simple-1.1.1.jar` with the actual path to your `json-simple-1.1.1.jar` file.

## Dependencies
- **json-simple:** 1.1.1 (included in `lib` directory)

## Usage
1. Launch the application.
2. Enter a location in the search field and click the search button.
3. View the current weather conditions displayed on the GUI.

## Contributing
Contributions are welcome! Fork the repository, make your changes, and submit a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

