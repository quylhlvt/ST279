package com.ava;

import android.content.Context;
import com.ava.data.datalocal.manager.AppDataManager;
import com.ava.data.usecase.GetCatalogueUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.flow.Flow;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class ViewModelActivity_Factory implements Factory<ViewModelActivity> {
  private final Provider<GetCatalogueUseCase> getCatalogueUseCaseProvider;

  private final Provider<AppDataManager> appDataManagerProvider;

  private final Provider<Flow<Boolean>> networkFlowProvider;

  private final Provider<Context> contextProvider;

  public ViewModelActivity_Factory(Provider<GetCatalogueUseCase> getCatalogueUseCaseProvider,
      Provider<AppDataManager> appDataManagerProvider, Provider<Flow<Boolean>> networkFlowProvider,
      Provider<Context> contextProvider) {
    this.getCatalogueUseCaseProvider = getCatalogueUseCaseProvider;
    this.appDataManagerProvider = appDataManagerProvider;
    this.networkFlowProvider = networkFlowProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public ViewModelActivity get() {
    return newInstance(getCatalogueUseCaseProvider.get(), appDataManagerProvider.get(), networkFlowProvider.get(), contextProvider.get());
  }

  public static ViewModelActivity_Factory create(
      Provider<GetCatalogueUseCase> getCatalogueUseCaseProvider,
      Provider<AppDataManager> appDataManagerProvider, Provider<Flow<Boolean>> networkFlowProvider,
      Provider<Context> contextProvider) {
    return new ViewModelActivity_Factory(getCatalogueUseCaseProvider, appDataManagerProvider, networkFlowProvider, contextProvider);
  }

  public static ViewModelActivity newInstance(GetCatalogueUseCase getCatalogueUseCase,
      AppDataManager appDataManager, Flow<Boolean> networkFlow, Context context) {
    return new ViewModelActivity(getCatalogueUseCase, appDataManager, networkFlow, context);
  }
}
