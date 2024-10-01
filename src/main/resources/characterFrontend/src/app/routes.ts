import { Routes } from '@angular/router';
import { CharacterDetailsComponent } from './character-details/character-details.component';
import { CharacterSearchComponent } from './character-search/character-search.component';

const routes: Routes = [
    {
      path: '',
      component: CharacterSearchComponent,
      title: 'Home page'
    },
    {
      path: 'details/:id',
      component: CharacterDetailsComponent,
      title: 'Character details'
    }
  ];
  
  export default routes;