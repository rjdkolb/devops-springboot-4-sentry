
package io.r3k.devops.sentry.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Customer {
    @Id
    public Long id;
    public String firstName;
    public String lastName;
}