import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-search-bar',
  imports: [],
  templateUrl: './search-bar.html',
  styleUrl: './search-bar.scss',
})
export class SearchBar {
  @Output() textEvent = new EventEmitter<string>();

  onSubmit(event: any){
    event.preventDefault();


    const input = (event.target as HTMLFormElement)
    .querySelector('input') as HTMLInputElement;

    const value = input.value;
    this.textEvent.emit(value);
  }
}
