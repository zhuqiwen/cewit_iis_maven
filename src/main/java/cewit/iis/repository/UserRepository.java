package cewit.iis.repository;

import cewit.iis.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by zqw on 3/15/17.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
}
