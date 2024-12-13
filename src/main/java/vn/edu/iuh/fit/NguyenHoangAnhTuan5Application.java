package vn.edu.iuh.fit;

import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.backend.models.Address;
import vn.edu.iuh.fit.backend.models.Candidate;
import vn.edu.iuh.fit.backend.models.Company;
import vn.edu.iuh.fit.backend.models.Job;
import vn.edu.iuh.fit.backend.repositories.AddressRepository;
import vn.edu.iuh.fit.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.backend.repositories.CompanyRepository;
import vn.edu.iuh.fit.backend.repositories.JobRepository;

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
    @Bean
    CommandLineRunner initData(CompanyRepository companyRepository, JobRepository jobRepository){
        return args -> {
            Random rnd =new Random();
//            for (int i = 1; i < 1000; i++) {
//                Address add = new Address(
//                        Long.valueOf(rnd.nextInt(1, 1000)),"Quang Trung","HCM",(short) 84,CountryCode.VN.toString(),String.valueOf(rnd.nextInt(70000, 80000))
//                );
//                addressRepository.save(add);
//
//                Candidate can=new Candidate(
//                        Long.valueOf(i),
//                        LocalDate.of(1998,rnd.nextInt(1,13), rnd.nextInt(1,29)),
//                        "email_"+i+"@gmail.com",
//                        "Name #"+i,
//                        rnd.nextLong(1111111111L,9999999999L)+"",add);
//
//                candidateRepository.save(can);
//                System.out.println("Added: " +can);
//            }  //dung roi


//            for (int i = 1; i <= 23; i++) {
//                Company company = new Company(
//                        (long) i, // id
//                        "About Company #" + i, // about
//                        "email_" + i + "@company.com", // email
//                        "Company #" + i, // compName
//                        "Phone: " + rnd.nextLong(1000000000L, 9999999999L), // phone
//                        "http://company" + i + ".com", // webUrl
//                        new Address(
//                                Long.valueOf(i),
//                                "City " + i,
//                                "Vietnam",
//                                (short) 84,
//                                "VN",
//                                String.valueOf(rnd.nextInt(70000, 80000)) // postal code
//                        )
//                );
//                companyRepository.save(company);
//            }


//            Job job = new Job(
//                        "Job description for company " + i,
//                        "Job #" + i,
//                        company
//                );
//                jobRepository.save(job);
//            }
//
//            // Add random Skills
//            for (int i = 1; i <= 10; i++) {
//                Skill skill = new Skill(
//                        "Description for skill " + i,
//                        "Skill #" + i,
//                        (short) rnd.nextInt(0, 3) // Skill type: 0, 1, or 2
//                );
//                skillRepository.save(skill);
//            }
        };
    }
}