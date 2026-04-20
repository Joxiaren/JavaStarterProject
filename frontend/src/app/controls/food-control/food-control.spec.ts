import { TestBed } from "@angular/core/testing";

import { FoodControl } from "./food-control";

describe("FoodControl", () => {
  let service: FoodControl;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FoodControl);
  });

  it("should be created", () => {
    expect(service).toBeTruthy();
  });
});
