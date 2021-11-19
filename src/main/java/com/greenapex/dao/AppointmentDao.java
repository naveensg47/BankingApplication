package com.greenapex.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenapex.domain.Appointment;

import java.util.List;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
