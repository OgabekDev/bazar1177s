// Generated by Dagger (https://dagger.dev).
package com.example.bazar1177s.repository;

import com.example.bazar1177s.data.db.ProductOrderDao;
import com.example.bazar1177s.network.ProductService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailsRepository_Factory implements Factory<DetailsRepository> {
  private final Provider<ProductService> productServiceProvider;

  private final Provider<ProductOrderDao> daoProvider;

  public DetailsRepository_Factory(Provider<ProductService> productServiceProvider,
      Provider<ProductOrderDao> daoProvider) {
    this.productServiceProvider = productServiceProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public DetailsRepository get() {
    return newInstance(productServiceProvider.get(), daoProvider.get());
  }

  public static DetailsRepository_Factory create(Provider<ProductService> productServiceProvider,
      Provider<ProductOrderDao> daoProvider) {
    return new DetailsRepository_Factory(productServiceProvider, daoProvider);
  }

  public static DetailsRepository newInstance(ProductService productService, ProductOrderDao dao) {
    return new DetailsRepository(productService, dao);
  }
}
