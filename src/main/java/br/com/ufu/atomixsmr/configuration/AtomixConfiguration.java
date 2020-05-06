package br.com.ufu.atomixsmr.configuration;

import io.atomix.core.Atomix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.*;
import java.util.Map;

@Configuration
public class AtomixConfiguration {

    @Bean
    public Atomix getAtomixInstance() throws IOException {
        final InputStream inputSreamConf = getClass().getClassLoader().getResourceAsStream("atomix.conf");
        final File conf = new File("atomix.conf");
        final OutputStream outputStreamConf = new FileOutputStream(conf);

        outputStreamConf.write(inputSreamConf.readAllBytes());
        Map<String, String> environmentVars  = System.getenv();

        environmentVars.entrySet().forEach(System.out::println);

        try {
            final Atomix atomix = new Atomix(conf);
            atomix.start().join();
            return atomix;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
