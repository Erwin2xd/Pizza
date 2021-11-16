package pl.Erwin.Pizza.remote.rest.api;

import io.swagger.models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.Erwin.Pizza.domain.model.OrderStatusType;
import pl.Erwin.Pizza.remote.rest.dto.request.AddOrderDto;
import pl.Erwin.Pizza.remote.rest.dto.request.UpdatedOrderDto;
import pl.Erwin.Pizza.remote.rest.dto.response.OrderCollectionDto;
import pl.Erwin.Pizza.remote.rest.dto.response.OrderDto;
import pl.Erwin.Pizza.remote.rest.dto.response.TokenDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)
@RestController
public class OrderController {
    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto) {
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrder(
            @RequestParam("status") OrderStatusType orderStatusType,
            @RequestHeader("Access-Token") String token
    ) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrder(@RequestHeader("Access-Token") String token,
                                            @PathVariable("order-id") Integer orderId) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{order-id}")
    public ResponseEntity<OrderDto> updatedOrder(@PathVariable("order-id") Integer orderId,
                                                 @RequestHeader("Access-Token") String token,
                                                 @RequestBody UpdatedOrderDto updatedOrderDto) {
        return ResponseEntity.ok(null);
    }


}
