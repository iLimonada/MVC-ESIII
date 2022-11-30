package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Top10;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/top10")
public class Top10Controller {

    private static final List<Top10> top10 = new ArrayList<Top10>();

    public Top10Controller() {
        top10.add(new Top10("Linguagens de Programacao", "1", 10, 10, 10));
        top10.add(new Top10("Frameworks", "2", 9.7, 10, 10));
        top10.add(new Top10("Banco de Dados", "3", 9.3, 10, 9.7));
        top10.add(new Top10("IDEs", "4", 8.5, 9.7, 9.3));
        top10.add(new Top10("Arquiteturas", "5", 8.5, 9.3, 9.3));
    }

    @GetMapping
    public String getTop10(Model model){
        model.addAttribute("top10", top10);
        return "top10";
    }
}
