package com.geeklazy.sign.domain.model.signitem;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author heliuslee@live.cn
 * @Date 2018/09/19 18:07
 * @Description
 */
@Getter
@AllArgsConstructor
public enum SignItemTypeEnum {
	OTHER(0, "其他打卡"),
	TIMES(1, "计次卡"),
	DURATION(2, "计时卡"),
	COUNT(3,"计数卡"),
	;
	private int code;
	private String desc;


}
