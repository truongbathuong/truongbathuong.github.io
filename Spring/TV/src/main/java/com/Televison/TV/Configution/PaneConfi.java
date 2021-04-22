package com.Televison.TV.Configution;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.Televison.TV.Bean.Panel;
@Configuration
public class PaneConfi {
    @Bean
    public Panel ledPanel(){
        return new Panel("LED");
    }

    @Bean
    public Panel oledPanel(){
        return new Panel("OLED");
    }
    
}
