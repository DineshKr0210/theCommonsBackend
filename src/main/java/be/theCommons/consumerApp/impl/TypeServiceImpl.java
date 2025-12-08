package be.theCommons.consumerApp.impl;

import be.theCommons.consumerApp.dao.TypeRepository;
import be.theCommons.consumerApp.dto.TypeDTO;
import be.theCommons.consumerApp.mapper.TypeMapper;
import be.theCommons.consumerApp.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypeServiceImpl implements TypeService {
    private final TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    @Cacheable("AllTypes")
    public List<TypeDTO> getAllTypes() {
        return typeRepository.findAll().stream()
                .map(TypeMapper::toDTO)
                .collect(Collectors.toList());
    }
}