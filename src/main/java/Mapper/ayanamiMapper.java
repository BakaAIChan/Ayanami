package Mapper;

import Domain.ayanami;

import java.util.List;

public interface ayanamiMapper {
    int count();
    ayanami selectById(int id);

    List<ayanami> selectAll();
}
