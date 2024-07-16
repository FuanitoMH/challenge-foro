package com.aluracursos.api.foro.domain.topico;

public record DatosRespuestaTopico(Long id, String titulo, String mesaje, String fechaCreacion) {

    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion());
    }
}
