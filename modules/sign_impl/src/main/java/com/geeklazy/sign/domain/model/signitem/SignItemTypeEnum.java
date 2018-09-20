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
	NORMAL(0, "计次卡"),
	DURATION(1, "计时卡"),
	COUNT(2, "计数卡"),
	ATTENDANCE(3, "考勤卡"),;
	private int value;
	private String desc;

	public static SignItemTypeEnum getEnumByValue(int value) {
		for (SignItemTypeEnum instance : SignItemTypeEnum.values())
			if (instance.value == value)
				return instance;

		return null;
	}

}
