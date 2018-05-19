package cn.edu.zjut.colleges.mapper;

import cn.edu.zjut.colleges.entity.College;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("collegeMapper")
@Mapper
public interface CollegeMapper {
    int deleteByPrimaryKey(Integer collegeId);

    int insert(College record);

    int insertSelective(College record);

    College selectByCollegeName(String collegeName);

    College selectByPrimaryKey(Integer collegeId);
    
    List<College> selectByExample(College example);

    List<College> selectVaguely(String condition);

    List<College> selectTop100College(int year);

    List<College> selectByFilterCondition(
            @Param("areas") List<String> areas,
            @Param("districts") List<String> districts,
            @Param("types") List<String> types,
            @Param("dfcTypes") List<String> dfcTypes,
            @Param("projects") List<Integer> projects,
            @Param("year") Short year);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);
}