import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConfirmCheckInComponent } from './confirm-check-in.component';

describe('ConfirmCheckInComponent', () => {
  let component: ConfirmCheckInComponent;
  let fixture: ComponentFixture<ConfirmCheckInComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConfirmCheckInComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConfirmCheckInComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
