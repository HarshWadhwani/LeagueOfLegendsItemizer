import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Champion } from './champion';
import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class ChampionService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient){}

  public getChampions(): Observable<Champion[]> {
    alert("chut")
    return this.http.get<Champion[]>(`${this.apiServerUrl}/champion/test`);
  }
}