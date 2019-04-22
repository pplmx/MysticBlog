package individual.mystic.blog.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Article extends BaseEntity {

    private Integer articleID;
    private String articleName;
    private String articleIP;
    private int articlePV;
    private int articleType;
    private String articleContent;
    private int articleTopShow;
    private int articleStar;
    private Integer userID;
    private Integer sortArticleID;

}
