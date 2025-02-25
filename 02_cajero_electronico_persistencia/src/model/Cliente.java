package model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="clientes")
public class Cliente {
	@Id
	private int dni;
	private String nombre;
	private String direccion;
	private int telefono;
	@ManyToMany
	@JoinTable(name="titulares",
			joinColumns = 
            @JoinColumn(name="idCliente", 
                                 referencedColumnName = "dni"),  
            inverseJoinColumns = 
            @JoinColumn(name="idCuenta", 
                               referencedColumnName ="numeroCuenta")) 
	private List<Cuenta> cuentas;
	@Override
	public String toString() {
		return nombre;
	}
	
	

} 
