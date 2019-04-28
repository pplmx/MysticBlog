package individual.mystic.blog.service.impl;

import individual.mystic.blog.dao.RoleDAO;
import individual.mystic.blog.pojo.Role;
import individual.mystic.blog.service.RoleService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDAO dao;

    @Override
    public Mono<Role> save(Role entity) {
        return dao.save(entity);
    }

    @Override
    public Mono<Role> findById(Integer integer) {
        return null;
    }

    @Override
    public Flux<Role> findAll() {
        return null;
    }

    @Override
    public Mono<Void> removeById(Integer integer) {
        return null;
    }
}
