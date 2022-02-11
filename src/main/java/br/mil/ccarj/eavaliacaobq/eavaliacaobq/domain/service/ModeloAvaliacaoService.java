package br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.service;

import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model.ModeloAvaliacao;
import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.repository.ModeloAvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloAvaliacaoService {

    @Autowired
    private ModeloAvaliacaoRepository modeloAvaliacaoRepository;

    public void salvar(ModeloAvaliacao modeloAvaliacao) throws Exception {
        modeloAvaliacaoRepository.save(modeloAvaliacao);
    }
    public void atualizar( ModeloAvaliacao modeloAvaliacao) throws Exception {
        modeloAvaliacaoRepository.save(modeloAvaliacao);
    }
    public void excluir(ModeloAvaliacao modeloAvaliacao) throws Exception {
        modeloAvaliacaoRepository.delete(modeloAvaliacao);
    }
    public List<ModeloAvaliacao> listarTodos() throws Exception {
        return modeloAvaliacaoRepository.findAll();
    }
    public ModeloAvaliacao buscaPorId(Long id) throws Exception {
        return modeloAvaliacaoRepository.findById(id).get();
    }


}
