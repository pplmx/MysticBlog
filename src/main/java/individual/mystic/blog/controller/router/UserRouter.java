package individual.mystic.blog.controller.router;

import individual.mystic.blog.controller.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class UserRouter {

    @Bean
    public RouterFunction<ServerResponse> route(UserHandler handler) {
        return RouterFunctions
                .route(
                        GET("/reactive/users").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(
                        GET("/reactive/user/{id}").and(accept(MediaType.APPLICATION_STREAM_JSON)), handler::findById)
                .andRoute(
                        POST("/reactive/user").and(accept(MediaType.APPLICATION_JSON)), handler::save)
                .andRoute(
                        DELETE("/reactive/user/{name}").and(accept(MediaType.APPLICATION_JSON)), handler::delete);
    }

}
