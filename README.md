# Weather Forecast

This project is a simple application that consumes an external weather forecast API and provides an API for Server-Sent Events (SSE) requests that send the weather forecast stream for one minute.

## Technologies Used

- Java
- Spring Boot
- Spring Webflux
- Spring SSE
- RestTemplate
- Jackson
- Lombok
- OpenAPI

## Getting Started

To run this application, you'll need to have Java installed on your machine. You can download it from the [Java website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Clone the repository

```bash
git clone https://github.com/acbueno/weather-forecast.git
cd weather-forecast
```
### Build and run the application
```bash
./mvnw spring-boot:run
```
The application will start on port 8080 by default.

### API Documentation
You can find the API documentation at http://localhost:8080/swagger-ui.html once the application is running.

### Usage
Getting the weather forecast
You can get the current weather forecast by making a GET request to /weather.

```bash
curl http://localhost:8080/weather
```
### Subscribing to the SSE stream
You can subscribe to the SSE stream for the weather forecast by making a GET request to /weather/stream. This stream will send the weather forecast every second for one minute.
```bash
curl http://localhost:8080/weather/stream
```
### Contributing
Contributions are welcome! If you find any issues or have any suggestions for improvement, please create a new issue or submit a pull request.
