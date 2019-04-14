package individual.mystic.blog.controller;

import individual.mystic.blog.pojo.User;
import individual.mystic.blog.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * narrow the request mapping based on the 'Content-Type' of the request
     * only permit 'application/json' request
     * @param user user
     * @return user
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<User> save(User user) {
        return userService.save(user);
    }

    /**
     * narrow the request mapping based on the 'Content-Type' of the request
     * !text/plain means any content type other than text/plain
     * @param user user
     * @return the result of delete user
     */
    @DeleteMapping(consumes = "!text/plain")
    public Mono<Integer> remove(User user) {
        return userService.remove(user.getUserName());
    }

}
