import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CharacterSearchComponent } from './character-search/character-search.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CharacterSearchComponent],
  template: `
  <main>
    <header class="brand-name">
      <h2>Character Inspo</h2>
    </header>
    <section class="content">
      <app-character-search></app-character-search>
    </section>
  </main>
`,
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Character Inspo';
}
