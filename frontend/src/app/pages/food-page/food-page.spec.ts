import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodPage } from './food-page';

describe('FoodPage', () => {
  let component: FoodPage;
  let fixture: ComponentFixture<FoodPage>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FoodPage]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FoodPage);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
