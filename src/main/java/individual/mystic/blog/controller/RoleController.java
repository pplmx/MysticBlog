package individual.mystic.blog.controller;

import individual.mystic.blog.pojo.Role;
import individual.mystic.blog.service.RoleService;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@Api("Role Controller")
@RestController
@RequestMapping(value = "/role", consumes = MediaType.APPLICATION_JSON_VALUE)
public class RoleController {
    @Resource
    private RoleService roleService;

    @PostMapping
    public Mono<Role> save(@RequestBody Role role) {
        return roleService.save(role);
    }


    @DeleteMapping("/{id}")
    public Mono<Void> remove(@PathVariable Integer id) {
        return roleService.removeById(id);
    }
}
