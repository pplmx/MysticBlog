package individual.mystic.blog.dao;

import individual.mystic.blog.pojo.Tag;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagDAO extends ReactiveMongoRepository<Tag, Integer> {
}
