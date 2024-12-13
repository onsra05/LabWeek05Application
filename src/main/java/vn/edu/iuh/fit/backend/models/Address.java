package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "street", length = 150)
    private String street;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "country")
    private Short country;

    @Column(name = "number", length = 20)
    private String number;

    @Column(name = "zipcode", length = 7)
    private String zipcode;

    public Address(Long id, String street, String city, Short country, String number, String zipcode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.zipcode = zipcode;
    }

    public Address() {
    }

    @Override
    public String toString() {
        // Chuyển đổi mã quốc gia thành tên
        String countryName = getCountryName(country);
        return id + " " + street + " " + city + " " + zipcode + " " +  countryName;
    }

    // Phương thức chuyển đổi mã quốc gia thành tên quốc gia
    private String getCountryName(Short countryCode) {
        if (countryCode == 84) {
            return "Vietnam";
        }
        return "Unknown Country";
    }
}