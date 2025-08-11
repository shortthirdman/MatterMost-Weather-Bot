# MatterMost Weather Bot

- Connects to MatterMost via webhooks.
- Fetches weather data from OpenWeatherMap API.
- Posts daily weather updates at 9:00 AM.

---

### Test the Endpoint

```shell
curl "http://localhost:8080/message" -d'{"text":"Hello from bot", "channel": "town-square"}' -H "Content-type:application/json"
```

```shell
curl "https://api.openweathermap.org/data/2.5/weather?q=London&units=metric&appid=YOUR_API_KEY"
```

```json
{
  "coord": {
    "lon": -0.1257,
    "lat": 51.5085
  },
  "weather": [
    {
      "id": 800,
      "main": "Clear",
      "description": "clear sky",
      "icon": "01d"
    }
  ],
  "base": "stations",
  "main": {
    "temp": 8.09,
    "feels_like": 5.6,
    "temp_min": 6.45,
    "temp_max": 9.03,
    "pressure": 1016,
    "humidity": 79,
    "sea_level": 1016,
    "grnd_level": 1012
  },
  "visibility": 10000,
  "wind": {
    "speed": 4.12,
    "deg": 240
  },
  "clouds": {
    "all": 1
  },
  "dt": 1732617133,
  "sys": {
    "type": 2,
    "id": 2075535,
    "country": "GB",
    "sunrise": 1732606632,
    "sunset": 1732636740
  },
  "timezone": 0,
  "id": 2643743,
  "name": "London",
  "cod": 200
}
```

```shell
curl "http://localhost:8080/weather?city=London&country=England"
```

```json
{
  "base": "stations",
  "clouds": {
    "all": 65
  },
  "cod": 200,
  "coord": {
    "lat": 51.5085,
    "lon": -0.1257
  },
  "dt": 1732763903,
  "id": 2643743,
  "main": {
    "humidity": 90,
    "pressure": 1025,
    "temp": 274.86,
    "feels_like": 273.29,
    "grnd_level": 1022,
    "sea_level": 1025,
    "temp_max": 276.01,
    "temp_min": 272
  },
  "name": "London",
  "sys": {
    "country": "GB",
    "id": 2075535,
    "sunrise": 1732779612,
    "sunset": 1732809441,
    "type": 2
  },
  "timezone": 0,
  "visibility": 10000,
  "weather": [
    {
      "description": "broken clouds",
      "icon": "04n",
      "id": 803,
      "main": "Clouds"
    }
  ],
  "wind": {
    "deg": 280,
    "speed": 1.54
  }
}
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.4/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.4/gradle-plugin/packaging-oci-image.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.5.4/reference/using/devtools.html)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/3.5.4/specification/configuration-metadata/annotation-processor.html)
* [Docker Compose Support](https://docs.spring.io/spring-boot/3.5.4/reference/features/dev-services.html#features.dev-services.docker-compose)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/3.5.4/reference/web/reactive.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.4/reference/web/servlet.html)
* [Spring Web Services](https://docs.spring.io/spring-boot/3.5.4/reference/io/webservices.html)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/3.5.4/reference/data/sql.html#data.sql.jdbc)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.5.4/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Java Mail Sender](https://docs.spring.io/spring-boot/3.5.4/reference/io/email.html)
* [Quartz Scheduler](https://docs.spring.io/spring-boot/3.5.4/reference/io/quartz.html)
* [Validation](https://docs.spring.io/spring-boot/3.5.4/reference/io/validation.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/3.5.4/reference/actuator/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* postgres: [`postgres:latest`](https://hub.docker.com/_/postgres)

Please review the tags of the used images and set them to the same as you're running in production.

