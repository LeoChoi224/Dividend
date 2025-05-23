package zerobase.dividend.persist.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zerobase.dividend.model.Company;

import javax.persistence.*;

@Entity(name = "COMPANY")
@Getter
@Setter
@NoArgsConstructor
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String ticker;

    private String name;

    public CompanyEntity(Company company) {
        this.ticker = company.getTicker();
        this.name = company.getName();
    }


}
