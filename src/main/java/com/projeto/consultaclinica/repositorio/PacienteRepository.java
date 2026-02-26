package com.projeto.consultaclinica.repositorio;

import com.projeto.consultaclinica.model.Paciente;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PacienteRepository {
    private List<Paciente> pacientes = new ArrayList<>();

    public void addPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> getAll() {
        return pacientes;
    }

    public Optional<Paciente> getById(int id) {
        return pacientes.stream().filter(p -> p.getId() == id).findFirst();
    }

    public void removePaciente(Paciente paciente) {
        pacientes.remove(paciente);
    }
}