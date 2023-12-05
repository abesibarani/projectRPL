/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springHibernate;

import springHibernate.service.KaryawanService;
import springHibernate.view.ViewKaryawan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author abesi
 */
public class app {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new ViewKaryawan().setVisible(true);
    }
    
    public static KaryawanService getKaryawanService(){
        return(KaryawanService)applicationContext.getBean("KaryawanService");
    }
}
