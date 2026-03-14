package com.gabrielprojeto.baozistore.repository;

import com.gabrielprojeto.baozistore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}