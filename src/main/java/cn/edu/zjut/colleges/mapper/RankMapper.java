package cn.edu.zjut.colleges.mapper;

import cn.edu.zjut.colleges.dto.Rank;
import cn.edu.zjut.colleges.dto.RankKey;

public interface RankMapper {
    int deleteByPrimaryKey(RankKey key);

    int insert(Rank record);

    int insertSelective(Rank record);

    Rank selectByPrimaryKey(RankKey key);

    int updateByPrimaryKeySelective(Rank record);

    int updateByPrimaryKey(Rank record);
}