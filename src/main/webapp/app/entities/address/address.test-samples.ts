import { IAddress, NewAddress } from './address.model';

export const sampleWithRequiredData: IAddress = {
  id: 13314,
};

export const sampleWithPartialData: IAddress = {
  id: 24101,
  country: 'Finland',
  state: 'between',
  pincode: 2482,
};

export const sampleWithFullData: IAddress = {
  id: 14440,
  line1: 'blond',
  line2: 'duh denude consequently',
  country: 'Saint Lucia',
  state: 'the whose',
  city: 'Port Luciusland',
  pincode: 4653,
};

export const sampleWithNewData: NewAddress = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
