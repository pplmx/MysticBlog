package individual.mystic.blog.controller;

import individual.mystic.blog.dao.RoleDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Resource
    private RoleDAO roleDAO;
}
