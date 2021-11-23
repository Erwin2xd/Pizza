package pl.Erwin.Pizza.data.entity.ordersize;

import pl.Erwin.Pizza.data.entity.order.OrderEntity;
import pl.Erwin.Pizza.data.entity.pizza.PizzaEntity;
import pl.Erwin.Pizza.data.entity.size.SizeEntity;

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

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "size_id", insertable = false, updatable = false)
    private SizeEntity size;
}
