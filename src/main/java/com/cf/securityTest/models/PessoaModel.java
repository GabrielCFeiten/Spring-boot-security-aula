package com.cf.securityTest.models;

import com.cf.securityTest.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_pessoa")
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

}
