package individual.mystic.blog.service.impl;

import individual.mystic.blog.dao.ArticleDAO;
import individual.mystic.blog.pojo.Article;
import individual.mystic.blog.service.ArticleService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleDAO dao;

    @Override
    public Mono<Article> save(Article entity) {
        return dao.save(entity);
    }

    @Override
    public Mono<Article> findById(Integer integer) {
        return dao.findById(integer);
    }

    @Override
    public Flux<Article> findAll() {
        return dao.findAll();
    }

    @Override
    public Mono<Void> removeById(Integer integer) {
        return dao.deleteById(integer);
    }
}
