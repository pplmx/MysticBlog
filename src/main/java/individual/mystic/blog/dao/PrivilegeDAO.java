package individual.mystic.blog.dao;

import individual.mystic.blog.pojo.Privilege;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegeDAO extends ReactiveMongoRepository<Privilege, Integer> {
}
