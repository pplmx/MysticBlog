package individual.mystic.blog.controller.handler;

import individual.mystic.blog.pojo.User;
import individual.mystic.blog.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

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

}
