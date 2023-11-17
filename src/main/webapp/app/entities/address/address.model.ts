import { IEmployee } from 'app/entities/employee/employee.model';

export interface IAddress {
  id: number;
  line1?: string | null;
  line2?: string | null;
  country?: string | null;
  state?: string | null;
  city?: string | null;
  pincode?: number | null;
  employee?: Pick<IEmployee, 'id'> | null;
}

export type NewAddress = Omit<IAddress, 'id'> & { id: null };
