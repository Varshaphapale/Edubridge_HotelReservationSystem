import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateUserinfoComponent } from './create-userinfo.component';

describe('CreateUserinfoComponent', () => {
  let component: CreateUserinfoComponent;
  let fixture: ComponentFixture<CreateUserinfoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreateUserinfoComponent]
    });
    fixture = TestBed.createComponent(CreateUserinfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
