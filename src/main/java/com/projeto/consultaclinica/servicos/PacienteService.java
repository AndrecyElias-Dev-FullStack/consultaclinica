package com.projeto.consultaclinica.servicos;

import com.projeto.consultaclinica.model.Paciente;
import com.projeto.consultaclinica.repositorio.PacienteRepository;
import java.util.List;
import java.util.Optional;

public class PacienteService {

    private PacienteRepository repository;

    // Construtor: facilita a manutenção do código
    public PacienteService() {
        this.repository = new PacienteRepository();
    }

    public void criarPaciente(Paciente paciente) {
        // Exemplo de validação simples
        if (paciente.getNome() != null && !paciente.getNome().isEmpty()) {
            repository.addPaciente(paciente);
        }
    }

    public List<Paciente> listarPacientes() {
        return repository.getAll();
    }

    public boolean atualizarPaciente(int id, String novoNome, int novaIdade, String novoTelefone) {
        Optional<Paciente> pacienteOpt = repository.getById(id);

        if (pacienteOpt.isPresent()) {
            Paciente p = pacienteOpt.get();
            p.setNome(novoNome);
            p.setIdade(novaIdade);
            p.setTelefone(novoTelefone);
            return true; // Sucesso
        }
        return false; // Paciente não encontrado
    }

    public boolean deletarPaciente(int id) {
        Optional<Paciente> pacienteOpt = repository.getById(id);
        if (pacienteOpt.isPresent()) {
            repository.removePaciente(pacienteOpt.get());
            return true;
        }
        return false;
    }
}