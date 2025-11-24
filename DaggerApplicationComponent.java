package ru.psbank.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Provider;
import java.util.Map;
import javax.annotation.processing.Generated;
import ru.psbank.acquiring.AcquiringStarterImpl;
import ru.psbank.acquiring.core.AcquiringStarter;
import ru.psbank.acquiringoffice.AcquiringOfficeStarterImpl;
import ru.psbank.acquiringoffice.core.AcquiringOfficeStarter;
import ru.psbank.acquiringoffice.core.CurrencyOperationsStarter;
import ru.psbank.bookkeeping.BookkeepingStarterImpl;
import ru.psbank.bookkeeping.core.BookkeepingStarter;
import ru.psbank.currencyoperations.CurrencyOperationsStarterImpl;
import ru.psbank.currencyoperations.di.CreateOperationFragmentDependencies;
import ru.psbank.currencyoperations.di.OperationsListFragmentDependencies;
import ru.psbank.currencyoperations.repository.CurrencyOperationRepository;
import ru.psbank.currencyoperations.repository.FakeCurrencyOperationRepository_Factory;
import ru.psbank.mainscreen.di.MainScreenFragmentDependencies;
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

  private static final class ApplicationComponentImpl implements ApplicationComponent {
    private final ApplicationComponentImpl applicationComponentImpl = this;

    Provider<CurrencyOperationRepository> bindCurrencyOperationRepositoryProvider;

    ApplicationComponentImpl() {

      initialize();

    }

    Map<Class<? extends ComponentDependencies>, ComponentDependencies> mapOfClassOfAndComponentDependencies(
        ) {
      return MapBuilder.<Class<? extends ComponentDependencies>, ComponentDependencies>newMapBuilder(3).put(CreateOperationFragmentDependencies.class, this).put(OperationsListFragmentDependencies.class, this).put(MainScreenFragmentDependencies.class, this).build();
    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.bindCurrencyOperationRepositoryProvider = DoubleCheck.provider((Provider) (FakeCurrencyOperationRepository_Factory.create()));
    }

    @Override
    public CurrencyOperationRepository getCurrencyOperationRepository() {
      return bindCurrencyOperationRepositoryProvider.get();
    }

    @Override
    public AcquiringOfficeStarter getAcquiringOfficeStarter() {
      return new AcquiringOfficeStarterImpl();
    }

    @Override
    public AcquiringStarter getAcquiringStarter() {
      return new AcquiringStarterImpl();
    }

    @Override
    public BookkeepingStarter getBookkeepingStarter() {
      return new BookkeepingStarterImpl();
    }

    @Override
    public CurrencyOperationsStarter getCurrencyOperationsStarter() {
      return new CurrencyOperationsStarterImpl();
    }

    @Override
    public void inject(App app) {
      injectApp(app);
    }

    private App injectApp(App instance) {
      App_MembersInjector.injectDependencies(instance, mapOfClassOfAndComponentDependencies());
      return instance;
    }
  }
}
