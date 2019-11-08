package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import domain.Persona;

class testEdadTravis {

	@Test
	void testPositivo() {
		LocalDate nacimiento = LocalDate.now().minusYears(18);
		Persona p = new Persona(nacimiento);
		Boolean positivo = p.mayorA18();
		assertTrue(positivo);
	}
	@Test
	void testNegativo() {
		LocalDate nacimiento = LocalDate.now().minusYears(15);
		Persona p = new Persona(nacimiento);
		Boolean negativo = p.mayorA18();
		assertTrue(negativo);
	}

}
