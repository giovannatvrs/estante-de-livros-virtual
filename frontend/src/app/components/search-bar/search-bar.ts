import { Component, inject } from '@angular/core';
import { OverlayModule } from '@angular/cdk/overlay';
import { SearchBarService } from '../../services/search-bar-service';

@Component({
  selector: 'app-search-bar',
  imports: [OverlayModule],
  templateUrl: './search-bar.html',
  styleUrl: './search-bar.scss',
})
export class SearchBar {
  searchBarService = inject(SearchBarService)
  overlayOpen = this.searchBarService.overlayOpen;

}
