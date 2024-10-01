import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { CharacterSearchComponent } from './character-search/character-search.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterLink, RouterOutlet, CharacterSearchComponent],
  template: `
  <main>
  <a [routerLink]="['/']">
      <header class="brand-name">
      <h2>Character Inspo</h2>
      </header>
    </a>
    <section class="content">
    <router-outlet></router-outlet>
    </section>
  </main>
`,
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Character Inspo';
}
