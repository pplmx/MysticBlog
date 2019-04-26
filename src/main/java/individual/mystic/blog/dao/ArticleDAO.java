package individual.mystic.blog.dao;

import individual.mystic.blog.pojo.Article;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDAO extends ReactiveMongoRepository<Article, Integer> {
}
