package codpath.sneha.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TVs34nHXSVoI8PTzPUyh49hljOApZG0EEWAljj7k")
                .clientKey("Heu6krjsbm5MHdDLYpdsqvgnpkGBLQ8TCzbZi2hz")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
