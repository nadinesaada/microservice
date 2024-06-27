/**
 * 
 */
package tn.esprit.servicereclamation.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.servicereclamation.enums.ReclamationStatus;

@Entity
@Table(name = "reclamation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reclamation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;
	
	@Column(name = "userId")
	private Long userId;
	
	@Column(name = "productId")
	private Long productId;

	@Column(name = "dateReclamation")
	private Date dateReclamation;
			
	@Column(name = "status")
	private ReclamationStatus status;
}
