package be.theCommons.consumerApp.mapper;

import be.theCommons.consumerApp.dto.TypeDTO;
import be.theCommons.consumerApp.model.Type;

public class TypeMapper {
    public static TypeDTO toDTO(Type type) {
        if (type == null) return null;
        return TypeDTO.builder()
                .id(type.getId() != null ? Long.valueOf(type.getId()) : null)
                .name(type.getName())
                .build();
    }
}