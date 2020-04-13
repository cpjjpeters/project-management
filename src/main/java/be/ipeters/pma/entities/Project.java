package be.ipeters.pma.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {
	@Id
	@GeneratedValue(GenerationType.AUTO)
	private long projectId;
	
	private String name;
	
	private String stage;  // NOTSTARTED, COMPLETED, INPROGRESS
	
	private String description;
	
	public Project(String name, String stage, String description) {
		super();
		this.name = name;
		this.stage = stage;
		this.description = description;
	}

}
