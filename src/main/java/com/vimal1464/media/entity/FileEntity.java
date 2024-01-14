package com.vimal1464.media.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true,nullable = false)
    private String imageName;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;
}
