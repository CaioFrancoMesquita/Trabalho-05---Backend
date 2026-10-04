package com.lab.jpa.gestaovagas.mapper;

import com.lab.jpa.gestaovagas.domain.model.Vaga;
import com.lab.jpa.gestaovagas.dto.VagaRequestDTO;
import com.lab.jpa.gestaovagas.dto.VagaResponseDTO;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-04T15:59:41-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.12 (Eclipse Adoptium)"
)
@Component
public class VagaMapperImpl implements VagaMapper {

    @Override
    public VagaResponseDTO toDTO(Vaga entity) {
        if ( entity == null ) {
            return null;
        }

        UUID id = null;
        String titulo = null;
        String descricao = null;
        Double salario = null;
        LocalDateTime dataCriacao = null;

        id = entity.getId();
        titulo = entity.getTitulo();
        descricao = entity.getDescricao();
        salario = entity.getSalario();
        dataCriacao = entity.getDataCriacao();

        VagaResponseDTO vagaResponseDTO = new VagaResponseDTO( id, titulo, descricao, salario, dataCriacao );

        return vagaResponseDTO;
    }

    @Override
    public Vaga toEntity(VagaRequestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Vaga.VagaBuilder vaga = Vaga.builder();

        vaga.titulo( dto.titulo() );
        vaga.descricao( dto.descricao() );
        if ( dto.salario() != null ) {
            vaga.salario( dto.salario() );
        }

        return vaga.build();
    }

    @Override
    public void updateEntityFromDTO(VagaRequestDTO dto, Vaga entity) {
        if ( dto == null ) {
            return;
        }

        entity.setTitulo( dto.titulo() );
        entity.setDescricao( dto.descricao() );
        if ( dto.salario() != null ) {
            entity.setSalario( dto.salario() );
        }
    }
}
