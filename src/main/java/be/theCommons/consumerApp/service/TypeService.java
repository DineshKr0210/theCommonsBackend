package be.theCommons.consumerApp.service;

import be.theCommons.consumerApp.dto.TypeDTO;

import java.util.List;

public interface TypeService {
    List<TypeDTO> getAllTypes();
}