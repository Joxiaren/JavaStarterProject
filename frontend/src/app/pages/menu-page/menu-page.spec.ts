import { ComponentFixture, TestBed } from "@angular/core/testing";

import { MenuPage } from "./menu-page";
import { provideHttpClient } from "@angular/common/http";
import { HttpTestingController, provideHttpClientTesting } from "@angular/common/http/testing";

describe("MenuPage", () => {
  let component: MenuPage;
  let fixture: ComponentFixture<MenuPage>;
  let httpMock: HttpTestingController;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MenuPage],
      providers: [provideHttpClient(), provideHttpClientTesting()]
    }).compileComponents();

    fixture = TestBed.createComponent(MenuPage);
    component = fixture.componentInstance;
    httpMock = TestBed.inject(HttpTestingController);
    await fixture.whenStable();
  });

  it("should create", () => {
    fixture.detectChanges();
    const req = httpMock.expectOne("http://localhost:8080/api/menu");
    req.flush([]);
    expect(component).toBeTruthy();
  });
});
