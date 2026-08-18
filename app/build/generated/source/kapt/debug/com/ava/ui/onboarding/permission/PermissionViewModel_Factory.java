package com.ava.ui.onboarding.permission;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class PermissionViewModel_Factory implements Factory<PermissionViewModel> {
  @Override
  public PermissionViewModel get() {
    return newInstance();
  }

  public static PermissionViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PermissionViewModel newInstance() {
    return new PermissionViewModel();
  }

  private static final class InstanceHolder {
    static final PermissionViewModel_Factory INSTANCE = new PermissionViewModel_Factory();
  }
}
