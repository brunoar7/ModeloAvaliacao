//package br.mil.ccarj.eavaliacaobq.eavaliacaobq.controllers;
//
//import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model.ModeloAvaliacao;
//import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.service.ModeloAvaliacaoService;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/modelo-avaliacao")
//public class ModeloAvaliacaoController {
//
//    @Autowired
//    private ModeloAvaliacaoService service;
//
//    @GetMapping("/listar")
//    @ApiOperation( value = "Listar")
//    public List<ModeloAvaliacao> listarTodos(){
//        try {
//            return service.listarTodos();
//        }catch (Exception e){
//            return null;
//        }
//    }
//}
