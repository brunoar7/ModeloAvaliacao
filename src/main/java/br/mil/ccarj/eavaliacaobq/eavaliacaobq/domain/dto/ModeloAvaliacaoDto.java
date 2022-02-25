package br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModeloAvaliacaoDto {


    private Long id;

    @NotBlank
    private String nome;
    @NotBlank
    private String sigla;

    private String descricao;

/*@Override
    public String toString() {
    return "ModeloAvaliacaoDto [id-" + id + ", nome-" + nome +", sigla-" + sigla + ", descricao- " + descricao + " ]";*/
}


