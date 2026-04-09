import { Component, EventEmitter, Input, OnChanges, Output, signal, SimpleChanges } from '@angular/core';
import { FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-generic-form',
  imports: [ReactiveFormsModule],
  templateUrl: './generic-form.html',
  styleUrl: './generic-form.css',
})
export abstract class GenericForm<T> implements OnChanges{
  @Input()
  editItem : T | null = null;

  @Output() 
  editEmit = new EventEmitter<T>();
  @Output()
  addEmit = new EventEmitter<T>();
  
  abstract form : FormGroup;

  mode = signal<string>("add");


  addEvent(){
    if(this.mode() === "add") this.addEmit.emit(this.form.value);
    else this.editEmit.emit(this.form.value);
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
