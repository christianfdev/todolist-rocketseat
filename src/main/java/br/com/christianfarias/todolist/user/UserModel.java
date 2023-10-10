package br.com.christianfarias.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Utilizando as Annotations do lombok:
 * Se queremos Getters e Setters de todos os atributos da classe usamos @Data
 * Se queremos apenas Getters @Getter
 * Se queremos apenas Setters @Setter
 * 
 * Caso queira colocar alguma dessas Annotations para apenas um atributo específico basta colocá-lo logo acima do atributo em questão
 */

@Data
@Entity(name = "tb_users")
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;


    /**
     * Caso queira nomear no banco de dados de forma diferente do atributo
     * basta inserir a Annotation @Column acima do atributo
     * definindo o nome 
     */

    @Column(unique = true) // Define o atributo como único(vai definir no banco de dados como uma CONSTRAINT), para que não sejam criados outros com o mesmo username
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;



}
