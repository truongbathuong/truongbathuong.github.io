package com.Televison.TV.Configution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.Televison.TV.Bean.Os;
import com.Televison.TV.Bean.Panel;
import com.Televison.TV.Bean.TV;
@Configuration
public class TVConfi {
    @Autowired
    private ApplicationContext context;

    @Value("${panelType}")
    private String panelType;

    @Value("${osType}")
    private String osType;

    @Bean
    public TV tivi() {
        Os os;
        Panel panel;
        switch (panelType) {
        case "LED":
            panel = (Panel) context.getBean("ledPanel");
            break;
        case "OLED":
            panel = (Panel) context.getBean("oledPanel");
            break;
        default:
            panel = (Panel) context.getBean("ledPanel");
            break;
        }

        switch (osType) {
        case "Normal":
            os = (Os) context.getBean("normal");
            break;
        case "Androi":
            os = (Os) context.getBean("androi");
            break;
        case "IOS":
            os = (Os) context.getBean("ios");
            break;
        case "Flutter":
            os = (Os) context.getBean("flutter");
            break;
        default:
            os = (Os) context.getBean("normal");
            break;
        }
        return new TV(panel, os);

    }
    
}
