package com.dobby.petclinic.rpc.service.impl;

import com.dobby.petclinic.dao.mapper.*;
import com.dobby.petclinic.dao.model.*;
import com.dobby.petclinic.rpc.api.ClinicService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ClinicServiceImpl implements ClinicService {

    @Resource
    private PetMapper petMapper;
    @Resource
    private OwnerMapper ownerMapper;
    @Resource
    private PetTypeMapper petTypeMapper;
    @Resource
    private VetMapper vetMapper;
    @Resource
    private VisitMapper visitMapper;


    @Override
    public List<PetType> findPetTypes() {
        List<PetType> types = petTypeMapper.selectAll();
        return types;
    }

    @Override
    public Owner findOwnerById(int id) {
        Owner owner = ownerMapper.selectByPrimaryKey(id);
        return owner;
    }

    @Override
    public Pet findPetById(int id) {
        return petMapper.selectByPrimaryKey(id);
    }

    @Override
    public void savePet(Pet pet) {
        if (pet.getId() == null) {
            petMapper.insert(pet);
        } else {
            petMapper.updateByPrimaryKey(pet);
        }
    }

    @Override
    public void saveVisit(Visit visit) {
        if (visit.getId() == null) {
            visitMapper.insert(visit);
        } else {
            visitMapper.updateByPrimaryKey(visit);
        }
    }

    @Override
    public List<Vet> findVets() {
        return vetMapper.selectAll();
    }

    @Override
    public void saveOwner(Owner owner) {
        if (owner.getId() == null) {
            ownerMapper.insert(owner);
        } else {
            ownerMapper.updateByPrimaryKey(owner);
        }
    }

    @Override
    public List<Owner> findOwnerByLastName(String lastName) {
        List<Owner> owners = ownerMapper.findOwnerByLastName(lastName);
        return owners;
    }

    @Override
    public List<Visit> findVisitsByPetId(int petId) {
        return null;
    }
}
