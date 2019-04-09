package com.herbtea.study.springbootdbstarter.mapper;

import com.herbtea.study.springbootdbstarter.domain.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {

    Users findUsersById(String id);
    void saveUsers(Users users);

}
