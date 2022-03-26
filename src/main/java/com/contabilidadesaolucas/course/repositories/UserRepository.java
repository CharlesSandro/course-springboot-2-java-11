package com.contabilidadesaolucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contabilidadesaolucas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
