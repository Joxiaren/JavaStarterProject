package xyz.jovanstoiljkovic.starter.mappers;

import xyz.jovanstoiljkovic.starter.dtos.BaseDTO;

public abstract class BaseMapper<
        T,
        RequestDTO extends BaseDTO<T>,
        ResponseDTO extends BaseDTO<T>
> {
    public abstract ResponseDTO entityToResponse(T entity);
    public abstract RequestDTO entityToRequest(T entity);
    public abstract T responseToEntity(ResponseDTO response);
    public abstract T requestToEntity(RequestDTO request);
}
