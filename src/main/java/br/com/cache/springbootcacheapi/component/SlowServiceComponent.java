package br.com.cache.springbootcacheapi.component;

import org.springframework.stereotype.Component;

@Component
public class SlowServiceComponent {


    public void simularSlowService() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
