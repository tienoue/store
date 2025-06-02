package junior.store.store.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import junior.store.store.service.DepartementService;
import junior.store.store.service.EmployeService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/departement")
public class DepartementController {

    private final DepartementService departementService;
    private final EmployeService employeService;
}