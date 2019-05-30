package com.hpk.data.hpkdata.repository;

import com.hpk.data.hpkdata.model.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Integer> {
}
