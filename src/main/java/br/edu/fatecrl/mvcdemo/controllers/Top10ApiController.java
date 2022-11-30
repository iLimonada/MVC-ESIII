package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Top10;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/top10")
public class Top10ApiController {

    private static final List<Top10> top10 = new ArrayList<Top10>();

    public Top10ApiController() {
        top10.add(new Top10("Linguagens de Programacao", "1", 10, 10, 10));
        top10.add(new Top10("Frameworks", "2", 9.7, 10, 10));
        top10.add(new Top10("Banco de Dados", "3", 9.3, 10, 9.7));
        top10.add(new Top10("IDEs", "4", 8.5, 9.7, 9.3));
        top10.add(new Top10("Arquiteturas", "5", 8.5, 9.3, 9.3));
    }

    @GetMapping
    public List<Top10> getTop10(){
        return top10;
    }
}
