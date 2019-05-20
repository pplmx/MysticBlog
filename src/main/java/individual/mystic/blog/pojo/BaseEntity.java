package individual.mystic.blog.pojo;

import lombok.Data;
import org.springframework.data.annotation.*;

import java.io.Serializable;
import java.util.Date;

@Data
class BaseEntity implements Serializable {


    @CreatedBy
    private String createdBy;

    @CreatedDate
    private Date createdDate;

    @LastModifiedBy
    private String updatedBy;

    @LastModifiedDate
    private Date updatedDate;

    @Version
    private Long version;

    private Boolean delete = Boolean.FALSE;

}
