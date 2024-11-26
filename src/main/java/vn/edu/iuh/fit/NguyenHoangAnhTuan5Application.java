package vn.edu.iuh.fit;

import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.backend.models.Address;
import vn.edu.iuh.fit.backend.models.Candidate;
import vn.edu.iuh.fit.backend.repositories.AddressRepository;
import vn.edu.iuh.fit.backend.repositories.CandidateRepository;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class NguyenHoangAnhTuan5Application {

    public static void main(String[] args) {
        SpringApplication.run(NguyenHoangAnhTuan5Application.class, args);
    }

    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;
//    @Bean
//    CommandLineRunner initData(){
//        return args -> {
//            Random rnd =new Random();
//            for (int i = 1; i < 1000; i++) {
//                Address add = new Address(
//                        Long.valueOf(rnd.nextInt(1, 1000)),"Quang Trung","HCM",(short) 84,String.valueOf(rnd.nextInt(70000, 80000)),CountryCode.VN.toString()
//                );
//                addressRepository.save(add);
//
//                Candidate can=new Candidate(
//                        Long.valueOf(i),
//
//                        LocalDate.of(1998,rnd.nextInt(1,13), rnd.nextInt(1,29)),
//                        "email_"+i+"@gmail.com",
//                        "Name #"+i,
//
//                        rnd.nextLong(1111111111L,9999999999L)+"",
//                        add);
//
//                candidateRepository.save(can);
//                System.out.println("Added: " +can);
//            }
//        };
//    }
}