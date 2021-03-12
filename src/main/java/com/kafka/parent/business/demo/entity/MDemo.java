package com.kafka.parent.business.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * </p>
 *
 * @author zj2626
 * @since 2020-03-18
 */
@Data
public class MDemo implements Serializable {
    private Long id;

    private String name;
    private String province;
    private String city;
    private String area;
    private String address;
    private Long companyId;
    private BigDecimal price;

}
