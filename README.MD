### HttpLoggerStarter - Spring Boot Starter для логирования HTTP запросов

### Применение:
1. Склонировать проект
    ```bash
   $ git clone https://github.com/gulllak/HttpLoggerStarter.git
   ```
2. Открыть проект в Idea и в консоле выполнить команду, чтобы добавить http-logger-spring-boot-starter в локальный репозиторий Maven.
   ```bash
      $ mvn clean install
   ```
3. Добавить зависимость в ваше приложение на базе Spring Boot, в котором хотите видеть логи запросов и ответов к REST контроллеру.
   ```
   <dependency>
       <groupId>ru.evgenii.httplogger</groupId>
       <artifactId>http-logger-spring-boot-starter</artifactId>
       <version>1.0.0</version>
   </dependency>
   ```
4. Чтобы активировать логирование прописать в **application.properties** свойство.
   ```
   endpoint.logging.active=true
   ```

### Вывод логов:
Логи будут выводиться в следующем формате:
   ```
   2024-05-22T13:56:26.196+03:00  INFO 1926 --- [MethodTimeSpringAOP] [nio-8080-exec-2] r.e.h.h.config.LoggingInterceptor        : Лог HTTP 
   =========================================
   Тип запроса: GET
   URI эндпоинта: http://localhost:8080/stats/average/method
   Статус: 200
   Заголовки запроса: {postman-token=5d475e7e-3916-4fef-8419-a3ec1bef2a55, host=localhost:8080, connection=keep-alive, accept-encoding=gzip, deflate, br, user-agent=PostmanRuntime/7.39.0, accept=*/*}
   Заголовки ответа: {Transfer-Encoding=chunked, Keep-Alive=timeout=60, Connection=keep-alive, Date=Wed, 22 May 2024 10:56:26 GMT, Content-Type=application/json}
   Время выполнения запроса: 69 мс
   =========================================
   ```

### 🏄 Стек:
Java 21, SpringBoot 3, Maven, Interceptors


