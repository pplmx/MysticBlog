package individual.mystic.blog.controller;

import individual.mystic.blog.pojo.User;
import individual.mystic.blog.service.UserService;
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

    @PostMapping
    public Mono<User> save(User user) {
        return userService.save(user);
    }

    @DeleteMapping
    public Mono<Integer> remove(User user) {
        return userService.remove(user.getUserName());
    }

}
