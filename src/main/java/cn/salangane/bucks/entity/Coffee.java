package cn.salangane.bucks.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.joda.money.Money;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yignpeili
 * @date 2019/10/30 22:28
 */
@Entity
@Table(name = "t_menu")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coffee implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Column
    @Type(type = "org.jadira.usertype.moneyandcurrency.joad.PersistenMoneyAmount",
    parameters = {@org.hibernate.annotations.Parameter(name = "currencyCode",value="CNY")})
    private Money price;
    @Column(updatable = false)
    @CreationTimestamp
    private Date createTime;
    @UpdateTimestamp
    private Date updateTime;
}
