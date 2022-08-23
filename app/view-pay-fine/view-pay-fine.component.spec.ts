import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewPayFineComponent } from './view-pay-fine.component';

describe('ViewPayFineComponent', () => {
  let component: ViewPayFineComponent;
  let fixture: ComponentFixture<ViewPayFineComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewPayFineComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewPayFineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
