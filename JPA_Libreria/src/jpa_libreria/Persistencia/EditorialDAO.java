/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa_libreria.Persistencia;

import java.util.List;
import jpa_libreria.entidades.Editorial;

/**
 *
 * @author elavincho
 */
public class EditorialDAO extends DAO<Editorial> {

    @Override
    public void eliminar(Editorial entidad) {
        super.eliminar(entidad);
    }

    @Override
    public void editar(Editorial entidad) {
        super.editar(entidad);
    }

    @Override
    public void guardar(Editorial entidad) {
        super.guardar(entidad);
    }

    public Editorial buscarPorNombre(String nombre) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", "%" + nombre + "%").getSingleResult();

        if (editorial != null) {
            System.out.println(editorial);
        }
        desconectar();
        return editorial;
    }

    public Editorial buscarPorId(int id) {
        conectar();
//        Editorial editorial = em.find(Editorial.class, id);

        Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (editorial != null) {
            System.out.println(editorial);
        }
        desconectar();
        return editorial;
    }

    public Editorial generarId(int id) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();

        desconectar();
        return editorial;
    }

    public Editorial modificarNombre(int id, String editName, boolean alta) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (editorial != null) {
            System.out.println(editorial);
        }
        editorial.setNombre(editName);
        editorial.setAlta(alta);
        editar(editorial);
        System.out.println(editorial);
        desconectar();
        return editorial;
    }

    public Editorial eliminar(int id) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT a FROM Editorial a WHERE a.id = :id")
                .setParameter("id", id).getSingleResult();
        if (editorial != null) {
            System.out.println(editorial);
        }
        eliminar(editorial);
        desconectar();
        return editorial;
    }

    public void listarTodos() {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT a FROM Editorial a").getResultList();
        desconectar();
        for (Editorial mostrarEditoriales : editoriales) {
            System.out.println(mostrarEditoriales);
        }
        desconectar();
    }

}
