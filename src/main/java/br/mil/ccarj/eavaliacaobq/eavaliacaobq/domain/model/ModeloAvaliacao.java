package br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity                                                //Uso o entity para mapear uma classe no banco de dados
@Table( name = "T_MODELO_AVALIACAO", schema="public")
@NoArgsConstructor
@AllArgsConstructor                                   //construtores
@Getter
@Setter
public class ModeloAvaliacao {

    @Id                                              //marca como chave primaria do  banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MODELO_AVALIACAO")
    private Long id;

    @NotBlank
    @Column(name = "NM_MODELO_AVALIACAO")
    private String nome;

    @NotBlank
    @Column(name = "SG_MODELO_AVALIACAO")
    private String sigla;

    @Column(name = "DC_MODELO_AVALIACAO")
    private String descricao;

    }



