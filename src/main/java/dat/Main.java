package dat;

import dat.config.ApplicationConfig;
import dat.controllers.impl.ExceptionController;
import dat.exceptions.ApiException;
import dat.exceptions.Message;
import dat.routes.Routes;
import io.javalin.Javalin;
import io.javalin.http.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting server on port 7007 hehe");
        ApplicationConfig.startServer(7007);
    }
}