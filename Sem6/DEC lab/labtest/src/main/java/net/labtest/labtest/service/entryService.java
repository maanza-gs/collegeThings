package net.labtest.labtest.service;

import java.util.List;
import net.labtest.labtest.model.logEntry;
public interface entryService {
    List<logEntry> getAllEntry();
    void saveEntry(logEntry entry);
    logEntry getEntry(long id);
    void deleteEntry(long id);
   //Page<logEntry> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
