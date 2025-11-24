package ru.psbank.modules;

import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerApplication;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Collections;
import java.util.Map;
import javax.annotation.processing.Generated;
import ru.psbank.acquiring.AcquiringStarterImpl;
import ru.psbank.acquiring.di.AcquiringInternalModule_ContributeAcquiringFragment;
import ru.psbank.acquiring.interactor.AcquiringInteractor;
import ru.psbank.acquiring.interactor.AcquiringInteractor_Factory;
import ru.psbank.acquiring.repository.FakeAcquiringRepository_Factory;
import ru.psbank.acquiring.ui.AcquiringFragment;
import ru.psbank.acquiring.ui.AcquiringFragment_MembersInjector;
import ru.psbank.acquiring.ui.AcquiringViewModel;
import ru.psbank.acquiring.ui.AcquiringViewModel_Factory;
import ru.psbank.acquiring.usecase.GetPaymentsUseCase;
import ru.psbank.acquiring.usecase.GetPaymentsUseCase_Factory;
import ru.psbank.acquiringoffice.AcquiringOfficeStarterImpl;
import ru.psbank.acquiringoffice.di.AcquiringOfficeInternalModule_ContributeTerminalFragment;
import ru.psbank.acquiringoffice.interactor.TerminalInteractor;
import ru.psbank.acquiringoffice.interactor.TerminalInteractor_Factory;
import ru.psbank.acquiringoffice.repository.FakeTerminalRepository_Factory;
import ru.psbank.acquiringoffice.ui.TerminalFragment;
import ru.psbank.acquiringoffice.ui.TerminalFragment_MembersInjector;
import ru.psbank.acquiringoffice.ui.TerminalViewModel;
import ru.psbank.acquiringoffice.ui.TerminalViewModel_Factory;
import ru.psbank.acquiringoffice.usecase.GetTerminalsUseCase;
import ru.psbank.acquiringoffice.usecase.GetTerminalsUseCase_Factory;
import ru.psbank.bookkeeping.BookkeepingStarterImpl;
import ru.psbank.bookkeeping.di.BookkeepingInternalModule_ContributeBookkeepingFragment;
import ru.psbank.bookkeeping.interactor.BookkeepingInteractor;
import ru.psbank.bookkeeping.interactor.BookkeepingInteractor_Factory;
import ru.psbank.bookkeeping.repository.FakeBookkeepingRepository_Factory;
import ru.psbank.bookkeeping.ui.BookkeepingFragment;
import ru.psbank.bookkeeping.ui.BookkeepingFragment_MembersInjector;
import ru.psbank.bookkeeping.ui.BookkeepingViewModel;
import ru.psbank.bookkeeping.ui.BookkeepingViewModel_Factory;
import ru.psbank.bookkeeping.usecase.GetTransactionsUseCase;
import ru.psbank.bookkeeping.usecase.GetTransactionsUseCase_Factory;
import ru.psbank.currencyoperations.CurrencyOperationsStarterImpl;
import ru.psbank.currencyoperations.di.CreateOperationFragmentDependencies;
import ru.psbank.currencyoperations.di.OperationsListFragmentDependencies;
import ru.psbank.currencyoperations.repository.CurrencyOperationRepository;
import ru.psbank.currencyoperations.repository.FakeCurrencyOperationRepository_Factory;
import ru.psbank.mainscreen.di.MainScreenInternalModule_ContributeMainScreenFragment;
import ru.psbank.mainscreen.ui.MainScreenFragment;
import ru.psbank.mainscreen.ui.MainScreenFragment_MembersInjector;
import ru.psbank.utls.ComponentDependencies;

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
public final class DaggerApplicationComponent {
  private DaggerApplicationComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    public ApplicationComponent build() {
      return new ApplicationComponentImpl();
    }
  }

  private static final class AcquiringFragmentSubcomponentFactory implements AcquiringInternalModule_ContributeAcquiringFragment.AcquiringFragmentSubcomponent.Factory {
    private final ApplicationComponentImpl applicationComponentImpl;

    private AcquiringFragmentSubcomponentFactory(
        ApplicationComponentImpl applicationComponentImpl) {
      this.applicationComponentImpl = applicationComponentImpl;
    }

    @Override
    public AcquiringInternalModule_ContributeAcquiringFragment.AcquiringFragmentSubcomponent create(
        AcquiringFragment instance) {
      Preconditions.checkNotNull(instance);
      return new AcquiringFragmentSubcomponentImpl(applicationComponentImpl, instance);
    }
  }

  private static final class MainScreenFragmentSubcomponentFactory implements MainScreenInternalModule_ContributeMainScreenFragment.MainScreenFragmentSubcomponent.Factory {
    private final ApplicationComponentImpl applicationComponentImpl;

    private MainScreenFragmentSubcomponentFactory(
        ApplicationComponentImpl applicationComponentImpl) {
      this.applicationComponentImpl = applicationComponentImpl;
    }

    @Override
    public MainScreenInternalModule_ContributeMainScreenFragment.MainScreenFragmentSubcomponent create(
        MainScreenFragment instance) {
      Preconditions.checkNotNull(instance);
      return new MainScreenFragmentSubcomponentImpl(applicationComponentImpl, instance);
    }
  }

  private static final class BookkeepingFragmentSubcomponentFactory implements BookkeepingInternalModule_ContributeBookkeepingFragment.BookkeepingFragmentSubcomponent.Factory {
    private final ApplicationComponentImpl applicationComponentImpl;

    private BookkeepingFragmentSubcomponentFactory(
        ApplicationComponentImpl applicationComponentImpl) {
      this.applicationComponentImpl = applicationComponentImpl;
    }

    @Override
    public BookkeepingInternalModule_ContributeBookkeepingFragment.BookkeepingFragmentSubcomponent create(
        BookkeepingFragment instance) {
      Preconditions.checkNotNull(instance);
      return new BookkeepingFragmentSubcomponentImpl(applicationComponentImpl, instance);
    }
  }

  private static final class TerminalFragmentSubcomponentFactory implements AcquiringOfficeInternalModule_ContributeTerminalFragment.TerminalFragmentSubcomponent.Factory {
    private final ApplicationComponentImpl applicationComponentImpl;

    private TerminalFragmentSubcomponentFactory(ApplicationComponentImpl applicationComponentImpl) {
      this.applicationComponentImpl = applicationComponentImpl;
    }

    @Override
    public AcquiringOfficeInternalModule_ContributeTerminalFragment.TerminalFragmentSubcomponent create(
        TerminalFragment instance) {
      Preconditions.checkNotNull(instance);
      return new TerminalFragmentSubcomponentImpl(applicationComponentImpl, instance);
    }
  }

  private static final class AcquiringFragmentSubcomponentImpl implements AcquiringInternalModule_ContributeAcquiringFragment.AcquiringFragmentSubcomponent {
    private final ApplicationComponentImpl applicationComponentImpl;

    private final AcquiringFragmentSubcomponentImpl acquiringFragmentSubcomponentImpl = this;

    Provider<GetPaymentsUseCase> getPaymentsUseCaseProvider;

    Provider<AcquiringInteractor> acquiringInteractorProvider;

    Provider<AcquiringViewModel> acquiringViewModelProvider;

    AcquiringFragmentSubcomponentImpl(ApplicationComponentImpl applicationComponentImpl,
        AcquiringFragment instanceParam) {
      this.applicationComponentImpl = applicationComponentImpl;

      initialize(instanceParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final AcquiringFragment instanceParam) {
      this.getPaymentsUseCaseProvider = GetPaymentsUseCase_Factory.create(((Provider) (FakeAcquiringRepository_Factory.create())));
      this.acquiringInteractorProvider = AcquiringInteractor_Factory.create(getPaymentsUseCaseProvider);
      this.acquiringViewModelProvider = AcquiringViewModel_Factory.create(acquiringInteractorProvider);
    }

    @Override
    public void inject(AcquiringFragment instance) {
      injectAcquiringFragment(instance);
    }

    private AcquiringFragment injectAcquiringFragment(AcquiringFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, applicationComponentImpl.dispatchingAndroidInjectorOfObject());
      AcquiringFragment_MembersInjector.injectViewModelProvider(instance, acquiringViewModelProvider);
      return instance;
    }
  }

  private static final class MainScreenFragmentSubcomponentImpl implements MainScreenInternalModule_ContributeMainScreenFragment.MainScreenFragmentSubcomponent {
    private final ApplicationComponentImpl applicationComponentImpl;

    private final MainScreenFragmentSubcomponentImpl mainScreenFragmentSubcomponentImpl = this;

    MainScreenFragmentSubcomponentImpl(ApplicationComponentImpl applicationComponentImpl,
        MainScreenFragment instanceParam) {
      this.applicationComponentImpl = applicationComponentImpl;


    }

    @Override
    public void inject(MainScreenFragment instance) {
      injectMainScreenFragment(instance);
    }

    private MainScreenFragment injectMainScreenFragment(MainScreenFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, applicationComponentImpl.dispatchingAndroidInjectorOfObject());
      MainScreenFragment_MembersInjector.injectAcquiringOfficeStarter(instance, new AcquiringOfficeStarterImpl());
      MainScreenFragment_MembersInjector.injectAcquiringStarter(instance, new AcquiringStarterImpl());
      MainScreenFragment_MembersInjector.injectBookkeepingStarter(instance, new BookkeepingStarterImpl());
      MainScreenFragment_MembersInjector.injectCurrencyOperationsStarter(instance, new CurrencyOperationsStarterImpl());
      return instance;
    }
  }

  private static final class BookkeepingFragmentSubcomponentImpl implements BookkeepingInternalModule_ContributeBookkeepingFragment.BookkeepingFragmentSubcomponent {
    private final ApplicationComponentImpl applicationComponentImpl;

    private final BookkeepingFragmentSubcomponentImpl bookkeepingFragmentSubcomponentImpl = this;

    Provider<GetTransactionsUseCase> getTransactionsUseCaseProvider;

    Provider<BookkeepingInteractor> bookkeepingInteractorProvider;

    Provider<BookkeepingViewModel> bookkeepingViewModelProvider;

    BookkeepingFragmentSubcomponentImpl(ApplicationComponentImpl applicationComponentImpl,
        BookkeepingFragment instanceParam) {
      this.applicationComponentImpl = applicationComponentImpl;

      initialize(instanceParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final BookkeepingFragment instanceParam) {
      this.getTransactionsUseCaseProvider = GetTransactionsUseCase_Factory.create(((Provider) (FakeBookkeepingRepository_Factory.create())));
      this.bookkeepingInteractorProvider = BookkeepingInteractor_Factory.create(getTransactionsUseCaseProvider);
      this.bookkeepingViewModelProvider = BookkeepingViewModel_Factory.create(bookkeepingInteractorProvider);
    }

    @Override
    public void inject(BookkeepingFragment instance) {
      injectBookkeepingFragment(instance);
    }

    private BookkeepingFragment injectBookkeepingFragment(BookkeepingFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, applicationComponentImpl.dispatchingAndroidInjectorOfObject());
      BookkeepingFragment_MembersInjector.injectViewModelProvider(instance, bookkeepingViewModelProvider);
      return instance;
    }
  }

  private static final class TerminalFragmentSubcomponentImpl implements AcquiringOfficeInternalModule_ContributeTerminalFragment.TerminalFragmentSubcomponent {
    private final ApplicationComponentImpl applicationComponentImpl;

    private final TerminalFragmentSubcomponentImpl terminalFragmentSubcomponentImpl = this;

    Provider<GetTerminalsUseCase> getTerminalsUseCaseProvider;

    Provider<TerminalInteractor> terminalInteractorProvider;

    Provider<TerminalViewModel> terminalViewModelProvider;

    TerminalFragmentSubcomponentImpl(ApplicationComponentImpl applicationComponentImpl,
        TerminalFragment instanceParam) {
      this.applicationComponentImpl = applicationComponentImpl;

      initialize(instanceParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final TerminalFragment instanceParam) {
      this.getTerminalsUseCaseProvider = GetTerminalsUseCase_Factory.create(((Provider) (FakeTerminalRepository_Factory.create())));
      this.terminalInteractorProvider = TerminalInteractor_Factory.create(getTerminalsUseCaseProvider);
      this.terminalViewModelProvider = TerminalViewModel_Factory.create(terminalInteractorProvider);
    }

    @Override
    public void inject(TerminalFragment instance) {
      injectTerminalFragment(instance);
    }

    private TerminalFragment injectTerminalFragment(TerminalFragment instance) {
      DaggerFragment_MembersInjector.injectAndroidInjector(instance, applicationComponentImpl.dispatchingAndroidInjectorOfObject());
      TerminalFragment_MembersInjector.injectViewModelProvider(instance, terminalViewModelProvider);
      return instance;
    }
  }

  private static final class ApplicationComponentImpl implements ApplicationComponent {
    private final ApplicationComponentImpl applicationComponentImpl = this;

    Provider<CurrencyOperationRepository> bindCurrencyOperationRepositoryProvider;

    Provider<AcquiringInternalModule_ContributeAcquiringFragment.AcquiringFragmentSubcomponent.Factory> acquiringFragmentSubcomponentFactoryProvider;

    Provider<MainScreenInternalModule_ContributeMainScreenFragment.MainScreenFragmentSubcomponent.Factory> mainScreenFragmentSubcomponentFactoryProvider;

    Provider<BookkeepingInternalModule_ContributeBookkeepingFragment.BookkeepingFragmentSubcomponent.Factory> bookkeepingFragmentSubcomponentFactoryProvider;

    Provider<AcquiringOfficeInternalModule_ContributeTerminalFragment.TerminalFragmentSubcomponent.Factory> terminalFragmentSubcomponentFactoryProvider;

    ApplicationComponentImpl() {

      initialize();

    }

    Map<Class<?>, javax.inject.Provider<dagger.android.AndroidInjector.Factory<?>>> mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return MapBuilder.<Class<?>, javax.inject.Provider<dagger.android.AndroidInjector.Factory<?>>>newMapBuilder(4).put(AcquiringFragment.class, ((Provider) (acquiringFragmentSubcomponentFactoryProvider))).put(MainScreenFragment.class, ((Provider) (mainScreenFragmentSubcomponentFactoryProvider))).put(BookkeepingFragment.class, ((Provider) (bookkeepingFragmentSubcomponentFactoryProvider))).put(TerminalFragment.class, ((Provider) (terminalFragmentSubcomponentFactoryProvider))).build();
    }

    DispatchingAndroidInjector<Object> dispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, javax.inject.Provider<dagger.android.AndroidInjector.Factory<?>>>emptyMap());
    }

    DispatchingAndroidInjector<DaggerApplication> dispatchingAndroidInjectorOfDaggerApplication() {
      return DispatchingAndroidInjector_Factory.newInstance(mapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, javax.inject.Provider<dagger.android.AndroidInjector.Factory<?>>>emptyMap());
    }

    Map<Class<? extends ComponentDependencies>, ComponentDependencies> mapOfClassOfAndComponentDependencies(
        ) {
      return MapBuilder.<Class<? extends ComponentDependencies>, ComponentDependencies>newMapBuilder(2).put(CreateOperationFragmentDependencies.class, this).put(OperationsListFragmentDependencies.class, this).build();
    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.bindCurrencyOperationRepositoryProvider = DoubleCheck.provider((Provider) (FakeCurrencyOperationRepository_Factory.create()));
      this.acquiringFragmentSubcomponentFactoryProvider = new Provider<AcquiringInternalModule_ContributeAcquiringFragment.AcquiringFragmentSubcomponent.Factory>() {
        @Override
        public AcquiringInternalModule_ContributeAcquiringFragment.AcquiringFragmentSubcomponent.Factory get(
            ) {
          return new AcquiringFragmentSubcomponentFactory(applicationComponentImpl);
        }
      };
      this.mainScreenFragmentSubcomponentFactoryProvider = new Provider<MainScreenInternalModule_ContributeMainScreenFragment.MainScreenFragmentSubcomponent.Factory>() {
        @Override
        public MainScreenInternalModule_ContributeMainScreenFragment.MainScreenFragmentSubcomponent.Factory get(
            ) {
          return new MainScreenFragmentSubcomponentFactory(applicationComponentImpl);
        }
      };
      this.bookkeepingFragmentSubcomponentFactoryProvider = new Provider<BookkeepingInternalModule_ContributeBookkeepingFragment.BookkeepingFragmentSubcomponent.Factory>() {
        @Override
        public BookkeepingInternalModule_ContributeBookkeepingFragment.BookkeepingFragmentSubcomponent.Factory get(
            ) {
          return new BookkeepingFragmentSubcomponentFactory(applicationComponentImpl);
        }
      };
      this.terminalFragmentSubcomponentFactoryProvider = new Provider<AcquiringOfficeInternalModule_ContributeTerminalFragment.TerminalFragmentSubcomponent.Factory>() {
        @Override
        public AcquiringOfficeInternalModule_ContributeTerminalFragment.TerminalFragmentSubcomponent.Factory get(
            ) {
          return new TerminalFragmentSubcomponentFactory(applicationComponentImpl);
        }
      };
    }

    @Override
    public CurrencyOperationRepository getCurrencyOperationRepository() {
      return bindCurrencyOperationRepositoryProvider.get();
    }

    @Override
    public void inject(App app) {
      injectApp(app);
    }

    private App injectApp(App instance) {
      DaggerApplication_MembersInjector.injectAndroidInjector(instance, dispatchingAndroidInjectorOfObject());
      App_MembersInjector.injectDispatchingAndroidInjector(instance, dispatchingAndroidInjectorOfDaggerApplication());
      App_MembersInjector.injectDependencies(instance, mapOfClassOfAndComponentDependencies());
      return instance;
    }
  }
}
