# OnlineShoppingApp

## Project Structure:

com.freez.onlineShopping
├── app                    (Main Android application module, UI, ViewModels)
│   └── navigation         (App-wide navigation setup)
├── core                   (Common utilities, extensions, base classes)
├── data                   (Handles all data sources)
│   ├── product
│   ├── api                (Retrofit interfaces, API service classes)
│   ├── local              (Room database, DAOs)
│   └── repository         (Repository implementations that interact with domain layer)
├── domain                 (Core business logic, independent of UI/data layers)
│   ├── products
│   │   ├── model
│   │   └── usecase
│   └── cart
│       ├── model
│       └── usecase
└── feature                (UI and ViewModel logic for individual features)
    ├── productList        (Product listing feature - UI, ViewModel)
    ├── productDetail      (Product detail feature - UI, ViewModel)
    ├── compareProduct     (Compare product feature - UI, ViewModel)
    ├── searchProduct      (Search product feature - UI, ViewModel)
    └── cart               (Cart feature - UI, ViewModel)
