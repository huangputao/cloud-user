package com.example.springcloud.service.impl;

import com.example.springcloud.entity.BonusEventLog;
import com.example.springcloud.mapper.BonusEventLogDao;
import com.example.springcloud.service.BonusEventLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ChaosBear
 * @since 2021-03-03
 */
@Service
public class BonusEventLogServiceImpl extends ServiceImpl<BonusEventLogDao, BonusEventLog> implements BonusEventLogService {

}
