package pl.Erwin.Pizza.remote.rest.dto.request;

import pl.Erwin.Pizza.domain.model.OrderStatusType;
import pl.Erwin.Pizza.remote.rest.dto.common.PersonOrderDto;
import pl.Erwin.Pizza.remote.rest.dto.common.PizzaOrderDto;

import java.util.List;

public class UpdatedOrderDto {

    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public UpdatedOrderDto() {
    }

    public UpdatedOrderDto(OrderStatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }
}
