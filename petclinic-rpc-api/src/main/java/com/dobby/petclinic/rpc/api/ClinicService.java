package com.dobby.petclinic.rpc.api;

import com.dobby.petclinic.model.*;
import java.util.List;

public interface ClinicService {

    List<PetType> findPetTypes();

    Owner findOwnerById(int id);

    Pet findPetById(int id);

    void savePet(Pet pet);

    void saveVisit(Visit visit);

    List<Vet> findVets();

    void saveOwner(Owner owner);

    List<Owner> findOwnerByLastName(String lastName);

    List<Visit> findVisitsByPetId(int petId);
}
