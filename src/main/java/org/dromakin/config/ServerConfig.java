/*
 * File:     ServerConfig
 * Package:  org.dromakin.config
 * Project:  netology_web_servlets
 *
 * Created by dromakin as 26.07.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.07.26
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package org.dromakin.config;

import org.dromakin.controller.PostController;
import org.dromakin.repository.PostRepository;
import org.dromakin.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {

    @Bean
    public PostController postController() {
        return new PostController(postService());
    }

    @Bean
    public PostService postService() {
        return new PostService(postRepository());
    }

    @Bean
    public PostRepository postRepository() {
        return new PostRepository();
    }

}
