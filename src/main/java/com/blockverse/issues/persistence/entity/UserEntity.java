//package com.blockverse.issues.persistence.entity;
//
//import com.sun.istack.NotNull;
//import io.swagger.annotations.ApiModel;
//import lombok.*;
//
//import javax.persistence.*;
//
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Set;
//
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(name = "USERS")
//@ApiModel(description = "All details about the User")
//public class UserEntity implements Serializable {
//
//    static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID", unique = true, nullable = false)
//    private long id;
//
//    @NotNull
//    @Column(nullable = false)
//    private String username;
//
//    @NotNull
//    @Column(nullable = false)
//    private String password;
//
//}
