package individual.mystic.blog.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode(callSuper = true)
@Document
public class Article extends BaseEntity {

    private String name;
    private String url;
    private int pv;
    private int type;
    private String content;
    private int topShow;
    private int star;
    @DBRef
    private User author;

}
