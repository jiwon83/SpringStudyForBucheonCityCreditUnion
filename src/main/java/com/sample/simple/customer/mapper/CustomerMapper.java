package com.sample.simple.customer.mapper;

import com.sample.simple.domain.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    // 고객 전체 조회
    List<Customer> findAll();

    // ID로 단일 조회
    Customer findById(Integer customerId);

    // 고객 등록
    int insert(Customer customer);

    // 고객 수정
    int update(Customer customer);

    // 고객 삭제
    int delete(Integer customerId);
}