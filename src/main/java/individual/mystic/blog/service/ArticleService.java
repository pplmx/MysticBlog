package individual.mystic.blog.service;

import individual.mystic.blog.pojo.Article;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ArticleService {

    /**
     * add or update article
     * @param article Article
     * @return Article
     */
    Mono<Article> save(Article article);

    /**
     * find article by id
     * @param article Article
     * @return Article
     */
    Mono<Article> findById(Article article);

    /**
     * find all article
     * @return list
     */
    Flux<Article> findAll();

    /**
     * remove article by Id
     * @param article Article
     * @return void
     */
    Mono<Void> removeById(Article article);

}
