import { TestBed } from "@angular/core/testing";
import { BaseService } from "./base-service";
import { provideHttpClient } from "@angular/common/http";
import { provideHttpClientTesting } from "@angular/common/http/testing";
import { BaseModel } from "model/base-model";

describe("BaseService", () => {
  let service: BaseService<number, BaseModel<number>>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TestBaseService, provideHttpClient(), provideHttpClientTesting()]
    });
    service = TestBed.inject(TestBaseService);
  });

  it("should be created", () => {
    expect(service).toBeTruthy();
  });
});

export class TestBaseService extends BaseService<number, BaseModel<number>> {
  override resource = "";
}
