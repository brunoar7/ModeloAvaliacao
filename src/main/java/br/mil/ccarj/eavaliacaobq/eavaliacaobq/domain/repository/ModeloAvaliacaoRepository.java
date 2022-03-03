package br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.repository;

import br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.model.ModeloAvaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloAvaliacaoRepository extends JpaRepository<ModeloAvaliacao, Long> {

}




//Uma entity é um objeto leve de domínio persistente utilizado para representar uma tabela da base de dados,
//sendo que cada instância da entity corresponde a uma linha da tabela.

