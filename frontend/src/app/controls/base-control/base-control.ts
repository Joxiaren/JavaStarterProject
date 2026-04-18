import { signal } from '@angular/core';
import { BaseModel } from '../../../model/base-model';
import { BaseService } from '../../services/base-service';

export abstract class BaseControl<IdType, Type extends BaseModel<IdType>> {

  abstract service: BaseService<IdType, Type>;

  items = signal<Type[]>([]);

  itemEdit = signal<Type | null>(null);

  getAllItems() {
    this.service?.getAll().subscribe(data => {
      this.items.set(data);
    })
  }
  addItem(item: Type) {
    this.service?.create(item).subscribe(() => {
      this.getAllItems();
    });
  }
  setEditItem(index: number) {
    this.itemEdit.set(this.items()[index]);
  }
  editItem(item: Type) {
    this.service?.update(item.id, item).subscribe(() => {
      this.getAllItems();
    });
    this.itemEdit.set(null);
  }
  deleteItem(index: number) {
    let id = this.items()[index]["id"];
    this.service?.delete(id).subscribe(() => {
      this.getAllItems();
    });
    this.itemEdit.set(null);
  }
}
