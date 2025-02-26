package model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="cuentas")
public class Cuenta {
	@Id
	private int numeroCuenta;
	private double saldo;
	private String tipoCuenta;
	@OneToMany(mappedBy = "cuenta")
	List<Movimiento> movimientos;
	@ManyToMany(mappedBy = "cuentas")
	List<Cliente> clientes;
} 
