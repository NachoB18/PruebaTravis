package domain;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private LocalDate fechaNacimiento;
	
	public Persona(LocalDate fechaNac) {
		fechaNacimiento = fechaNac;
	};
	
	public boolean mayorA18() {
		LocalDate actual = LocalDate.now();
		Integer edad = Period.between(fechaNacimiento, actual).getYears();
		if(edad < 18) {
			return false;
		} else {
			return true;
		}
	}
}
