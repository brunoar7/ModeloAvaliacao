package br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.service;


import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.dto.ModeloAvaliacaoDto;
import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.exception.EntidadeNaoEncontradaException;
import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model.ModeloAvaliacao;
import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.repository.ModeloAvaliacaoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ModeloAvaliacaoService {

    @Autowired                        //injecao de dependencias
    private ModeloAvaliacaoRepository modeloAvaliacaoRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ModeloAvaliacaoDto salvar(@Valid ModeloAvaliacaoDto modeloAvaliacaoDto) throws Exception {
        ModeloAvaliacao modeloAvalicaoSalvo = modeloAvaliacaoRepository.save(modelMapper.map(modeloAvaliacaoDto, ModeloAvaliacao.class));
        return modelMapper.map(modeloAvalicaoSalvo, ModeloAvaliacaoDto.class);
    }

    public ModeloAvaliacaoDto atualizar(Long id, ModeloAvaliacaoDto modeloAvaliacaoDto) throws Exception {
        Optional<ModeloAvaliacao> found = modeloAvaliacaoRepository.findById(id);
        if(found.isPresent()){
            modeloAvaliacaoDto.setId(found.get().getId());
            ModeloAvaliacao map = modelMapper.map(modeloAvaliacaoDto, ModeloAvaliacao.class);
         return  modelMapper.map(modeloAvaliacaoRepository.save(map), ModeloAvaliacaoDto.class);
        } else {
            throw new Exception(String.format("Modelo não existe!"));
        }
    }

    public void remover(Long id) throws Exception {
        try {
            Optional<ModeloAvaliacao> found = modeloAvaliacaoRepository.findById(id);
            if (found.isPresent()) {
                modeloAvaliacaoRepository.deleteById(id);
            } else {
                throw new EntidadeNaoEncontradaException(String.format("Modelo não existe!"));
            }
        }catch (DataIntegrityViolationException e){
        throw new EntidadeNaoEncontradaException(String.format("Modelo não existe!"));
    }
    }


    public List<ModeloAvaliacaoDto> listarTodos() throws Exception {
        return modeloAvaliacaoRepository.findAll().stream()
                .map(modeloAvaliacao ->
                        modelMapper.map(modeloAvaliacao, ModeloAvaliacaoDto.class))
                .collect(Collectors.toList());
    }

    public  Optional<ModeloAvaliacaoDto>  buscarPorId(Long id) throws Exception {
        Optional<ModeloAvaliacao> modeloAvaliacao = modeloAvaliacaoRepository.findById(id);
        if(modeloAvaliacao.isPresent()){
            return  modelMapper.map(modeloAvaliacao, Optional.class);
        }
        return Optional.empty();
    }


















  /*  public ModeloAvaliacao salvar(ModeloAvaliacao modeloAvaliacao) throws Exception {          // primeiro eu defino o tipo do metodo de acesso (encapsulamento)
                                                                                                   ,depois crio um metodo  e dou um nome(salvar)

                                                                                                 // passos os parametros que estao entre os parenteses
        return modeloAvaliacaoRepository.save(modeloAvaliacao);                                  // aqui eu salvo o parametro no repository. No caso, o comando do jpa
                                                                                                    (save) e entre os parenteses o objeto que criei acima
    }

    public ModeloAvaliacao atualizar(ModeloAvaliacao modeloAvaliacao) throws Exception {
        return modeloAvaliacaoRepository.save(modeloAvaliacao);
    }
    public void excluir(Long id) throws Exception {
        modeloAvaliacaoRepository.deleteById(id);*/
    }



























//    @Autowired
//    private ModeloAvaliacaoRepository modeloAvaliacaoRepository;
//
//    public ModeloAvaliacao salvar(ModeloAvaliacao modeloAvaliacao) throws Exception {
//        return  modeloAvaliacaoRepository.save(modeloAvaliacao);
//    }
//    public ModeloAvaliacao atualizar( ModeloAvaliacao modeloAvaliacao) throws Exception {
//        modeloAvaliacaoRepository.save(modeloAvaliacao);
//        return modeloAvaliacao;
//    }
//    public void excluir(Long id) throws Exception {
//        modeloAvaliacaoRepository.deleteById(id);
//    }
//    public List<ModeloAvaliacao> listarTodos() throws Exception {
//        return modeloAvaliacaoRepository.findAll();
//    }
//    public ModeloAvaliacao buscaPorId(Long id) throws Exception {
//        return modeloAvaliacaoRepository.findById(id).get();




