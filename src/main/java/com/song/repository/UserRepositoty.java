package com.song.repository;

import com.song.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * 基于JPA，实现DAO层（即数据库数据的增删改查操作）:
 * <p>
 * <p>
 * 需要解释的是，Spring Data JPA提供了很多持久层接口，
 * 例如Repository,CrudRepositoty,PagingAndSortingRepository 以及JpaRepository 接口。
 * <p>
 * 其中Repository为基类，JpaRepository继承自PagingAndSortingRepository接口，
 * 两个泛型参数分别代表Java POJO类以及主键数据类型。
 * <p>
 * 我们创建自己的数据库操作接口时，只需继承上述JPA提供的某个接口，
 * 即可自动继承相关数据操作方法，而不需要再次实现。
 * <p>
 * 例如CrudRepositoty提供了对增删改查操作的实现，PagingAndSortingRepository提供了分页查询方法的实现。
 * <p>
 * 另外JPA提供了一套命名规则例如readBy**()等，这些方法也只需要用户申明而由JPA自动实现了。
 * <p>
 * 如果这仍不能满足业务需求，也可以自定义SQL查询语句，例如上述代码所示，采用@Query标签，
 * 其中 ：*语法为引用下面用@Param标识的变量，需要注意的是其中User不是表面而是Java POJO类名。
 * <p>
 * 具体使用参考JPA使用手册。
 * <p>
 * <p>
 * Created by IntelliJ IDEA.
 * User: zhangchao
 * Date: 2018/1/11/0011
 * Time: 11:19
 */
@Repository
public interface UserRepositoty extends JpaRepository<User, Long> {

    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
}
