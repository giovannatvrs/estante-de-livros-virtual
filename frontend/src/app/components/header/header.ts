import { Component, EventEmitter, Output } from '@angular/core';
import { SearchBar } from '../search-bar/search-bar';
import { MatToolbar } from '@angular/material/toolbar';
@Component({
  selector: 'app-header',
  imports: [SearchBar, MatToolbar],
  templateUrl: './header.html',
  styleUrl: './header.scss',
})
export class Header {
  @Output() data = new EventEmitter<string>()

  searchResult(text: string){
    this.data.emit(text)
  }
}
