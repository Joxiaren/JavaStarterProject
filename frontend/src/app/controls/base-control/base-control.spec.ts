import { TestBed } from '@angular/core/testing';

import { BaseControl } from './base-control';

describe('BaseControl', () => {
  let service: BaseControl<any, any>;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BaseControl);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
