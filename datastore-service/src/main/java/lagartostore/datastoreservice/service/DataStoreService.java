package lagartostore.datastoreservice.service;

import lagartostore.datastoreservice.entity.DataStore;

import java.util.List;
import java.util.Optional;

public interface DataStoreService {
    public List<DataStore> list();

    public Optional<DataStore> getById(Integer id);

    public DataStore save(DataStore dataStore);

    public DataStore update(Integer id, DataStore dataStore);

    public void delete(Integer id);

}