import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodForm } from './food-form';

describe('FoodForm', () => {
  let component: FoodForm;
  let fixture: ComponentFixture<FoodForm>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FoodForm]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FoodForm);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
