import { Directive, EventEmitter, Input, OnChanges, Output, signal, SimpleChanges } from "@angular/core";
import { FormGroup } from "@angular/forms";
import { BaseModel } from "model/base-model";

@Directive()
export abstract class BaseForm<IdType, Type extends BaseModel<IdType>> implements OnChanges {
  @Input()
  editItem: Type | null = null;

  @Output()
  editEmit = new EventEmitter<Type>();
  @Output()
  addEmit = new EventEmitter<Type>();

  abstract form: FormGroup;
  itemFormValue: Type | null = null;

  mode = signal<string>("add");

  formToItem() {
    this.itemFormValue = this.form.value;
  }

  addEvent() {
    this.formToItem();

    if (this.itemFormValue == undefined) return;
    if (this.mode() === "add") this.addEmit.emit(this.itemFormValue);
    else this.editEmit.emit(this.itemFormValue);
  }

  ngOnChanges(changes: SimpleChanges): void {
    if (changes["editItem"] == undefined) return;
    if (changes["editItem"].currentValue != changes["editItem"].previousValue) {
      if (this.editItem == undefined) {
        this.form.reset();
        this.mode.set("add");
      } else {
        this.form.setValue(this.editItem);
        this.mode.set("edit");
      }
    }
  }
}
