package com.ebenz.camel_microservice_b.repo;

import com.ebenz.camel_microservice_b.entity.DataRecord;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRecordRepository extends JpaRepository<DataRecord, Long> {
    @Transactional
    public default void saveDataRecord(DataRecord dataRecord){
        save(dataRecord);
    }
}
