package individual.mystic.blog.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@ToString
@Document
public class Role implements Serializable {
    @Indexed(unique = true)
    private String roleName;
}
