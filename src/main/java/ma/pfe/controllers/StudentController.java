package ma.pfe.controllers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.repositories.StudentRepository;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Long save(@RequestBody StudentDTO dto) {
        LOGGER.debug("start method save dto : {} ", dto);
        return studentService.save(dto);
    }

    @PutMapping
    public Boolean update(@RequestBody StudentDTO dto) {
        LOGGER.debug("start method update dto : {} ", dto);
        return studentService.update(dto);
    }

    @DeleteMapping({"/id"})
    public Boolean delete(@PathVariable("id") Long id) {
        LOGGER.debug("start method delete id : {}", id);
        return studentService.delete(id);
    }

    @GetMapping
    public List<StudentDTO> selectAll() {
        LOGGER.debug("start method selectAll");
        return studentService.selectAll();
    }

}
