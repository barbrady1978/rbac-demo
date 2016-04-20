package com.tescobank.rbac.rest.listener;


import com.tescobank.rbac.rest.entity.User;
import com.tescobank.rbac.rest.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    final static Logger logger = LoggerFactory.getLogger(StartupListener.class);

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        if (event.getApplicationContext().getDisplayName().equals("Root WebApplicationContext")) {

            logger.info("***** Adding initial data *****");
            logger.info("***** Adding users *****");

            User user1 = new User();
            user1.setFirstName("David");
            user1.setLastName("Ronaldo");

            userService.save(user1);
        }

    }
}
