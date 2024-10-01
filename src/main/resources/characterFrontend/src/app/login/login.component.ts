import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [],
  template: `
    <section>
    <form>
      <input type="text" placeholder="Username">
      <button class="primary" type="button">Username</button>
      <input type="text" placeholder="Username">
      <button class="primary" type="button">Password</button>
    </form>
  </section>
  `,
  styleUrl: './login.component.css'
})
export class LoginComponent {

}
