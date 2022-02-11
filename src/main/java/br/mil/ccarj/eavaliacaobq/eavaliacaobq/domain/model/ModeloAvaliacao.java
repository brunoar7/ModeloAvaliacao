package br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model;
import lombok.*;
import javax.persistence.*;


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

    @Column(name = "NM_MODELO_AVALIACAO", nullable = false)
    private String nome;

    @Column(name = "SG_MODELO_AVALIACAO", nullable = false)
    private String sigla;

    @Column(name = "DC_MODELO_AVALIACAO", nullable = false)
    private String descricao;

}