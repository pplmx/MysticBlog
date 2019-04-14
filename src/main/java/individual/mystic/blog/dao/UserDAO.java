package individual.mystic.blog.dao;

import individual.mystic.blog.pojo.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserDAO extends ReactiveMongoRepository<User, Integer> {

    /**
     * find user by username
     *
     * @param username username
     * @return User
     */
    Mono<User> findUserByUserName(String username);

    /**
     * delete user by username
     *
     * @param username username
     * @return the result of delete
     */
    Mono<Integer> deleteUserByUserName(String username);

}
