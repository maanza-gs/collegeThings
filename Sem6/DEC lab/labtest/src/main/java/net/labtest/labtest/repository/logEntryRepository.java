package net.labtest.labtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.labtest.labtest.model.logEntry;

@Repository
public interface logEntryRepository extends JpaRepository<logEntry, Long>{
}
