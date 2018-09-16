package com.geeklazy.sign.domain.repository;

import com.geeklazy.sign.domain.model.signrule.SignRule;

public interface ISignRuleRepository {
	void save(SignRule signRule);
}
