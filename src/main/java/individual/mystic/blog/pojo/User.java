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
    private Integer userID;
    @Indexed(unique = true)
    private String userName;
    private String userPWD;
    private String userEmail;
    private String userPhone;
    private String userQQ;
    private int userSex;
    private String userLastLoginIP;
    private Date userLastLoginTime;
    @DBRef
    private List<Role> roles;
}
