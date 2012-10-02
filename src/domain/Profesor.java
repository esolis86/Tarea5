package universidad.domain;

import java.io.Serializable;

public class Profesor implements Serializable
{
private String nombre;
private String id;
private String titulo;

public String getnombre()
{
return nombre;
}

public void setNombProf(String nombre)
{
nombre=nombre;
}

public String getId()
{
return idP;
}

public void setId(String id)
{
idProf=id;
}

public String getTitulo()
{
return titulo;
}

public void setTitulo(String titulo)
{
this.titulo = titulo;
}
}