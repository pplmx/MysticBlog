package individual.mystic.blog.controller.handler;

import individual.mystic.blog.pojo.User;
import individual.mystic.blog.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

@Component
public class UserHandler {

    @Resource
    private UserService userService;

    public Mono<ServerResponse> findById(ServerRequest request) {
        String id = request.pathVariable("id");
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(userService.findById(Integer.parseInt(id)), User.class);
    }

    public Mono<ServerResponse> findByName(ServerRequest request) {
        String name = request.pathVariable("name");
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(userService.findByName(name), User.class);
    }

    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(userService.findAll(), User.class);
    }

    public Mono<ServerResponse> save(ServerRequest request) {
        final Mono<User> user = request.bodyToMono(User.class);
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(user.flatMap(userService::save), User.class));
    }

    public Mono<ServerResponse> delete(ServerRequest request) {
        String name = request.pathVariable("name");
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(userService.deleteByName(name), Void.class);
    }

}
