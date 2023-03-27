package org.soneech.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.soneech.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfiguration {

}
