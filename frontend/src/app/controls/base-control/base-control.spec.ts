import { TestBed } from "@angular/core/testing";

import { BaseControl } from "./base-control";
import { inject } from "@angular/core";
import { TestBaseService } from "app/services/base-service.spec";
import { BaseModel } from "model/base-model";

describe("BaseControl", () => {
  let service: TestBaseControl;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TestBaseControl, TestBaseService]
    });
    service = TestBed.inject(TestBaseControl);
  });

  it("should be created", () => {
    expect(service).toBeTruthy();
  });
});

export class TestBaseControl extends BaseControl<number, BaseModel<number>> {
  override service = inject(TestBaseService);
}
