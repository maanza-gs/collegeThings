package net.labtest.labtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import net.labtest.labtest.model.logEntry;
import net.labtest.labtest.service.entryService;

@Controller
public class EntryController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private entryService entryService;

    // display list of entries
    @GetMapping("/")
    public String viewHomePage(Model model) {
        return "index.html";
        //return findPaginated(1, "date", "asc", model);
    }

    @GetMapping("/showNewEntryForm")
    public String showNewEntryForm(Model model) {
        logEntry entry = new logEntry();
        model.addAttribute("entry", entry);
        return "entry.html";
    }

}