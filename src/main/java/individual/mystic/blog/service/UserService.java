package individual.mystic.blog.service;

import individual.mystic.blog.pojo.User;
import reactor.core.publisher.Mono;

public interface UserService {

    /**
     * create or update user
     *
     * @param user user info
     * @return user
     */
    Mono<User> save(User user);

    /**
     * find user by id
     *
     * @param id id
     * @return User
     */
    Mono<User> findById(Integer id);

    /**
     * find user by name
     *
     * @param name name
     * @return User
     */
    Mono<User> findByName(String name);

    /**
     * remove user by username
     *
     * @param name name
     * @return the result of delete
     */
    Mono<Integer> remove(String name);

}
