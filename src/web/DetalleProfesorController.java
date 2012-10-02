package universidad.web;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import universidad.service.ProfesorManager;

public class DetalleProfesorController implements Controller {
 protected final Log logger = LogFactory.getLog(getClass());
 private ProfesorManager ProfesorManager;

 public ModelAndView handleRequest(HttpServletRequest request, 
   HttpServletResponse response)
   throws ServletException, IOException {

   String now = (new java.util.Date()).toString();
   logger.info("returning profesor view with id " + request.getParameter("id"));

   Map<String, Object> myModel = new HashMap<String, Object>();
   myModel.put("now", now);
   myModel.put("profesor", this.ProfesorManager.findProfesor(request.getParameter("id")));

   return new ModelAndView("detalleProfesorView", "model", myModel);
 }

 public void setProfesorManager(ProfesorManager ProfesorManager) {
   this.ProfesorManager = ProfesorManager;
 }
}