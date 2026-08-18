package com.ava.ui.main.add_character;

import com.ava.core.base.BaseFragment_MembersInjector;
import com.ava.core.helper.SharedPreferencesManager;
import com.ava.data.datalocal.manager.CharacterImageManager;
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
public final class AddCharacterFragment_MembersInjector implements MembersInjector<AddCharacterFragment> {
  private final Provider<SharedPreferencesManager> sharedPreferencesProvider;

  private final Provider<CharacterImageManager> imageManagerProvider;

  public AddCharacterFragment_MembersInjector(
      Provider<SharedPreferencesManager> sharedPreferencesProvider,
      Provider<CharacterImageManager> imageManagerProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.imageManagerProvider = imageManagerProvider;
  }

  public static MembersInjector<AddCharacterFragment> create(
      Provider<SharedPreferencesManager> sharedPreferencesProvider,
      Provider<CharacterImageManager> imageManagerProvider) {
    return new AddCharacterFragment_MembersInjector(sharedPreferencesProvider, imageManagerProvider);
  }

  @Override
  public void injectMembers(AddCharacterFragment instance) {
    BaseFragment_MembersInjector.injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectImageManager(instance, imageManagerProvider.get());
  }

  @InjectedFieldSignature("com.ava.ui.main.add_character.AddCharacterFragment.imageManager")
  public static void injectImageManager(AddCharacterFragment instance,
      CharacterImageManager imageManager) {
    instance.imageManager = imageManager;
  }
}
