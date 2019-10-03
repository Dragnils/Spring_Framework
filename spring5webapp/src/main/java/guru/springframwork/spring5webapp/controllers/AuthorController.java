package guru.springframwork.spring5webapp.controllers;

import guru.springframwork.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model){
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}


/* мы добавили в AuthorController, автоматически связанного с AuthorRepository через конструктор, который мы передаем в модели
через Spring MVC, который В модели Spring MVC мы добавляем атрибут с именем author, который будет списком авторов из authorRepository,
используя метод findAll, и мы возвращаем строковых авторов, чтобы указать имя представления, которое мы хотим, чтобы Thymeleaf отображал,
мы добавляем его в под шаблонами, которые являются местоположением шаблона по умолчанию для Thymeleaf под Spring Boot, мы добавили в HTML-файл авторов,
строка 2 имеет пространство имен XML, а затем мы создали таблицу для авторов, мы берем свойство в модели авторов и создайте итератор с автором, и мы пройдем через это и
выпишем три свойства для нашего использования.  */