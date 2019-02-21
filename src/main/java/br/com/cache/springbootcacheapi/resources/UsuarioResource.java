package br.com.cache.springbootcacheapi.resources;

import br.com.cache.springbootcacheapi.dto.UsuarioDTO;
import br.com.cache.springbootcacheapi.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {

    @Autowired
    UsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> findAll() {

        List<UsuarioDTO> dto = service.findAll();

        return ResponseEntity.ok().body(dto);
    }

    @PostMapping(value = "/update")
    public UsuarioDTO update(@RequestBody UsuarioDTO obj) {
        return service.updateUsuario(obj);
    }

}
