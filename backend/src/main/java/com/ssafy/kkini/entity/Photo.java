package com.ssafy.kkini.entity;

import com.ssafy.kkini.entity.Memory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Getter
@Setter
@Entity
@DynamicInsert
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PHOTO")
public class Photo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT UNSIGNED")
    private Long photoId;
    @ManyToOne
    @JoinColumn(name = "memory_id")
    private Memory memory;
    private String originalFilename;
    private String FilePath;

}