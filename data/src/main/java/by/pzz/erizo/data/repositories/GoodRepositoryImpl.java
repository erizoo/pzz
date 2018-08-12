package by.pzz.erizo.data.repositories;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import by.pzz.erizo.data.entity.GoodsModel;
import by.pzz.erizo.data.net.RestService;
import by.pzz.erizo.domain.entity.GoodsEntity;
import by.pzz.erizo.domain.repositories.GoodsRepository;
import io.reactivex.Observable;

public class GoodRepositoryImpl implements GoodsRepository {

    private Context context;
    private RestService restService;

    @Inject
    public GoodRepositoryImpl(Context context, RestService restService) {
        this.context = context;
        this.restService = restService;
    }

    @Override
    public Observable<List<GoodsEntity>> getGoods(String offset) {
        return restService.loadGoods(offset).map(goodsModels ->{
            List<GoodsEntity> goodsEntities = new ArrayList<>();
            for (GoodsModel item: goodsModels) {
                goodsEntities.add(new GoodsEntity(item.getName(), item.getSku(), item.getPrice()));
            }
            return goodsEntities;
        });
    }


}
