package com.example.springcloud.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChaosBear
 * @since 2021-03-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="BonusEventLog对象", description="")
public class BonusEventLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer userId;

    private Integer value;

    private String event;

    private LocalDateTime createTime;

    private String description;


    public static final String ID = "id";

    public static final String USER_ID = "user_id";

    public static final String VALUE = "value";

    public static final String EVENT = "event";

    public static final String CREATE_TIME = "create_time";

    public static final String DESCRIPTION = "description";

}
