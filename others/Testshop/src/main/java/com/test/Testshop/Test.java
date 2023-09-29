package com.test.Testshop;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "revision")
@Data
public class Test {
    @Id
    Long id;

    @Column(nullable = false)
    String Name;

    @Column(nullable = false)
    String Email;

    @Column(nullable = false)
    String Phone;

    @CreationTimestamp
    Timestamp created_at;

    @UpdateTimestamp
    Timestamp updated_at;
}
