/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kevin.canning.files;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import kevin.canning.impl.ClassInterface;


/**
 *
 * @author Kevin Canning - 211149381
 */

@Configuration
public class Setup {
    @Bean(name = "tests")
    public ClassInterface getTest()
    {
        return new ClassOne();
    }
}
