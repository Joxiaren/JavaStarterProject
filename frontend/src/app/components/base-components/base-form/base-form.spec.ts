import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BaseForm } from './base-form';

describe('BaseForm', () => {
  let component: BaseForm;
  let fixture: ComponentFixture<BaseForm>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BaseForm]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BaseForm);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
