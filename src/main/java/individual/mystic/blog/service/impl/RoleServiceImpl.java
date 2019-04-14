package individual.mystic.blog.service.impl;

import individual.mystic.blog.dao.RoleDAO;
import individual.mystic.blog.pojo.Role;
import individual.mystic.blog.service.RoleService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDAO roleDAO;

    @Override
    public Mono<Role> save(Role role) {
        return roleDAO.save(role);
    }

    @Override
    public Mono<Void> remove(Role role) {
        return roleDAO.delete(role);
    }
}
