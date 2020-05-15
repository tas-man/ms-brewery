package tas.springframework.msbrewery.web.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tas.springframework.msbrewery.web.model.CustomerDto;

import java.util.UUID;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID beerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Billy Bob")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // TODO
        log.debug("Updating customer...");
    }

    @Override
    public void deleteById(UUID customerId) {
        // TODO
        log.debug("Deleting customer...");
    }
}
