package com.jushi.admin.repository;

import com.jushi.api.pojo.po.SysUserPO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<SysUserPO,String> {


}
