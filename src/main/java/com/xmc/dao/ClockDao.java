package com.xmc.dao;

import com.xmc.entity.Clock;

/**
 * Created by Administrator on 2015/12/7.
 */
public interface ClockDao {

    int insert(Clock clock);

    int deleteById(Integer id);

    Clock getClockById(Integer id);

}
