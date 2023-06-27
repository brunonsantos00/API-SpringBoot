package com.project.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.store.entity.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {

}
