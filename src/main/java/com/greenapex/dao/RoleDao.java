package com.greenapex.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenapex.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Long> {
    Role findByName(String name);
}
