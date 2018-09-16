package com.geeklazy.sign.application.service;

import com.geeklazy.sign.domain.model.group.Group;
import com.geeklazy.sign.domain.model.signrule.SignRule;
import com.geeklazy.sign.domain.model.user.User;

public interface ISignRuleService {
	void createSignRule(User user, SignRule signRule);
	void deleteSignRule(User user, String signRuleId);
	void updateSignRule(User group, SignRule signRule);

	void createSignRule(Group group, SignRule signRule);
	void deleteSignRule(Group group, String signRuleId);
	void updateSignRule(Group group, SignRule signRule);
}
