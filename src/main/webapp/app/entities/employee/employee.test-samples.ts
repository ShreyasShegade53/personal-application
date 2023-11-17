import { IEmployee, NewEmployee } from './employee.model';

export const sampleWithRequiredData: IEmployee = {
  id: 8797,
};

export const sampleWithPartialData: IEmployee = {
  id: 11606,
  firstName: 'Houston',
};

export const sampleWithFullData: IEmployee = {
  id: 2286,
  firstName: 'Jacquelyn',
  lastName: 'Kshlerin',
  email: 'Jaleel_Kuvalis@yahoo.com',
  phoneNumber: 'sensitize chemical',
};

export const sampleWithNewData: NewEmployee = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
