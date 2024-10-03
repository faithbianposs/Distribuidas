package lagartostore.datastoreservice.repository;

import lagartostore.datastoreservice.entity.DataStore;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DataStoreRepository extends JpaRepository<DataStore, Integer> {

}
