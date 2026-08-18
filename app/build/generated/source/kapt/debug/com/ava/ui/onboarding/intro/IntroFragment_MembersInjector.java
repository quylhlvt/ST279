package com.ava.ui.onboarding.intro;

import com.ava.core.base.BaseFragment_MembersInjector;
import com.ava.core.helper.SharedPreferencesManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class IntroFragment_MembersInjector implements MembersInjector<IntroFragment> {
  private final Provider<SharedPreferencesManager> sharedPreferencesProvider;

  private final Provider<IntroAdapter> introAdapterProvider;

  public IntroFragment_MembersInjector(Provider<SharedPreferencesManager> sharedPreferencesProvider,
      Provider<IntroAdapter> introAdapterProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.introAdapterProvider = introAdapterProvider;
  }

  public static MembersInjector<IntroFragment> create(
      Provider<SharedPreferencesManager> sharedPreferencesProvider,
      Provider<IntroAdapter> introAdapterProvider) {
    return new IntroFragment_MembersInjector(sharedPreferencesProvider, introAdapterProvider);
  }

  @Override
  public void injectMembers(IntroFragment instance) {
    BaseFragment_MembersInjector.injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectIntroAdapter(instance, introAdapterProvider.get());
  }

  @InjectedFieldSignature("com.ava.ui.onboarding.intro.IntroFragment.introAdapter")
  public static void injectIntroAdapter(IntroFragment instance, IntroAdapter introAdapter) {
    instance.introAdapter = introAdapter;
  }
}
