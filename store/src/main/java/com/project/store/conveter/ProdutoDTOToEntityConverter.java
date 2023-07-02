package com.project.store.conveter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.store.dto.ProdutoDTO;
import com.project.store.entity.Produto;


@Component
public class ProdutoDTOToEntityConverter implements Converter<ProdutoDTO,Produto> {
	
	@Override
	public Produto convert(ProdutoDTO source) {
		return new Produto(source);
	}

}
