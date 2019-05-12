package individual.mystic.blog.controller;

import individual.mystic.blog.dao.RoleDAO;
import individual.mystic.blog.pojo.Role;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/role", consumes = MediaType.APPLICATION_JSON_VALUE)
public class RoleController {
    @Resource
    private RoleDAO roleDAO;

    @PostMapping
    public Mono<Role> save(Role role) {
        return roleDAO.save(role);
    }
}
