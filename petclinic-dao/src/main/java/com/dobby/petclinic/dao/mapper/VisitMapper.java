package com.dobby.petclinic.dao.mapper;

import com.dobby.petclinic.dao.model.Visit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VisitMapper extends CustomMapper<Visit> {

    List<Visit> findVisitsByPetId(@Param("petId") Integer petId);

}
