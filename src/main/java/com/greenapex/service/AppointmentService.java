package com.greenapex.service;

import java.util.List;

import com.greenapex.domain.Appointment;

public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
