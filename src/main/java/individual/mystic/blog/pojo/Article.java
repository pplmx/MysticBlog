package individual.mystic.blog.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode(callSuper = true)
@Document
public class Article extends BaseEntity {

    private String articleName;
    private String articleIP;
    private int articlePV;
    private int articleType;
    private String articleContent;
    private int articleTopShow;
    private int articleStar;
    private Integer userID;

}
