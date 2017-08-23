package cn.zsza.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
/**
 * Created by zs on 2017/8/23.
 * 16:02
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;
}
