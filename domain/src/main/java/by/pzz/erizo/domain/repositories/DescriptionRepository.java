package by.pzz.erizo.domain.repositories;

import java.util.List;

import by.pzz.erizo.domain.entity.DescriptionEntity;
import io.reactivex.Observable;

public interface DescriptionRepository {

    Observable<List<DescriptionEntity>> getDescription(String sku);


}
