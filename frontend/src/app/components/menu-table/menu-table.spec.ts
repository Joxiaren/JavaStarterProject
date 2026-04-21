import { ComponentFixture, TestBed } from "@angular/core/testing";

import { MenuTable } from "./menu-table";

describe("MenuTable", () => {
  let component: MenuTable;
  let fixture: ComponentFixture<MenuTable>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MenuTable]
    }).compileComponents();

    fixture = TestBed.createComponent(MenuTable);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it("should create", () => {
    expect(component).toBeTruthy();
  });
});
