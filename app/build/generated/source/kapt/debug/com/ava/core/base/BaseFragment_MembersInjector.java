package com.ava.core.base;

import androidx.lifecycle.ViewModel;
import androidx.viewbinding.ViewBinding;
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
public final class BaseFragment_MembersInjector<VB extends ViewBinding, VM extends ViewModel> implements MembersInjector<BaseFragment<VB, VM>> {
  private final Provider<SharedPreferencesManager> sharedPreferencesProvider;

  public BaseFragment_MembersInjector(
      Provider<SharedPreferencesManager> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  public static <VB extends ViewBinding, VM extends ViewModel> MembersInjector<BaseFragment<VB, VM>> create(
      Provider<SharedPreferencesManager> sharedPreferencesProvider) {
    return new BaseFragment_MembersInjector<VB, VM>(sharedPreferencesProvider);
  }

  @Override
  public void injectMembers(BaseFragment<VB, VM> instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
  }

  @InjectedFieldSignature("com.ava.core.base.BaseFragment.sharedPreferences")
  public static <VB extends ViewBinding, VM extends ViewModel> void injectSharedPreferences(
      BaseFragment<VB, VM> instance, SharedPreferencesManager sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }
}
