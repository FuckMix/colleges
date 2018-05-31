package cn.edu.zjut.colleges.mapper;

import cn.edu.zjut.colleges.dto.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("myUserMapper")
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    @Insert("insert into users(account,password,email,sex,birthday,native_place) " +
            "values(#{account},#{password},#{email},#{sex},#{birthday},#{nativePlace})")
    @Options(keyProperty = "userId", keyColumn = "user_id", useGeneratedKeys = true)
    int insert(User record);

//    int insertSelective(User record);

    @Results(id = "userResultMap",
            value = {
                    @Result(column = "user_id", property = "userId", id = true, jdbcType = JdbcType.INTEGER),
                    @Result(column = "account", property = "account", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
                    @Result(column = "sex", property = "sex", jdbcType = JdbcType.TINYINT),
                    @Result(column = "birthday", property = "birthday", jdbcType = JdbcType.DATE),
                    @Result(column = "native_place", property = "nativePlace", jdbcType = JdbcType.VARCHAR)
            }
    )
    @Select("select * from users where user_id = #{userId}")
    User selectByPrimaryKey(@Param("userId") Integer userId);


    int updateByPrimaryKeySelective(User record);


    @ResultMap("userResultMap")
    @Select("select * from users where account=#{account} and password=#{password}")
    User selectByAccountAndPassword(
            @Param("account") String account,
            @Param("password") String password
    );

    @ResultMap("userResultMap")
    @Select("select * from users")
    List<User> selectAllUsers();

//    class UserSqlBuilder {
//        public static String buildInsertSelective(User user) {
//            return new SQL() {
//                {
//                    INSERT_INTO("users");
//                    if (user.getAccount() != null)
//                        VALUES("account","#{account");
//                    if (user.getPassword() != null)
//                        VALUES("password","#{password}");
//                    if (user.getSex() != null)
//                        VALUES("sex","#{sex}");
//                    if (user.getBirthday() != null)
//                        VALUES("birthday","#{birthday}");
//                    if (user.getNativePlace() != null)
//                        VALUES("native_place","#{nativePlace}");
//                }
//            }.toString();
//        }
//    }
}