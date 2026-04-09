import { TestBed } from '@angular/core/testing';

import { GenericControl } from './generic-control';

describe('GenericControl', () => {
  let service: GenericControl<any, any>;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GenericControl);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
