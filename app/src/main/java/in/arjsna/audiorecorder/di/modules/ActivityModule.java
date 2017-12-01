package in.arjsna.audiorecorder.di.modules;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import dagger.Module;
import dagger.Provides;
import in.arjsna.audiorecorder.audiorecording.AudioRecordMVPView;
import in.arjsna.audiorecorder.audiorecording.AudioRecordPresenter;
import in.arjsna.audiorecorder.audiorecording.AudioRecordPresenterImpl;
import in.arjsna.audiorecorder.di.qualifiers.ActivityContext;
import in.arjsna.audiorecorder.di.scopes.ActivityScope;
import in.arjsna.audiorecorder.playlist.PlayListMVPView;
import in.arjsna.audiorecorder.playlist.PlayListPresenter;
import in.arjsna.audiorecorder.playlist.PlayListPresenterImpl;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ActivityModule {

  @Provides
  @ActivityContext
  @ActivityScope
  Context provideActivityContext(Activity activity) {
    return activity;
  }


}
