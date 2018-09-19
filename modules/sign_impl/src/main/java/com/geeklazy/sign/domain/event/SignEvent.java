package com.geeklazy.sign.domain.event;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author heliuslee@live.cn
 * @Date 2018/09/18 14:03
 * @Description
 */
@Getter
public class SignEvent {
	private String signRecordId;
	private Date signTime;
	private double signLatitude;
	private double signLongitude;
}
