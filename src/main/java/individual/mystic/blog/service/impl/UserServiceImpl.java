package individual.mystic.blog.service.impl;

import individual.mystic.blog.dao.UserDAO;
import individual.mystic.blog.pojo.User;
import individual.mystic.blog.service.UserService;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public Mono<Integer> save(User user) {
        return null;
    }

    @Override
    public Mono<User> find(Integer id) {
        return null;
    }

    @Override
    public Mono<User> find(String name) {
        return null;
    }

    @Override
    public Mono<Integer> remove(Integer id) {
        return null;
    }
}
