// Generated by Dagger (https://dagger.dev).
package com.example.bazar1177s.repository;

import com.example.bazar1177s.data.db.ProductDao;
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
public final class ConfirmRepository_Factory implements Factory<ConfirmRepository> {
  private final Provider<ProductService> productServiceProvider;

  private final Provider<ProductDao> productDaoProvider;

  public ConfirmRepository_Factory(Provider<ProductService> productServiceProvider,
      Provider<ProductDao> productDaoProvider) {
    this.productServiceProvider = productServiceProvider;
    this.productDaoProvider = productDaoProvider;
  }

  @Override
  public ConfirmRepository get() {
    return newInstance(productServiceProvider.get(), productDaoProvider.get());
  }

  public static ConfirmRepository_Factory create(Provider<ProductService> productServiceProvider,
      Provider<ProductDao> productDaoProvider) {
    return new ConfirmRepository_Factory(productServiceProvider, productDaoProvider);
  }

  public static ConfirmRepository newInstance(ProductService productService,
      ProductDao productDao) {
    return new ConfirmRepository(productService, productDao);
  }
}