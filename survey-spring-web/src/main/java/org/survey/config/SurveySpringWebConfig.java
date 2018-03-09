package org.survey.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.survey.ServiceConfig;

@Configuration
@Import({
        ServiceConfig.class,
        SecurityConfig.class,
        MvcConfig.class
})
public class SurveySpringWebConfig {
}
