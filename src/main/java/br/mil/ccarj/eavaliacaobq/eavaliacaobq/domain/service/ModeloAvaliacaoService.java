package br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.service;

import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model.ModeloAvaliacao;
import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.repository.ModeloAvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloAvaliacaoService {

    @Autowired
    private ModeloAvaliacaoRepository modeloAvaliacaoRepository;

    public ModeloAvaliacao salvar(ModeloAvaliacao modeloAvaliacao) throws Exception {
        return  modeloAvaliacaoRepository.save(modeloAvaliacao);
    }
    public ModeloAvaliacao atualizar( ModeloAvaliacao modeloAvaliacao) throws Exception {
        modeloAvaliacaoRepository.save(modeloAvaliacao);
        return modeloAvaliacao;
    }
    public void excluir(Long id) throws Exception {
        modeloAvaliacaoRepository.deleteById(id);
    }
    public List<ModeloAvaliacao> listarTodos() throws Exception {
        return modeloAvaliacaoRepository.findAll();
    }
    public ModeloAvaliacao buscaPorId(Long id) throws Exception {
        return modeloAvaliacaoRepository.findById(id).get();
    }


}
