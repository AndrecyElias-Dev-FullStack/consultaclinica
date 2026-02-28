package com.projeto.consultaclinica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "paciente") // Nome da tabela no seu Workbench
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;

    // Getters e Setters...
}