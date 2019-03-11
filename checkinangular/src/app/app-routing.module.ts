import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { StartcheckinComponent } from './components/startcheckin/startcheckin.component';
import { CheckinComponent } from './components/checkin/checkin.component';
import { ConfirmCheckInComponent } from './components/confirm-check-in/confirm-check-in.component';

const routes:Routes=[
  {
      path: '',
      redirectTo: '',
      pathMatch: 'full'
  },
  {
      path: 'startCheckIn',
      component: StartcheckinComponent
  },
  {
      path: 'checkIn/:id',
      component: CheckinComponent
  },
  {
      path: 'confirm',
      component: ConfirmCheckInComponent
  }
];

@NgModule({
  imports:[RouterModule.forRoot(routes)],
  exports:[RouterModule]
})
export class AppRoutingModule { }
