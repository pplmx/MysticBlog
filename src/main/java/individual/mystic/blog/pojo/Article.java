package individual.mystic.blog.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Document
public class Article extends BaseEntity {

    /**
     * article title
     */
    private String name;
    /**
     * relative path
     * ex: https://mysite.com/articles/1092
     * url: /articles/1092
     */
    private String url;
    /**
     * page view
     */
    private int pv;
    private String content;
    private int topShow;
    private int star;
    /**
     * article tags
     * ex: java,python,linux,etc.
     */
    @DBRef
    private List<Tag> tags;
    @DBRef
    private User author;

}
