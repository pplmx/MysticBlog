package individual.mystic.blog.service.impl;

import individual.mystic.blog.pojo.Privilege;
import individual.mystic.blog.service.PrivilegeService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {
    @Override
    public <S extends Privilege> Mono<S> save(S entity) {
        return null;
    }

    @Override
    public Mono<Privilege> findById(Integer integer) {
        return null;
    }

    @Override
    public Flux<Privilege> findAll() {
        return null;
    }

    @Override
    public Mono<Void> remove(Integer integer) {
        return null;
    }
}
