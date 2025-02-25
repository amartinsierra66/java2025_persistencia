package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="alumnos")
public class Alumno {
	@Id
	private String dni;
	private String nombre;
	private int edad;
	private String email;
	
	@ManyToOne
	@JoinColumn(name="curso",referencedColumnName ="idCurso")
	private Curso curso;
}
