import { TestBed } from '@angular/core/testing';

import { MessageHandlerService } from './message-handler.service';

describe('MessageHandlerService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MessageHandlerService = TestBed.inject(MessageHandlerService);
    expect(service).toBeTruthy();
  });
});
