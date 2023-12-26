import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListBookroomComponent } from './list-bookroom.component';

describe('ListBookroomComponent', () => {
  let component: ListBookroomComponent;
  let fixture: ComponentFixture<ListBookroomComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListBookroomComponent]
    });
    fixture = TestBed.createComponent(ListBookroomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
