package cn.zsza.repository;

import cn.zsza.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zs on 2017/8/23.
 * 16:10
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
