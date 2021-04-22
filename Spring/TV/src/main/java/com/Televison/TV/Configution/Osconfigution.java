package com.Televison.TV.Configution;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.Televison.TV.Bean.Os;
@Configuration
public class Osconfigution {
    @Bean
    public Os normal(){
        return new Os("Normal");
    }
    @Bean
    public Os androi(){
        return new Os("Androi");
    }
    @Bean
    public Os ios(){
        return new Os("IOS");
    }
    @Bean
    public Os flutter(){
        return new Os("Flutter");
    }

    
    
}
