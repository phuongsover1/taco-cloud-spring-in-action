package tacos.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.domain.TacoOrder;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/current")
    public String orderForm(Model model) {
    model.addAttribute("order", new TacoOrder());
        return "orderForm";
    }

    @PostMapping
    public String processOrder(TacoOrder order){
        log.info("Order submittted: " + order);
        return "redirect:/";
    }
}
