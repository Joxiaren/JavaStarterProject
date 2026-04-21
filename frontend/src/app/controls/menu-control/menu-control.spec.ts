import { TestBed } from "@angular/core/testing";

import { MenuControl } from "./menu-control";

describe("MenuControl", () => {
  let service: MenuControl;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MenuControl);
  });

  it("should be created", () => {
    expect(service).toBeTruthy();
  });
});
