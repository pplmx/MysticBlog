package individual.mystic.blog.service;

import individual.mystic.blog.pojo.User;
import reactor.core.publisher.Mono;

public interface UserService {

    /**
     * create user
     * @param user user info
     * @return the result of create
     */
    Mono<Integer> create(User user);
    Mono<Integer> update(User user);
    Mono<Integer> retrieve(User user);
    Mono<Integer> delete(User user);

}
