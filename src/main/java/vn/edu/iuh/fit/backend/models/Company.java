package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity

@NoArgsConstructor
@ToString
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "comp_id", nullable = false)
    private Long id;

    @Column(name = "about", length = 2000)
    private String about;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "comp_name", nullable = false)
    private String compName;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "web_url")
    private String webUrl;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "address", nullable = false)
    private Address address;

    public Company(Long id, String about, String email, String compName, String phone, String webUrl, Address address) {
        this.id = id;
        this.about = about;
        this.email = email;
        this.compName = compName;
        this.phone = phone;
        this.webUrl = webUrl;
        this.address = address;
    }
}