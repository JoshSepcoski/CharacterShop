import { Component, inject } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CharacterService } from '../character.service';
import { Character } from '../character';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-character-details',
  standalone: true,
  imports: [CommonModule],
  template: `
   <section class="listing-features">
      <h2 class="section-heading">About this Character</h2>
      <ul>
        <li>ID: {{character?.id}}</li>
        <li>Name: {{character?.name}}</li>
        <li>Class: {{character?.charClass}}</li>
      </ul>
    </section>
  `,
  styleUrl: './character-details.component.css'
})
export class CharacterDetailsComponent {
  route: ActivatedRoute = inject(ActivatedRoute);
  characterService = inject(CharacterService)
  character: Character | undefined;
  constructor() {
    const housingLocationId = parseInt(this.route.snapshot.params['id'], 10);
    this.characterService.getCharacterById(housingLocationId).then(character => {
      this.character = character;
    });
  }

}
