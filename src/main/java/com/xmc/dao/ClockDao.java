package com.xmc.dao;

import com.xmc.entity.Clock;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/12/7.
 */
@Component
public interface ClockDao {

    int insert(Clock clock);

    int deleteById(Integer id);

    Clock getClockById(Integer id);

}
