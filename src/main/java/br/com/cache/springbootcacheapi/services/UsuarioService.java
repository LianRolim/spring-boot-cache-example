package br.com.cache.springbootcacheapi.services;

import br.com.cache.springbootcacheapi.component.DadosComponent;
import br.com.cache.springbootcacheapi.component.SlowServiceComponent;
import br.com.cache.springbootcacheapi.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
//diz ao spring onde guardar o cache
@CacheConfig(cacheNames={"usuarios"})
public class UsuarioService {

    @Autowired
    SlowServiceComponent slowServiceComponent;

    @Autowired
    DadosComponent dadosComponent;

    private List<UsuarioDTO> usuarios = new ArrayList<>();

    @PostConstruct
    private void fillUsers() {
        usuarios = dadosComponent.populaDadosRetorno();
    }

    //indica ao spring que eh para realizar o cache
    @Cacheable
    public List<UsuarioDTO> findAll() {
        slowServiceComponent.simularSlowService();
        return usuarios;
    }

    //indica ao spring que deve atualizar o cache, pois houve alteracao
    //do contrario nao ira retornar o dado atualizado/criado
    @CachePut
    public UsuarioDTO updateUsuario(UsuarioDTO obj) {
        this.usuarios.set(0, obj);
        return this.usuarios.get(0);
    }


}
