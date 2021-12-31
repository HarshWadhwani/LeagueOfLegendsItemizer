import { Component, OnInit } from '@angular/core';
import { Champion } from './champion';
import { ChampionService } from './champion.service';
import { HttpErrorResponse } from '@angular/common/http';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit  {
  public champions: Champion[] = [];

  constructor(private championService: ChampionService){}

  ngOnInit() {
      alert("jojo");
      this.getChampions();
  }

  public getChampions(): void {
    alert("joji");
    this.championService.getChampions().subscribe(
      (response: Champion[]) => {
        this.champions = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }
}
