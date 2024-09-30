import { Component, Input, input, inject } from '@angular/core';
import { Character } from '../character';
import { CharacterService } from '../character.service';

@Component({
  selector: 'app-character',
  standalone: true,
  imports: [],
  template: `
    <h1> {{character.name}}</h1>
    <p>{{character.charClass}}</p>
  `,
  styleUrl: './character.component.css'
})
export class CharacterComponent {
  @Input() character!: Character;
  CharacterService: CharacterService = inject(CharacterService);
}
