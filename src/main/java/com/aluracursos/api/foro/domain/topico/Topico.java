package com.aluracursos.api.foro.domain.topico;

import com.aluracursos.api.foro.controller.DatosActualizarTopico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity(name = "Topico")
@Table(name = "topicos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;
    private String autor;
    private String curso;
    private Boolean activo;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.autor = datosRegistroTopico.idUsuario();
        this.curso = datosRegistroTopico.nombreCurso();
        this.fechaCreacion = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm"));
        this.activo = true;
    }

    public void actualizar(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo() != null) this.titulo = datosActualizarTopico.titulo();
        if(datosActualizarTopico.mensaje() != null) this.mensaje = datosActualizarTopico.mensaje();
        if (datosActualizarTopico.nombreCurso() != null) this.curso = datosActualizarTopico.nombreCurso();
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}
