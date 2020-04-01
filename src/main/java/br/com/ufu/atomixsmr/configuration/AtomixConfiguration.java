package br.com.ufu.atomixsmr.configuration;

import io.atomix.core.Atomix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtomixConfiguration {

    @Bean
    public Atomix getAtomixInstance() {
        final String configurationPath = getClass().getClassLoader().getResource("atomix.conf").getPath();
        final Atomix atomix = new Atomix(configurationPath);
        atomix.start().join();
        return atomix;
    }
}
