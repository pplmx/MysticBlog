package individual.mystic.blog.dao;

import individual.mystic.blog.pojo.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserDAO extends ReactiveMongoRepository<User, String> {

    /**
     * find user by username
     * @param username username
     * @return User
     */
    Mono<User> findUserByUserName(String username);

}
