package klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import klu.model.Orders;

@Service
@Repository
public interface OrderRepository extends JpaRepository<Orders,Long> {

}
