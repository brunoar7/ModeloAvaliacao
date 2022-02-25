package br.mil.ccarj.eavaliacaobq.eavaliacaobq.api.controller;

import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.dto.ModeloAvaliacaoDto;
import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model.ModeloAvaliacao;
import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.service.ModeloAvaliacaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/modelo-avaliacao")
@Api("Modelo de Avaliação")
public class ModeloAvalicaoController {

        @Autowired
        private ModeloAvaliacaoService modeloAvaliacaoService;

        @ApiOperation(value = "Cadastrar novo modelo de avaliação", nickname = "cadastrarModelo", notes = "Cadastra Modelo")
        @ApiResponses(value = {
                @ApiResponse(code = 200, message = "successful operation"),
                @ApiResponse(code = 400, message = "Bad Request"),
                @ApiResponse(code = 404, message = "ExampleModel not found")})

@PostMapping("/salvar")
        @ResponseBody
        public ResponseEntity<ModeloAvaliacaoDto> salvar(@RequestBody @Valid ModeloAvaliacaoDto modeloAvaliacaoDto)
                throws Exception {
            try {
                modeloAvaliacaoService.salvar(modeloAvaliacaoDto);
                return ResponseEntity.ok().build() ;
            } catch (Exception e) {
                throw new Exception(e);
            }
        }

        @ApiOperation(value = "Atualizar modelo de avaliação existente ", nickname = "atualizarModelo", notes = "Atualizar Modelo")
        @ApiResponses(value = {
                @ApiResponse(code = 200, message = "successful operation"),
                @ApiResponse(code = 400, message = "Bad Request"),
                @ApiResponse(code = 404, message = "ExampleModel not found")})

        @PutMapping("/{id}")
        public ResponseEntity<ModeloAvaliacaoDto>atualizar(@PathVariable Long id,@RequestBody @Valid ModeloAvaliacaoDto modeloAvaliacaoDto) throws Exception {
            try {
                return ResponseEntity.ok(modeloAvaliacaoService.atualizar(id,modeloAvaliacaoDto));
            } catch (Exception e) {
                throw new Exception(e);
            }
        }


    @ApiOperation(value = "Excluir modelos de avaliação existente ", nickname = "excluirModelo", notes = "Excluir Modelo")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "ExampleModel not found")})
        @DeleteMapping("/{id}")
        public ResponseEntity<ModeloAvaliacaoDto> remover(@PathVariable(name = "id") Long id) throws Exception {                            //Path variable é pra coonseguir pegar pelo id
            modeloAvaliacaoService.remover(id);
            return  ResponseEntity.ok().build();
        }


    @ApiOperation(value = "Listar Modelos de Avaliação ", nickname = "listarModelos", notes = "Listar Modelos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "ExampleModel not found")})
        @GetMapping()
        public List<ModeloAvaliacaoDto> listarTodos()throws Exception {
            return modeloAvaliacaoService.listarTodos();
        }


}

