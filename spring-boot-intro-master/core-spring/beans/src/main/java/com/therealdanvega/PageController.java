package com.therealdanvega;

import com.abc.foo.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    // using property based injection
    /*@Autowired
    private NotificationService notificationService;*/


    //using setter injection
    /*@Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }*/

    //using constructor injection
    @Autowired
    public PageController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    private NotificationService notificationService;

    @RequestMapping("/")
    public String home(){
        return "welcome to default";
    }

    @RequestMapping("/custom")
    public String home_custom(){
        return notificationService.toString();
    }
}
