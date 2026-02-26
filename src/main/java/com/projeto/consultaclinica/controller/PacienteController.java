package com.projeto.consultaclinica.controller;

import com.projeto.consultaclinica.servicos.PacienteService;
import com.projeto.consultaclinica.model.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller // Isso avisa ao Spring que esta classe gerencia páginas Web
public class PacienteController {

    // Criamos uma instância do seu serviço (o cérebro do sistema)
    private PacienteService service = new PacienteService();

    // Quando o usuário digitar "localhost:8080/pacientes" no navegador:
    @GetMapping("/pacientes")
    public String listarPacientes(Model model) {

        // 1. Pegamos a lista que você já sabe gerar no console
        List<Paciente> lista = service.listarPacientes();

        // 2. "Penduramos" essa lista em um objeto chamado Model
        // O nome "pacientesNoHtml" é como chamaremos a lista dentro do HTML
        model.addAttribute("pacientesNoHtml", lista);

        // 3. Abrimos o arquivo chamado "lista.html" (que vamos criar)
        return "lista";
    }
}