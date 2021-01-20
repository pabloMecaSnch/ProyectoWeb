/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo6.repository;

import com.example.demo6.emtity.Tarea;
import com.example.demo6.emtity.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author usuario
 */
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
    
 @Query("select u from Usuario u")
 public List<Usuario> verUsusarios();
 
  @Query("select u from Usuario u where u.nombre=?1 and u.password=?2" )
    public Usuario validar(String nombre, String password );
    
    @Query("select u.tareaList from Usuario u where u.idusuario=?1")
    public List<Tarea> verTareas(Integer id);
    
 
}
