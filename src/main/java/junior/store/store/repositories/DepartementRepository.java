package junior.store.store.repositories;

import junior.store.store.model.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

// JpaRepository<Departement, UUID> Departement = Nom entite et UUID = type de la clef prima

@Repository
public interface DepartementRepository extends JpaRepository<Departement, UUID> {
    // Pour eviter les doublons sur les departements en BD
    boolean existsDistinctByLibelleDepartement(String libelleDepartement);
}
