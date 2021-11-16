package pl.Erwin.Pizza.remote.rest.api;

import io.swagger.models.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.Erwin.Pizza.remote.rest.dto.request.AddPizzaToMenuDto;
import pl.Erwin.Pizza.remote.rest.dto.response.PizzaDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/api/v1/pizzas", produces = APPLICATION_JSON_VALUE)
@RestController
public class PizzaController {
    @PostMapping
    public ResponseEntity<PizzaDto> addPizza(@RequestBody AddPizzaToMenuDto addPizzaToMenuDto,
                                             @RequestHeader("Access Token") String token
    ){
        return  ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PizzaDto> putPizza(@RequestBody AddPizzaToMenuDto addPizzaToMenuDto,
                                             @RequestHeader("Access Token") String token,
                                             @PathVariable("id") Integer id
    ){
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePizza(@RequestHeader("Access Token") String token,
                                            @PathVariable("order-id") Integer orderId) {
        return ResponseEntity.ok().build();
    }
}