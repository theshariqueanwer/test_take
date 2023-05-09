package com.pack.user.api.serviceimplementation;


import com.pack.user.api.entity.User;
import com.pack.user.api.repository.UserRepository;
import com.pack.user.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    public Long getUserCode(){
        long first12 = (long) (Math.random() * 10000000000L);
        long userCode = 220000000000L + first12;
        return userCode;
    }

    public String getCreatedDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String createdDateAndTime = formatter.format(date);
        return createdDateAndTime;
    }

    public String getUpdatedDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String updatedDateAndTime = formatter.format(date);
        return updatedDateAndTime;
    }

    @Autowired
    @Inject
    @PersistantContext

    @EntityManager
    @Profiler
    @Qualifer
    @Value
    @Primary

    spring core
    spring aop
    spring mvc
    spring security
    spring rest


    private Integer id;
    private String userId;
    private Long userCode;
    private String name;
    private String email;
    private String mobile;
    private String username;
    private Date createDate;
    private String createdDate;
    private List<Date> updatedDate;
    private List<String> updateDate;
    private String updateCount;
    private String initiativeId;
    private String initiativeName;
    private String userUniqueCode;

    @Override
    public User postUser(User user) {

        user.setUserCode(getUserCode());
        user.setCreatedDate(getCreatedDate());
        if (user.isCreating() == true ) {
            user.setUpdateDate(null);
        }
        if (user.isCreating() == true ) {
            user.setUpdatedDate(null);
        }
        userRepository.save(user);
        return null;
    }
}
