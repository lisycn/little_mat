package njust.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "competition")
@Data
public class Competition {

    @Id
    @GenericGenerator(name = "increment", strategy = "increment")
    @GeneratedValue(generator = "increment")
    private Integer comId;
    private String comName;

    @OneToMany(mappedBy = "competition")
    private Set<Resource> resources;
}