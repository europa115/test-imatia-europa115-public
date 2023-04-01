package com.imatia.statemachine.data.repository;

import com.imatia.statemachine.data.entity.TrackingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingStatusRepository extends JpaRepository<TrackingStatus,Integer> {
}
