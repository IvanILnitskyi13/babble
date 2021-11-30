package com.example.bubble.temporaryData;

import com.example.bubble.domain.User;
import com.example.bubble.domain.UserAccount;
import com.example.bubble.service.UserAccountRepository;
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
        userAccountRepository.save(new UserAccount(new User("test@gmail.com", "janek", "kowalski")));

    }

}
