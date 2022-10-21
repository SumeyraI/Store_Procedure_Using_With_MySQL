package com.springProjectBasic.springProjectBasic.repository;

import com.springProjectBasic.springProjectBasic.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Procedure(value = "get_user_count1")
    public Integer get_user_count_proc();


}
