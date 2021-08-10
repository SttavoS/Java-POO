import { People } from "./People";

export class Brazilian extends People {
  protected firstName: string;
  protected lastName: string;
  protected age: number;
  protected _cpf: string;

  constructor(firstName: string, lastName: string, age: number, cpf: string) {
    super(firstName, lastName, age);
    this._cpf = this.cpf(cpf);
  }

  fullName() {
    return `${this.firstName} ${this.lastName}`;
  }

  set cpf(cpf) {
    this._cpf = cpf;
  }
}
