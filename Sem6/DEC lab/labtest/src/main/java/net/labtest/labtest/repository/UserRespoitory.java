package net.labtest.labtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.labtest.labtest.model.users;

@Repository
public interface UserRespoitory extends JpaRepository<users, Long>{
}
