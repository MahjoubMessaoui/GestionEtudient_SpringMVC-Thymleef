package whitecape.tn.gestion_etudient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import whitecape.tn.gestion_etudient.entites.Etudient;
import whitecape.tn.gestion_etudient.repository.EtudientRepository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class GestionEtudientApplication {

    public static void main(String[] args)
           // throws ParseException
    {  SpringApplication.run(GestionEtudientApplication.class, args);
//        ApplicationContext ctx = SpringApplication.run(GestionEtudientApplication.class, args);
//
//        EtudientRepository etudientRepository=ctx.getBean(EtudientRepository.class);
//        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
//        Etudient etudient = etudientRepository.save(new Etudient("ahmed", df.parse("1987-02-12"), "cc.tn@yahoo.fr", "dddd"));
//        Etudient etudient1 = etudientRepository.save(new Etudient("imed", df.parse("1988-02-12"), "3omda@yahoo.fr", "dddd"));
//           Page<Etudient> etd=etudientRepository.findAll(new PageRequest(0,5));
//             etd.forEach(e->System.out.print(e.getNom()));


    }

}
