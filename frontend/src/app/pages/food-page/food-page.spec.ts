import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodPage } from './food-page';
import { HttpTestingController, provideHttpClientTesting } from '@angular/common/http/testing';
import { provideHttpClient } from '@angular/common/http';

describe('FoodPage', () => {
  let component: FoodPage;
  let fixture: ComponentFixture<FoodPage>;
  let httpMock: HttpTestingController;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FoodPage],
      providers: [
        provideHttpClient(),
        provideHttpClientTesting(),
      ]
    })
      .compileComponents();

    fixture = TestBed.createComponent(FoodPage);
    component = fixture.componentInstance;
    httpMock = TestBed.inject(HttpTestingController);
    await fixture.whenStable();
  });

  it('should create', () => {
    fixture.detectChanges();
    const req = httpMock.expectOne('http://localhost:8080/api/food');
    req.flush([]);
    expect(component).toBeTruthy();
  });
});
