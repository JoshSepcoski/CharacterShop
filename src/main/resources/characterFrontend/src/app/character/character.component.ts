import { Component, Input, input, inject } from '@angular/core';
import { Character } from '../character';
import { CharacterService } from '../character.service';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-character',
  standalone: true,
  imports: [CommonModule,RouterModule],
  template: `
    <h1> {{character.name}}</h1>
    <p>{{character.charClass}}</p>
    <a [routerLink]="['/details', character.id]">Learn More</a>
  `,
  styleUrl: './character.component.css'
})
export class CharacterComponent {
  @Input() character!: Character;
  CharacterService: CharacterService = inject(CharacterService);
}
