package individual.mystic.blog.service.impl;

import individual.mystic.blog.dao.PrivilegeDAO;
import individual.mystic.blog.pojo.Privilege;
import individual.mystic.blog.service.PrivilegeService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {

    @Resource
    private PrivilegeDAO dao;

    @Override
    public Mono<Privilege> save(Privilege entity) {
        return dao.save(entity);
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
    public Mono<Void> removeById(Integer integer) {
        return null;
    }
}
