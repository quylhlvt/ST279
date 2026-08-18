package com.ava;

import com.ava.data.datalocal.di.AppModule;
import com.ava.data.datalocal.di.DataLocalModule;
import com.ava.ui.language.LanguageFragment_GeneratedInjector;
import com.ava.ui.language.LanguageViewModel_HiltModules;
import com.ava.ui.main.add_character.AddCharacterFragment_GeneratedInjector;
import com.ava.ui.main.add_character.AddCharacterViewModel_HiltModules;
import com.ava.ui.main.cosplay.CosplayFragment_GeneratedInjector;
import com.ava.ui.main.cosplay.CosplayViewModel_HiltModules;
import com.ava.ui.main.createPony.ChoosePonyFragment_GeneratedInjector;
import com.ava.ui.main.createPony.ChoosePonyViewModel_HiltModules;
import com.ava.ui.main.customize.CustomizeFragment_GeneratedInjector;
import com.ava.ui.main.customize.CustomizeViewModel_HiltModules;
import com.ava.ui.main.home.HomeFragment_GeneratedInjector;
import com.ava.ui.main.home.HomeViewModel_HiltModules;
import com.ava.ui.main.myPony.MyPonyFragment_GeneratedInjector;
import com.ava.ui.main.myPony.MyPonyViewModel_HiltModules;
import com.ava.ui.main.random.RandomFragment_GeneratedInjector;
import com.ava.ui.main.random.RandomViewModel_HiltModules;
import com.ava.ui.main.setting.SettingFragment_GeneratedInjector;
import com.ava.ui.main.setting.SettingViewModel_HiltModules;
import com.ava.ui.main.show.ShowFragment_GeneratedInjector;
import com.ava.ui.main.show.ShowViewModel_HiltModules;
import com.ava.ui.main.success.SuccessFragment_GeneratedInjector;
import com.ava.ui.main.success.SuccessViewModel_HiltModules;
import com.ava.ui.main.successcosplay.SuccessCosplayFragment_GeneratedInjector;
import com.ava.ui.main.successcosplay.SuccessCosplayViewModel_HiltModules;
import com.ava.ui.main.view.ViewFragment_GeneratedInjector;
import com.ava.ui.main.view.ViewViewModel_HiltModules;
import com.ava.ui.onboarding.intro.IntroFragment_GeneratedInjector;
import com.ava.ui.onboarding.intro.IntroViewModel_HiltModules;
import com.ava.ui.onboarding.permission.PermissionFragment_GeneratedInjector;
import com.ava.ui.onboarding.permission.PermissionViewModel_HiltModules;
import com.ava.ui.onboarding.splash.SplashFragment_GeneratedInjector;
import com.ava.ui.onboarding.splash.SplashViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.HiltWrapper_SavedStateHandleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.processing.Generated;
import javax.inject.Singleton;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class MyApplication_HiltComponents {
  private MyApplication_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          AppModule.class,
          ApplicationContextModule.class,
          DataLocalModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements MyApplication_GeneratedInjector,
      FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AddCharacterViewModel_HiltModules.KeyModule.class,
          ChoosePonyViewModel_HiltModules.KeyModule.class,
          CosplayViewModel_HiltModules.KeyModule.class,
          CustomizeViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          HiltWrapper_SavedStateHandleModule.class,
          HomeViewModel_HiltModules.KeyModule.class,
          IntroViewModel_HiltModules.KeyModule.class,
          LanguageViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          MyPonyViewModel_HiltModules.KeyModule.class,
          PermissionViewModel_HiltModules.KeyModule.class,
          RandomViewModel_HiltModules.KeyModule.class,
          SettingViewModel_HiltModules.KeyModule.class,
          ShowViewModel_HiltModules.KeyModule.class,
          SplashViewModel_HiltModules.KeyModule.class,
          SuccessCosplayViewModel_HiltModules.KeyModule.class,
          SuccessViewModel_HiltModules.KeyModule.class,
          ViewModelActivity_HiltModules.KeyModule.class,
          ViewViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements MainActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AddCharacterViewModel_HiltModules.BindsModule.class,
          ChoosePonyViewModel_HiltModules.BindsModule.class,
          CosplayViewModel_HiltModules.BindsModule.class,
          CustomizeViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          HomeViewModel_HiltModules.BindsModule.class,
          IntroViewModel_HiltModules.BindsModule.class,
          LanguageViewModel_HiltModules.BindsModule.class,
          MyPonyViewModel_HiltModules.BindsModule.class,
          PermissionViewModel_HiltModules.BindsModule.class,
          RandomViewModel_HiltModules.BindsModule.class,
          SettingViewModel_HiltModules.BindsModule.class,
          ShowViewModel_HiltModules.BindsModule.class,
          SplashViewModel_HiltModules.BindsModule.class,
          SuccessCosplayViewModel_HiltModules.BindsModule.class,
          SuccessViewModel_HiltModules.BindsModule.class,
          ViewModelActivity_HiltModules.BindsModule.class,
          ViewViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements LanguageFragment_GeneratedInjector,
      AddCharacterFragment_GeneratedInjector,
      CosplayFragment_GeneratedInjector,
      ChoosePonyFragment_GeneratedInjector,
      CustomizeFragment_GeneratedInjector,
      HomeFragment_GeneratedInjector,
      MyPonyFragment_GeneratedInjector,
      RandomFragment_GeneratedInjector,
      SettingFragment_GeneratedInjector,
      ShowFragment_GeneratedInjector,
      SuccessFragment_GeneratedInjector,
      SuccessCosplayFragment_GeneratedInjector,
      ViewFragment_GeneratedInjector,
      IntroFragment_GeneratedInjector,
      PermissionFragment_GeneratedInjector,
      SplashFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
