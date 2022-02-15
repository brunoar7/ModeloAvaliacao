package br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name = "T_MODELO_AVALIACAO", schema="public")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ModeloAvaliacao {

    @Id
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