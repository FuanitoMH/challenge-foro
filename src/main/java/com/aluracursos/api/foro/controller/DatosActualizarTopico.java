package com.aluracursos.api.foro.controller;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, String nombreCurso) {

}
