//package com.blockverse.issues.controller;
//
//import com.blockverse.issues.dto.request.JwtRequest;
//import com.blockverse.issues.dto.response.JwtResponse;
//import com.blockverse.issues.utils.JwtUtils;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.Authentication;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//
//@Slf4j
//@RestController
//@CrossOrigin
//@RequestMapping(value = "/authenticate")
//@Api(value = "Managing users authentication")
//public class AuthController {
//
//    private final AuthenticationManager authenticationManager;
//    private final JwtUtils jwtService;
//
//    @Autowired
//    public AuthController(AuthenticationManager authenticationManager, JwtUtils jwtService) {
//        this.authenticationManager = authenticationManager;
//        this.jwtService = jwtService;
//    }
//
//
//    @PostMapping
//    @ApiOperation(value = "Authenticate user", response = ResponseEntity.class)
//    @ApiResponses(value = {@ApiResponse(code = 200, message = "Authentication successful"), @ApiResponse(code = 401, message = "Authentication failed")
//    })
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest jwtRequest) {
//
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
//        final String token = jwtService.generateToken(jwtRequest.getUsername(), authentication.getAuthorities());
//
//        return ResponseEntity.ok(new JwtResponse(token));
//
//    }
//}