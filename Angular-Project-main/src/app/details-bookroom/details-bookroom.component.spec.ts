import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailsBookroomComponent } from './details-bookroom.component';

describe('DetailsBookroomComponent', () => {
  let component: DetailsBookroomComponent;
  let fixture: ComponentFixture<DetailsBookroomComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DetailsBookroomComponent]
    });
    fixture = TestBed.createComponent(DetailsBookroomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
