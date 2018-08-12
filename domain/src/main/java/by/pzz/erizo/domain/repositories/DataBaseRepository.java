package by.pzz.erizo.domain.repositories;

import java.util.List;

import by.pzz.erizo.domain.entity.BucketEntity;
import by.pzz.erizo.domain.entity.DescriptionEntity;
import io.reactivex.Completable;
import io.reactivex.Flowable;

public interface DataBaseRepository {

    Completable save(DescriptionEntity descriptionEntity);

    Flowable<List<BucketEntity>> getDataFromBucket();
}
