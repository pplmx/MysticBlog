package individual.mystic.blog.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Document
public class Role extends BaseEntity {
    @Indexed(unique = true)
    private String name;
    @DBRef
    private List<Privilege> privileges;
}
