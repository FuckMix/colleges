package cn.edu.zjut.colleges.mapper;

import cn.edu.zjut.colleges.dto.District;

import java.util.List;

public interface DistrictMapper {
    int deleteByPrimaryKey(String district);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(String district);
    
    List<District> selectAllDistricts();

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}