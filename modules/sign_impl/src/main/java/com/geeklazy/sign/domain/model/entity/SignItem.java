package com.geeklazy.sign.domain.model.entity;

import com.geeklazy.sign.domain.model.signitem.SignItemTypeEnum;

import java.util.Date;

/**
 * 打卡项
 * - 场景(上班打卡,上课签到/退,运动计时(1日N次),收藏计数(无限制),活动签到,普通打卡(1日1次))
 * @Author heliuslee@live.cn
 * @Date 2018/09/18 13:48
 * @Description
 */
public class SignItem {
	private String id;// 全局唯一标识
	private SignItemTypeEnum type;// 打卡类型

	private Date effectiveDateTime;// 生效日期
	private Date expireDateTime;// 失效日期

	// 地点信息
	private double positionLatitude;// 经度
	private double postionLongitude;// 纬度
	private float effectiveRadius;// 有效半径

	// 时间信息
	private Date signInTime;// 签到时间
	private Date signOutTime;// 签退时间

	private Date flexibleSignInTime;// 灵活打卡时间
	private float flexibleDurationHour;// 灵活打卡时长


}
