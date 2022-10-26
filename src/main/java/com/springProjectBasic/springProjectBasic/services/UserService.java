package com.springProjectBasic.springProjectBasic.services;

import com.springProjectBasic.springProjectBasic.entities.User;
import com.springProjectBasic.springProjectBasic.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Integer get_user_count_proc(){
        return userRepository.get_user_count_proc();
    }
    public String get_user_name_by_id_proc(Integer id){
        return userRepository.get_user_name_by_id_proc(id);
    }

    public List<User> findUsersByActiveAndDeptWithQuery(Boolean activeState, List<String> deptNameList) {
        return userRepository.findUsersByActiveAndDeptQuery(activeState,deptNameList);
    }
}
