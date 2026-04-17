import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BaseTable } from './base-table';

describe('BaseTable', () => {
  let component: BaseTable;
  let fixture: ComponentFixture<BaseTable>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BaseTable]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BaseTable);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
