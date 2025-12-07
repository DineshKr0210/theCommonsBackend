package be.theCommons.consumerApp.controller;

import be.theCommons.consumerApp.dto.TypeDTO;
import be.theCommons.consumerApp.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/types")
@RequiredArgsConstructor
public class TypeController {
    private final TypeService typeService;

    @GetMapping
    public List<TypeDTO> getAllTypes() {
        return typeService.getAllTypes();
    }
}