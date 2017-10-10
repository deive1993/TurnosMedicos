package models;


public class PersonaGenero {
    private Integer id;
    private String nombre;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PersonaGenero(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    

    
}
