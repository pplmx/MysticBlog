package individual.mystic.blog.service.impl;

import individual.mystic.blog.pojo.Article;
import individual.mystic.blog.service.ArticleService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Override
    public Mono<Article> save(Article article) {
        return null;
    }

    @Override
    public Mono<Article> findById(Article article) {
        return null;
    }

    @Override
    public Flux<Article> findAll() {
        return null;
    }

    @Override
    public Mono<Void> removeById(Article article) {
        return null;
    }
}
