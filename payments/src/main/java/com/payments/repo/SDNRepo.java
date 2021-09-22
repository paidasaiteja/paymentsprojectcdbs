package com.payments.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payments.beans.SDN_list;

public interface SDNRepo extends JpaRepository<SDN_list, String>{

}
