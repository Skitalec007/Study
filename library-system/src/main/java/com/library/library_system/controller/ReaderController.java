package com.library.library_system.controller;

import com.library.library_system.entity.Reader;
import com.library.library_system.repository.ReaderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/readers")
public class ReaderController {

    private final ReaderRepository readerRepository;

    public ReaderController(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    @GetMapping
    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Reader getReaderById(@PathVariable Long id) {
        Optional<Reader> reader = readerRepository.findById(id);
        return reader.orElse(null);
    }

    @PostMapping
    public Reader addReader(@RequestBody Reader reader) {
        return readerRepository.save(reader);
    }
}