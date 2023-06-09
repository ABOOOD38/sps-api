package com.hope.sps.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    Optional<Admin> findByUserInformationEmail(final String email);

    boolean existsByUserInformationEmail(final String email);
}
