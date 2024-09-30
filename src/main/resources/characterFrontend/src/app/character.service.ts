import { Injectable } from '@angular/core';
import { Character } from './character';

@Injectable({
  providedIn: 'root'
})
export class CharacterService {


  url = 'http://localhost:4200';
  async getCharacters(): Promise<Character[]> {
    const data = await fetch(`${this.url}/characters/`);
    return await data.json() ?? [];
  }
  
  async getCharacterById(id: number): Promise<Character | undefined> {
    const data = await fetch(`${this.url}/characters/${id}`);
    return await data.json() ?? {};
  }
  submitApplication(firstName: string, lastName: string, email: string) {
    console.log(`Homes application received: firstName: ${firstName}, lastName: ${lastName}, email: ${email}.`);
  }
  constructor() { }
}
