package br.com.projetoibm.projetoibm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoibm.projetoibm.models.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

}
