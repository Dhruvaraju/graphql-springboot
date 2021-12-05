package learn.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="USER")
public class User {
    @Id
    @Column(name = "")
    private int Id;

}
