import { Component, EventEmitter, Input, OnChanges, Output, signal, SimpleChanges } from '@angular/core';
import { FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-base-form',
  imports: [ReactiveFormsModule],
  templateUrl: './base-form.html',
  styleUrl: './base-form.css',
})
export abstract class BaseForm<T> implements OnChanges{
  @Input()
  editItem : T | null = null;

  @Output() 
  editEmit = new EventEmitter<T>();
  @Output()
  addEmit = new EventEmitter<T>();
  
  abstract form : FormGroup;
  itemFormValue : T | null = null;

  mode = signal<string>("add");

  formToItem(){
    this.itemFormValue = this.form.value;  
  }

  addEvent(){
    this.formToItem();
    
    if(this.itemFormValue == undefined) return;
    if(this.mode() === "add") this.addEmit.emit(this.itemFormValue);
    else this.editEmit.emit(this.itemFormValue);
  }

  ngOnChanges(changes: SimpleChanges): void {
    if(changes["editItem"] == undefined) return;
    if(changes["editItem"].currentValue != changes["editItem"].previousValue){
      if(this.editItem == undefined) {
        this.form.reset();
        this.mode.set("add");
      }
      else{
        this.form.setValue(this.editItem);
        this.mode.set("edit");
      }
    }
  }
}
