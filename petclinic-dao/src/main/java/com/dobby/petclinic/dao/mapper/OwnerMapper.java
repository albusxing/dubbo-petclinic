package com.dobby.petclinic.dao.mapper;

import com.dobby.petclinic.dao.model.Owner;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OwnerMapper extends CustomMapper<Owner> {


    @Select("select * from owners where last_name like #{lastName}")
    List<Owner> findOwnerByLastName(@Param("lastName") String lastName);

}
