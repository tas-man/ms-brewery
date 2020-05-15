package tas.springframework.msbrewery.web.services.V2;

import org.springframework.stereotype.Service;
import tas.springframework.msbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

import static tas.springframework.msbrewery.web.model.v2.BeerStyleEnum.IPA;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Imperial Brew")
                .beerStyle(IPA)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
