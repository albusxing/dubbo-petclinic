package com.dobby.petclinic.rpc.service.impl;
import com.dobby.petclinic.dao.*;
import com.dobby.petclinic.model.*;
import com.dobby.petclinic.rpc.api.ClinicService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @Service : dubbo 中的 service 注解
 */
@Service
public class ClinicServiceImpl implements ClinicService {

    @Autowired
    private PetMapper petMapper;
    @Autowired
    private OwnerMapper ownerMapper;
    @Autowired
    private PetTypeMapper petTypeMapper;
    @Autowired
    private VetMapper vetMapper;
    @Autowired
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
        List<Visit> visits = visitMapper.findVisitsByPetId(petId);
        return visits;
    }
}
