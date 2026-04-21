import { ComponentFixture, TestBed } from "@angular/core/testing";

import { CategoryPage } from "./category-page";
import { provideHttpClient } from "@angular/common/http";
import { HttpTestingController, provideHttpClientTesting } from "@angular/common/http/testing";

describe("CategoryPage", () => {
  let component: CategoryPage;
  let fixture: ComponentFixture<CategoryPage>;
  let httpMock: HttpTestingController;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CategoryPage],
      providers: [provideHttpClient(), provideHttpClientTesting()]
    }).compileComponents();

    fixture = TestBed.createComponent(CategoryPage);
    component = fixture.componentInstance;
    httpMock = TestBed.inject(HttpTestingController);
    await fixture.whenStable();
  });

  it("should create", () => {
    fixture.detectChanges();
    const req = httpMock.expectOne("http://localhost:8080/api/category");
    req.flush([]);
    expect(component).toBeTruthy();
  });

  afterEach(() => {
    httpMock.verify();
  });
});
