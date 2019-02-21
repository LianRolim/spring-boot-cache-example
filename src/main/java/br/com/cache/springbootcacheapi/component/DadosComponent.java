package br.com.cache.springbootcacheapi.component;

import br.com.cache.springbootcacheapi.dto.UsuarioDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DadosComponent {

    public List<UsuarioDTO> populaDadosRetorno(){

        List<UsuarioDTO> usuarios = new ArrayList<>();

        usuarios.add(UsuarioDTO
                .builder()
                .nome("Lian Rolim")
                .telefone("998877757")
                .sexo("MASCULINO")
                .idade(27)
                .build());

        usuarios.add(UsuarioDTO
                .builder()
                .nome("João Da Silva")
                .telefone("887645991")
                .sexo("MASCULINO")
                .idade(30)
                .build());

        usuarios.add(UsuarioDTO
                .builder()
                .nome("Fernanda Nós")
                .telefone("99191545")
                .sexo("FEMININO")
                .idade(25)
                .build());

        usuarios.add(UsuarioDTO
                .builder()
                .nome("Gabriela Da Rosa")
                .telefone("988657434")
                .sexo("FEMININO")
                .idade(18)
                .build());

        return usuarios;

    }

}
