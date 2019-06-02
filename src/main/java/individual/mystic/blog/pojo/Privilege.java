package individual.mystic.blog.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode(callSuper = true)
@Document
public class Privilege extends BaseEntity {

    @Indexed(unique = true)
    private String privilegedUrl;

}
