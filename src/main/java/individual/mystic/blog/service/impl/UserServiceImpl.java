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
    private UserDAO userDAO;

    @Override
    public Mono<User> save(User user) {
        return userDAO.save(user)
                .doOnError(System.out::println)
                .onErrorResume(e -> userDAO.findUserByUserName(user.getUserName())
                        .flatMap(originUser -> {
                            user.setUserID(originUser.getUserID());
                            return userDAO.save(user);
                        })
                );
    }

    @Override
    public Mono<User> findById(Integer id) {
        return userDAO.findById(id);
    }

    @Override
    public Mono<User> findByName(String name) {
        return userDAO.findUserByUserName(name);
    }

    @Override
    public Flux<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public Mono<Void> deleteByName(String name) {
        return userDAO.deleteUserByUserName(name);
    }
}
