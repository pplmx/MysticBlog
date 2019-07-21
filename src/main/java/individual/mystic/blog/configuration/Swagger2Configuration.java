package individual.mystic.blog.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@Configuration
@EnableSwagger2WebFlux
public class Swagger2Configuration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(myApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("individual.mystic.blog.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo myApiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger Api 3.0.snapshot")
                .description("Swagger Api 3.0.snapshot")
                .termsOfServiceUrl("https://caoyu.info")
                .version("1.0")
                .build();
    }

}
