package by.pzz.erizo.domain.repositories;

import java.util.List;

import by.pzz.erizo.domain.entity.GoodsEntity;
import io.reactivex.Observable;

public interface GoodsRepository {

    Observable<List<GoodsEntity>> getGoods(String offset);
}
