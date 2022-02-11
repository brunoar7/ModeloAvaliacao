package br.mil.ccarj.eavaliacaobq.eavaliacaobq.api.controller;


import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model.ModeloAvaliacao;
import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.service.ModeloAvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelos-avaliacao")
public class ModeloAvalicaoController {

    @Autowired
    private ModeloAvaliacaoService modeloAvaliacaoService;

    @PostMapping("/salvar")
    public String salvar(@RequestBody ModeloAvaliacao modeloAvaliacao) {
        try {
            modeloAvaliacaoService.salvar(modeloAvaliacao);
            return "Salvo!";                                       //            return MensagemEnum.SUCESSO.getValue ();
        } catch (Exception e) {
            return e.getMessage();
        }
    }

        @PostMapping("/atualizar")
        public String atualizar(@RequestBody ModeloAvaliacao modeloAvaliacao){
            try {
                modeloAvaliacaoService.atualizar(modeloAvaliacao);
                return "Atualizado com sucesso!";
            } catch (Exception e) {
                return e.getMessage();
            }
        }
        @DeleteMapping("/apagar")
        public String excluir(@RequestBody ModeloAvaliacao modeloAvaliacao){
            try {
                modeloAvaliacaoService.excluir(modeloAvaliacao);
                return "Excluido com sucesso!";
            } catch (Exception e) {
                return e.getMessage();
            }
        }
        @GetMapping("/listartodos")
        public List<ModeloAvaliacao> listarTodos()throws Exception {
            return modeloAvaliacaoService.listarTodos();
        }
    }


