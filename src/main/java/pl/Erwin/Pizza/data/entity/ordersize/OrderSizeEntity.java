package pl.Erwin.Pizza.data.entity.ordersize;

import javax.persistence.*;

@Entity
@Table(name = "ordersize")
public class OrderSizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "size_id")
    private Integer sizeId;

    @Column(name = "size_count")
    private Integer sizeCount;
}
