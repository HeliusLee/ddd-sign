package com.geeklazy.sign.application.service.impl;

import com.geeklazy.sign.application.service.ISignRuleService;
import com.geeklazy.sign.domain.model.group.Group;
import com.geeklazy.sign.domain.model.signrule.SignRule;
import com.geeklazy.sign.domain.model.user.User;
import com.geeklazy.sign.domain.repository.ISignRuleRepository;
import org.springframework.stereotype.Service;

@Service
public class SignRuleServiceImpl implements ISignRuleService {
	private ISignRuleRepository signRuleRepository;
	@Override
	public void createSignRule(User user, SignRule signRule) {

	}

	@Override
	public void deleteSignRule(User user, String signRuleId) {

	}

	@Override
	public void updateSignRule(User group, SignRule signRule) {

	}

	@Override
	public void createSignRule(Group group, SignRule signRule) {

	}

	@Override
	public void deleteSignRule(Group group, String signRuleId) {

	}

	@Override
	public void updateSignRule(Group group, SignRule signRule) {

	}
}
