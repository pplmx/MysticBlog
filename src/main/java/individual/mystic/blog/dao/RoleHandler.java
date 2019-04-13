package individual.mystic.blog.dao;

import individual.mystic.blog.pojo.Role;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RoleHandler extends ReactiveMongoRepository<Role, Integer> {
}
