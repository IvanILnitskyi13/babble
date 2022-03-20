package com.example.babble.temporaryData;

import com.example.babble.model.User;
import com.example.babble.model.UserAccount;
import com.example.babble.service.UserAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class TemporaryData implements ApplicationListener<ContextRefreshedEvent> {

   // private UserRepository userRepository;
    private UserAccountRepository userAccountRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        User user = new User();
        user.setEmail("test@gmail.com");
        user.setPassword("kowalski");

        UserAccount account = new UserAccount();
        account.setUser(user);
        userAccountRepository.save(account);

    }

}
