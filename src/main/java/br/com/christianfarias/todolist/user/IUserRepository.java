package br.com.christianfarias.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Aqui será aplicado o conceito de repository
 * Que é o responsável por gerenciar as "ações" do User
 * 
 */

/**
 * Uma interface contém a representação dos métodos
 */

public interface IUserRepository extends JpaRepository<UserModel, UUID>{
   UserModel findByUsername(String username);
    
}
