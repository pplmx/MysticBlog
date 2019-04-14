package individual.mystic.blog.dao;

import individual.mystic.blog.pojo.Role;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends ReactiveMongoRepository<Role, Integer> {
}
