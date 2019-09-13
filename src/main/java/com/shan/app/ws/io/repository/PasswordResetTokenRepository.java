package com.shan.app.ws.io.repository;

import org.springframework.data.repository.CrudRepository;

import com.shan.app.ws.io.entity.PasswordResetTokenEntity;

public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long>{
	PasswordResetTokenEntity findByToken(String token);
}
