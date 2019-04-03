package individual.mystic.blog.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@ToString
public class User {
    private Integer userID;
    private String userName;
    private String userPWD;
    private String userEmail;
    private String userPhone;
    private String userQQ;
    private int userSex;
    private String userLastLoginIP;
    private Date userLastLoginTime;
    private List<String> roles;
}
