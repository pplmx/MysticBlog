package individual.mystic.blog.service.impl;

import individual.mystic.blog.dao.UserDAO;
import individual.mystic.blog.pojo.User;
import individual.mystic.blog.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO dao;

    @Override
    public Mono<User> save(User user) {
        return dao.save(user)
                .doOnError(System.out::println)
                .onErrorResume(
                        e -> dao.findUserByUsername(user.getUsername())
                                .flatMap(originUser -> {
                                    user.setId(originUser.getId());
                                    return dao.save(user);
                                })
                );
    }

    @Override
    public Mono<User> findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public Mono<User> findByName(String name) {
        return dao.findUserByUsername(name);
    }

    @Override
    public Flux<User> findAll() {
        return dao.findAll();
    }

    @Override
    public Mono<Void> deleteByName(String name) {
        return dao.deleteUserByUsername(name);
    }
}
