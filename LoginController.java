package com.jbk.Batch134HMSproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@Controller
public class LoginController {
	@Autowired
	SessionFactory sf;

	@RequestMapping("/")
	String login() {
		return "index";
	}

	@RequestMapping("/appointment1")
	String m(@ModelAttribute Appointment appointment) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		ss.save(appointment);
		tx.commit();
		return "index";

	}
}
