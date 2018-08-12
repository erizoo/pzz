package by.pzz.erizo.data.repositories;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import by.pzz.erizo.data.entity.DescriptionModel;
import by.pzz.erizo.data.net.RestService;
import by.pzz.erizo.domain.entity.DescriptionEntity;
import by.pzz.erizo.domain.repositories.DescriptionRepository;
import io.reactivex.Observable;

public class DescriptionRepositoryImpl implements DescriptionRepository {

    private Context context;
    private RestService restService;


    @Inject
    public DescriptionRepositoryImpl(Context context, RestService restService) {
        this.context = context;
        this.restService = restService;
    }

    @Override
    public Observable<List<DescriptionEntity>> getDescription(String sku) {
        return restService.getDescription(sku).map(descriptionModels -> {
            List<DescriptionEntity> descriptionEntityList = new ArrayList<>();
            DescriptionModel description = descriptionModels.get(0);
            descriptionEntityList.add(
                    new DescriptionEntity(
                            sku,
                            description.getName(),
                            description.getPrice(),
                            description.getImages().get(0),
                            description.getShortDescription()));
            return descriptionEntityList;
        });
    }



}
