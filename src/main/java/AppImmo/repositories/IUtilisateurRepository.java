package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import AppImmo.entities.Utilisateur;

@Repository("urepo")
public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
