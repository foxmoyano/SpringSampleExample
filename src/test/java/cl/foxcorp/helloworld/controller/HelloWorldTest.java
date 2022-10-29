package cl.foxcorp.helloworld.controller;

import cl.foxcorp.helloworld.config.AppConfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class HelloWorldTest
{
    final static String message = "Test ok on Jenkins!";

    @Test
    public void testMessage() {
        String value = null;
        Assert.assertNotNull(message);
    }
}