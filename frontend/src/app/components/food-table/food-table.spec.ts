import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodTable } from './food-table';

describe('FoodTable', () => {
  let component: FoodTable;
  let fixture: ComponentFixture<FoodTable>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FoodTable]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FoodTable);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
