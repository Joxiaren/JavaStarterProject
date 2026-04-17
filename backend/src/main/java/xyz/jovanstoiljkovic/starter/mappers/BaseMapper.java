package xyz.jovanstoiljkovic.starter.mappers;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;

public abstract class BaseMapper<
		T,
		DTO extends BaseDTO<T>,
		DTOLeaf extends BaseDTO<T>
> {

	public abstract DTO entityToDTO(T entity);

	public abstract T DTOToEntity(DTO response);

	public abstract T leafToEntity(DTOLeaf response);

	public abstract DTOLeaf entityToLeaf(T entity);

}
