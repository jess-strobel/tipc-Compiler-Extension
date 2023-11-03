#include "TipArray.h"
#include "TipInt.h"
#include "TipRef.h"

#include <catch2/catch_test_macros.hpp>

#include <iostream>
#include <sstream>

TEST_CASE("TipArray: Test getters"
          "[TipArray]") {
  std::vector<std::shared_ptr<TipType>> params{std::make_shared<TipInt>(),
                                               std::make_shared<TipInt>()};
  TipArray TipArray(params);
  REQUIRE(2 == TipArray.getArguments().size());
}

TEST_CASE("TipArray: Test equality"
          "[TipArray]") {
  std::vector<std::shared_ptr<TipType>> paramsA{std::make_shared<TipInt>(),
                                                std::make_shared<TipInt>()};
  
  std::vector<std::shared_ptr<TipType>> paramsC{};

  TipArray TipArrayA(paramsA);
  TipArray TipArrayC(paramsC);

  SECTION("Equal when arguments are of same type and length") {
    std::vector<std::shared_ptr<TipType>> paramsB{std::make_shared<TipInt>(),
                                                  std::make_shared<TipInt>()};
    TipArray TipArrayB(paramsB);
    REQUIRE(TipArrayA == TipArrayB);
  }

  SECTION("Equal when both have no arguments") {
    std::vector<std::shared_ptr<TipType>> paramsB{};
    TipArray TipArrayB(paramsB);
    REQUIRE(TipArrayC == TipArrayB);
  }

  SECTION("Not equal when arguments differ by length") {
    std::vector<std::shared_ptr<TipType>> paramsB{std::make_shared<TipInt>()};
    TipArray TipArrayB(paramsB);
    REQUIRE(TipArrayA != TipArrayB);
  }

  SECTION("Not equal when arguments differ by type") {
    std::vector<std::shared_ptr<TipType>> paramsB{std::make_shared<TipInt>()};
    TipArray TipArrayB(paramsB);
    REQUIRE(TipArrayC != TipArrayB);
  }

  SECTION("Not equal when arguments differ by type") {
    std::vector<std::shared_ptr<TipType>> paramsB{
        std::make_shared<TipRef>(std::make_shared<TipInt>()),
        std::make_shared<TipInt>()};
    TipArray TipArrayB(paramsB);
    REQUIRE(TipArrayA != TipArrayB);
  }
}

TEST_CASE("TipArray: Test output stream"
          "[TipArray]") {
  std::vector<std::shared_ptr<TipType>> params{std::make_shared<TipInt>(),
                                               std::make_shared<TipInt>()};
  TipArray TipArray(params);

  auto expectedValue = "[] int";
  std::stringstream stream;
  stream << TipArray;
  std::string actualValue = stream.str();

  REQUIRE(expectedValue == actualValue);
}
