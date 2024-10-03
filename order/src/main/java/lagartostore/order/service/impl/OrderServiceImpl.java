package lagartostore.order.service.impl;

import lagartostore.order.entity.Order;
import lagartostore.order.entity.OrderDetail;
import lagartostore.order.feign.CatalogFeign;
import lagartostore.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lagartostore.order.service.OrderService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired

    private CatalogFeign catalogFeign;

    @Override
    public List<Order> list() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getById(Integer id) {

        Optional<Order> order = orderRepository.findById(id);
        for (OrderDetail orderDetail:  order.get().getOrderDetails()){
            System.out.println(catalogFeign.getById(orderDetail.getProductId()).getBody().toString());
            orderDetail.setProductDto(catalogFeign.getById(orderDetail.getProductId()).getBody());

        }
        return orderRepository.findById(id);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order update(Integer id, Order order) {
        order.setId(id);
        return orderRepository.save(order);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }
}
