import { TestBed } from '@angular/core/testing';

import { CategoryControl } from './category-control';

describe('CategoryControl', () => {
  let service: CategoryControl;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CategoryControl);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
