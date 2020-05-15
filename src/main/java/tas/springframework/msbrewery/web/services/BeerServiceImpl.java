package tas.springframework.msbrewery.web.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tas.springframework.msbrewery.web.model.BeerDto;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Imperial Brew")
                .beerStyle("IPA")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // TODO
    }

    @Override
    public void deleteById(UUID beerId) {
    log.debug("Deleting a beer!");
    }
}
