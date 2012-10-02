package universidad.service;
import java.io.Serializable;
import java.util.List;

import universidad.domain.Profesor;
public interface ProfesorManager extends Serializable{
   public List<Profesor> getProfesores();
   public Profesor findProfesor(String id);
}