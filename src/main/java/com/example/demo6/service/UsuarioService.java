/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo6.service;

import com.example.demo6.emtity.Tarea;
import com.example.demo6.emtity.Usuario;
import com.example.demo6.repository.UsuarioRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author usuario
 */
@Service
public class UsuarioService {
    private final UsuarioRepository usuRepository;
    
    public UsuarioService (UsuarioRepository usuRepository){
        this.usuRepository = usuRepository;
    }
    public List<Usuario> listarUsuarios(){
        
//        List<Usuario> usuarios=usuRepository.verUsuarios();
        List<Usuario> usuarios=usuRepository.findAll();
        
       
        try{
              List<Tarea> tareas=usuRepository.verTareas(1);
        }
        catch(Exception e){
                int x =1;
                }
      
        return usuarios;
        
                
    }
    
}
