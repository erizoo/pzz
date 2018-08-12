package by.pzz.erizo.pzz.injection;

import android.content.Context;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import by.pzz.erizo.data.BuildConfig;
import by.pzz.erizo.data.net.RestApi;
import by.pzz.erizo.data.net.RestService;
import by.pzz.erizo.data.repositories.DescriptionRepositoryImpl;
import by.pzz.erizo.data.repositories.GoodRepositoryImpl;
import by.pzz.erizo.domain.executor.PostExecutionThread;
import by.pzz.erizo.domain.repositories.DataBaseRepository;
import by.pzz.erizo.domain.repositories.DescriptionRepository;
import by.pzz.erizo.domain.repositories.GoodsRepository;
import by.pzz.erizo.pzz.executor.UIThread;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context getContext() {
        return context;
    }

    @Provides
    @Singleton
    public PostExecutionThread getUiThread() {
        return new UIThread();
    }

    @Provides
    public GoodsRepository getUserRepository(Context context, RestService restService) {
        return new GoodRepositoryImpl(context, restService);
    }

    @Provides
    public DescriptionRepository getDescriptionRepository(Context context, RestService restService) {
        return new DescriptionRepositoryImpl(context, restService);
    }

    @Provides
    @Singleton
    public Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("http://ram.by/test/sku/")
                .build();
    }

    @Provides
    @Singleton
    public RestApi getRestApi(Retrofit retrofit) {
        return retrofit.create(RestApi.class);
    }

    @Provides
    @Singleton
    public OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(5, TimeUnit.SECONDS).writeTimeout(5, TimeUnit.SECONDS).connectTimeout(5, TimeUnit.SECONDS);
        //                модификация запроса
        //                .addInterceptor()
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
            builder.addInterceptor(loggingInterceptor);
        }
        return builder.build();
    }
}
