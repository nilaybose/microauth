package com.marcosbarbero.lab.sec.oauth.jwt.ds.web;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @RequestMapping("/au")
    @GetMapping
    @PreAuthorize("hasRole('ROLE_AU')")
    public ResponseEntity<Principal> getAu(final Principal principal) {
        return ResponseEntity.ok(principal);
    }

    @GetMapping
    @RequestMapping("/amazon")
    @PreAuthorize("hasRole('ROLE_AMAZON')")
    public ResponseEntity<Principal> getAmaznToken(final Principal principal) {
        return ResponseEntity.ok(principal);
    }
}
