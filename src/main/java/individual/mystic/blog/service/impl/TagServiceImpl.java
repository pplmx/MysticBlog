package individual.mystic.blog.service.impl;

import individual.mystic.blog.pojo.Tag;
import individual.mystic.blog.service.TagService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TagServiceImpl implements TagService {
    @Override
    public Mono<Tag> save(Tag entity) {
        return null;
    }

    @Override
    public Mono<Tag> findById(Integer integer) {
        return null;
    }

    @Override
    public Flux<Tag> findAll() {
        return null;
    }

    @Override
    public Mono<Void> removeById(Integer integer) {
        return null;
    }
}
