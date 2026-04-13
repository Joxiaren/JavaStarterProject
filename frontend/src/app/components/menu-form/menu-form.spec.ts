import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuForm } from './menu-form';

describe('MenuForm', () => {
  let component: MenuForm;
  let fixture: ComponentFixture<MenuForm>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MenuForm]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MenuForm);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
