package by.pzz.erizo.data.net;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import by.pzz.erizo.data.entity.DescriptionModel;
import by.pzz.erizo.data.entity.GoodsModel;
import io.reactivex.Observable;

@Singleton
public class RestService {

    private RestApi restApi;

    @Inject
    public RestService(RestApi restApi) {
        this.restApi = restApi;
    }

    public Observable<List<GoodsModel>> loadGoods(String offset) {
        return restApi.loadGoods(offset);
    }

    public Observable<List<DescriptionModel>> getDescription(String sku) {
        return restApi.getDescription(sku);
    }

}
