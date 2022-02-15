package br.mil.ccarj.eavaliacaobq.eavaliacaobq.api.controller;


import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model.ModeloAvaliacao;
import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.service.ModeloAvaliacaoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/modelos-avaliacao")
public class ModeloAvalicaoController {

    @Autowired
    private ModeloAvaliacaoService modeloAvaliacaoService;

    @ApiOperation(value = "Cria um novo modelo de avaliação", nickname = "criarModelo", notes = "Criar Modelo")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Modelo de avaliação criado com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")})
    @PostMapping("/salvar")
    @ResponseBody
    public ResponseEntity<ModeloAvaliacao> salvar(@RequestBody @Valid ModeloAvaliacao modeloAvaliacao)
            throws Exception {
        try {
            ModeloAvaliacao modeloSalvo = modeloAvaliacaoService.salvar(modeloAvaliacao);
            return ResponseEntity.ok(modeloSalvo) ;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    @ApiOperation(value = "Atualiza um novo modelo de avaliação", nickname = "atualizarModelo", notes = "Atualizar Modelo")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Modelo de avaliação atualizado com sucesso"),
            @ApiResponse(code = 400, message = "Bad Request")})
    @PutMapping("/{id}")
    public ResponseEntity<ModeloAvaliacao>atualizar(@RequestBody @Valid ModeloAvaliacao modeloAvaliacao) throws Exception {
            try {
                ModeloAvaliacao modeloAtualizado = modeloAvaliacaoService.atualizar(modeloAvaliacao);
                return ResponseEntity.ok(modeloAtualizado) ;

            } catch (Exception e) {
                throw new Exception(e);
            }
        }
        @DeleteMapping("/{id}")
        public ResponseEntity<ModeloAvaliacao> excluir(@PathVariable(name = "id") Long id) throws Exception {
               modeloAvaliacaoService.excluir(id);
             return  ResponseEntity.noContent().build();
        }
        @GetMapping()
        public List<ModeloAvaliacao> listarTodos()throws Exception {
            return modeloAvaliacaoService.listarTodos();
        }
    }


