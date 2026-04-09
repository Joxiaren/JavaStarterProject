import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GenericTable } from './generic-table';

describe('GenericTable', () => {
  let component: GenericTable;
  let fixture: ComponentFixture<GenericTable>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GenericTable]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GenericTable);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
