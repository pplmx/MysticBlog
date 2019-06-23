package individual.mystic.blog.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Document
public class User extends BaseEntity {

    @Id
    private Integer id;
    @Indexed(unique = true)
    private String username;
    private String password;
    private String email;
    private String phone;
    private String qq;
    private int sex;
    private String lastLoginIp;
    private Date lastLoginDate;
    @DBRef
    private List<Role> roles;
}
