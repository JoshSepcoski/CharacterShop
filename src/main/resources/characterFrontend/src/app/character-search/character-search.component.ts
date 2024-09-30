import { Component, inject } from '@angular/core';
import { CharacterComponent } from '../character/character.component';
import { CommonModule } from '@angular/common';
import { Character } from '../character';

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
   characterList: Character[] = [{ 
    id: 123,
    name: 'Test Name',
    charClass: "Test Class",
   },
   { 
    id: 124,
    name: 'Test Name2',
    charClass: "Test Class2",
   }
  ];
}
