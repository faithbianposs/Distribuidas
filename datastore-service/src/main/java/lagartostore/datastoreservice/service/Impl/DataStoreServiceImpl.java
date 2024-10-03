package lagartostore.datastoreservice.service.Impl;

import lagartostore.datastoreservice.entity.DataStore;
import lagartostore.datastoreservice.repository.DataStoreRepository;
import lagartostore.datastoreservice.service.DataStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataStoreServiceImpl implements DataStoreService {
    @Autowired
    private final DataStoreRepository dataStoreRepository;

    public DataStoreServiceImpl(DataStoreRepository dataStoreRepository) {
        this.dataStoreRepository = dataStoreRepository;
    }

    @Override
    public List<DataStore> list() {
        return dataStoreRepository.findAll();
    }

    @Override
    public Optional<DataStore> getById(Integer id) {
        return dataStoreRepository.findById(id);
    }

    @Override
    public DataStore save(DataStore dataStore) {
        return dataStoreRepository.save(dataStore);
    }

    @Override
    public DataStore update(Integer id, DataStore dataStore) {
        dataStore.setId(id);
        return dataStoreRepository.save(dataStore);
    }

    @Override
    public void delete(Integer id) {
        dataStoreRepository.deleteById(id);
    }

}
