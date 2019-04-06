package individual.mystic.blog.service;

import individual.mystic.blog.pojo.User;
import reactor.core.publisher.Mono;

public interface UserService {

    /**
     * create or update user
     *
     * @param user user info
     * @return the result of create or update
     */
    Mono<Integer> save(User user);

    /**
     * find user by id
     *
     * @param id id
     * @return User
     */
    Mono<User> find(Integer id);

    /**
     * find user by name
     *
     * @param name name
     * @return User
     */
    Mono<User> find(String name);

    /**
     * remove user by id
     *
     * @param id id
     * @return the result of delete
     */
    Mono<Integer> remove(Integer id);

}
