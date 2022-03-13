package com.therealdanvega;

import com.abc.foo.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageControllerTradional {


    // creating object manually .
    public PageControllerTradional() {
        this.notificationService = new NotificationService();
    }

    private NotificationService notificationService;

    @RequestMapping("/default")
    public String home(){
        return "welcome to default";
    }

    @RequestMapping("/tradition")
    public String home_custom(){
        return notificationService.toString();
    }
}
