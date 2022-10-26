package com.springProjectBasic.springProjectBasic.repository;

import com.springProjectBasic.springProjectBasic.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Procedure(value = "get_user_count1")
    public Integer get_user_count_proc();

    @Procedure("get_user_name_by_id")
    public String get_user_name_by_id_proc(Integer id);

    @Query("select u from User u where u.active=:activeState and u.dept in :deptNameList")
    List<User> findUsersByActiveAndDeptQuery(@Param("activeState") Boolean activeState,
                                             @Param("deptNameList") List<String> deptNameList);


}
