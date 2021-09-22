package DatajpaC.model;

import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="TABLE_PARENT")
   /* This is Data japa collections concept for storing the data in parent table  
    * PARENT_TABLE
    * !)storing serial wise data(example::-persons data
    * Child_TABLE
    * !!)child table we are storing data like persons data which ever stored that in parent table
    *  persons each person have multiple subjects and there marks will be stored child table
    * 
    *  */
public class Student {
	@Id  
 	@Column(name="STUDENT_Id")
	private Integer stdId;
	
	@Column(name="STUDENT_NAME")
	private String stdName;
	
	@Column(name="STUDENT_DEPO")
	private String stdDepo;
	
	/*PROCESS OF REPRESENTING LIST OF MARKS IN CHILD TABLE
	 * 
	 */
	@ElementCollection
	@CollectionTable(
			name="TABLE_CHILD",
	joinColumns = @JoinColumn(name="STUDENT_Id"))
	@OrderColumn(name="pos")
	@Column(name="marks")
	private List<Integer> marks;
	
	/*PROCESS OF REPRESENTINNG LIST OF MARKS USING MAPS CONCEPTS IN CHILD TABLE */
	
	@ElementCollection
	@CollectionTable(
			name="STUDENT_RESULT",
			joinColumns=@JoinColumn(name="STUDENT_Id"))
	        @MapKeyColumn(name="exam")
	        @Column(name="result")
	private Map<String,String>  result;
			
	
	
	
	
}
