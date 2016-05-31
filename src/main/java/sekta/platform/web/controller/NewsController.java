package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sekta.platform.core.entity.News;
import sekta.platform.core.service.NewsService;

import java.util.Date;

/**
 * Created by Admin on 31.05.2016.
 */
@Controller
@RequestMapping("news")
public class NewsController {

    @Autowired
    private NewsService newsService;
    @RequestMapping("")
    public String showAllNews(ModelMap model){
        model.addAttribute("news", newsService.getAllNews());
        return "news/news-list";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String createNews(@RequestParam("text") String text,
                             @RequestParam("date") Date releaseDate,
                             RedirectAttributes redirectAttributes){
        News news = new News();
        news.setText(text);
        news.setReleaseDate(releaseDate);
        newsService.createNews(news);
        redirectAttributes.addFlashAttribute("message", "News successfully created!");
        return "redirect:/news";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String showCreationForm(){
        return "new-news";
    }
}
