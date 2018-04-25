package es.aytos.hibernate.web;

import java.io.*;
import java.util.*;

import javax.annotation.*;
import javax.faces.bean.*;

import es.aytos.hibernate.hibernate_dual.modelo.*;
import es.aytos.hibernate.hibernate_dual.repositorio.*;

@ManagedBean
@RequestScoped
public class PersonasManagedBean implements Serializable {

    private List<Persona> personas;

    public PersonasManagedBean() {
    }

    @PostConstruct
    public void inicializar() {
        this.personas = RepositorioPersona.consultar("", "", "", null, "");
    }

    public void eliminar(final Persona persona) {
        RepositorioPersona.eliminarPersona(persona.getIdUsuario());
    }

    public List<Persona> getPersonas() {
        return personas;
    }

}
