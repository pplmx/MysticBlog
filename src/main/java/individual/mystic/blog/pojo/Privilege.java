package individual.mystic.blog.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@EqualsAndHashCode(callSuper = true)
public class Privilege extends BaseEntity {

    @Indexed(unique = true)
    private String privilegedUrl;

}
