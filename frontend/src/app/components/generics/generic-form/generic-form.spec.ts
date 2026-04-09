import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GenericForm } from './generic-form';

describe('GenericForm', () => {
  let component: GenericForm;
  let fixture: ComponentFixture<GenericForm>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GenericForm]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GenericForm);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
