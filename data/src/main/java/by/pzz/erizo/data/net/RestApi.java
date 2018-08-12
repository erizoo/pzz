package by.pzz.erizo.data.net;

import java.util.List;

import by.pzz.erizo.data.entity.DescriptionModel;
import by.pzz.erizo.data.entity.GoodsModel;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestApi {

    @GET("data_from_category.php?key=fbhsdkjerGHEW2Gvkd")
    Observable<List<GoodsModel>> loadGoods(@Query("category") String offset);

    @GET("data_from_sku.php?key=fbhsdkjerGHEW2Gvkd")
    Observable<List<DescriptionModel>> getDescription(@Query("sku") String sku);

}
