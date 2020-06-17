package be.ipeters.pma.entities;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EmployeeProject {
	private long employeeId;
	private long projectId;

}
