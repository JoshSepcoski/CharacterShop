import { Component, inject } from '@angular/core';
import { CharacterComponent } from '../character/character.component';
import { CommonModule } from '@angular/common';
import { Character } from '../character';
import { CharacterService } from '../character.service';

@Component({
  selector: 'app-character-search',
  standalone: true,
  imports: [
    CommonModule,
    CharacterComponent
  ],
  template: `
  <section>
    <form>
      <input type="text" placeholder="Search By Name">
      <button class="primary" type="button">Search</button>
    </form>
  </section>
  <section class="results">
   <app-character *ngFor="let character of characterList"[character]="character"></app-character>
  </section>
  `,
  styleUrl: './character-search.component.css'
})
export class CharacterSearchComponent {


  characterList: Character[] = [];
  characterService: CharacterService = inject(CharacterService);
  filteredCharacterList: Character[] = [];

  constructor() {
    this.characterService.getCharacters().then((characterList: Character[]) => {
      this.characterList = characterList;
      this.filteredCharacterList = characterList;
    });

}
}
