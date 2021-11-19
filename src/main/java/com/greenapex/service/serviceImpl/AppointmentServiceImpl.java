package com.greenapex.service.serviceImpl;

import com.greenapex.dao.AppointmentDao;
import com.greenapex.domain.Appointment;
import com.greenapex.service.AppointmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentDao appointmentDao;

    public Appointment createAppointment(Appointment appointment) {
        return appointmentDao.save(appointment);
    }

    public List<Appointment> findAll() {
        return appointmentDao.findAll();
    }

    public Appointment findAppointment(Long id) {
    	
    	Optional<Appointment> op=appointmentDao.findById(id);
    	
    	
    		Appointment appointment=op.orElse(null);
    	
        return appointment;
    }

    public void confirmAppointment(Long id) {
        Appointment appointment = findAppointment(id);
        appointment.setConfirmed(true);
        appointmentDao.save(appointment);
    }
}
