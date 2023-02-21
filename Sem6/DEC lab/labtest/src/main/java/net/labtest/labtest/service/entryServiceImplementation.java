package net.labtest.labtest.service;

import java.util.List;
import java.util.Optional;

import net.labtest.labtest.model.logEntry;
import net.labtest.labtest.repository.logEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import net.labtest.labtest.model.logEntry;
import net.labtest.labtest.repository.logEntryRepository;

public class entryServiceImplementation implements entryService{
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private logEntryRepository entryRepo;
    @Override
    public List<logEntry> getAllEntry(){
        return entryRepo.findAll();
    }

    @Override
    public void saveEntry(logEntry entry) {
        //this.logEntryRepository.saveEntry(id);
    }

    @Override
    public logEntry getEntry(long id) {
        return null;
//        Optional<logEntry> optional = logEntryRepository.findbyId(id);
//        logEntry entry = null;
//        if (optional.isPresent()) {
//            entry = optional.get();
//        } else {
//            throw new RuntimeException("Record not found");
//        }
//        return entry;
    }

    @Override
    public void deleteEntry(long id) {
        //this.logEntryRepository.deleteEntry(id);
    }

//    @Override
//    public Page<logEntry> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
//        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
//                Sort.by(sortField).descending();
//
//        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
//        return this.logEntryRepository.findAll(pageable);
//    }
}
