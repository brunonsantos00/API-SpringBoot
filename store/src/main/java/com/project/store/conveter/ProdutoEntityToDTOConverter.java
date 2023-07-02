package com.project.store.conveter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.project.store.dto.ProdutoDTO;
import com.project.store.entity.Produto;


@Component
public class ProdutoEntityToDTOConverter implements Converter<Produto,ProdutoDTO>  {
	
	@Override
	public ProdutoDTO convert(Produto source) {
		return new ProdutoDTO(source);
	}

}
