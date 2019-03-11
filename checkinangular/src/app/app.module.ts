import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StartcheckinComponent } from './components/startcheckin/startcheckin.component';
import { CheckinComponent } from './components/checkin/checkin.component';
import { ConfirmCheckInComponent } from './components/confirm-check-in/confirm-check-in.component';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { DataService } from './services/data.service';

@NgModule({
  declarations: [
    AppComponent,
    StartcheckinComponent,
    CheckinComponent,
    ConfirmCheckInComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
