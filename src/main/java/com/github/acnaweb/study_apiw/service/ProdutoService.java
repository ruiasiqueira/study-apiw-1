package com.github.acnaweb.study_apiw.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.acnaweb.study_apiw.model.Produto;
import com.github.acnaweb.study_apiw.repository.ProdutoRepository;

@SuppressWarnings("unused")
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto) {        
        return produtoRepository.save(produto);
    }

}
