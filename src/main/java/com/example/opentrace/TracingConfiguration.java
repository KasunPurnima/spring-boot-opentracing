package com.example.opentrace;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class TracingConfiguration  implements ApplicationRunner {

    private static final Logger logger = LogManager.getLogger(TracingConfiguration.class);

    public static void main(String[] args) {
        SpringApplication.run(TracingConfiguration.class, args);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
    }

 /*   @Bean
    public Tracer jaegerTracer() {

        String jaegerAgentUrl = "http://localhost:4318/v1/traces";

       Configuration.class senderConfiguration = new Configuration.SenderConfiguration()
               .withAgentHost(jaegerAgentUrl)
                .withAgentPort(0);

        Configuration.ReporterConfiguration reporterConfiguration = new Configuration.ReporterConfiguration()
                .withLogSpans(true)
                .withSender(senderConfiguration);

        Configuration.SamplerConfiguration samplerConfiguration = new Configuration.SamplerConfiguration()
                .withType(ProbabilisticSampler.TYPE)
               .withParam(1);

        Configuration config = new Configuration(applicationName)
                .withSampler(samplerConfiguration)
                .withReporter(reporterConfiguration);

        return config.getTracer();
        return null;
    }*/
}
