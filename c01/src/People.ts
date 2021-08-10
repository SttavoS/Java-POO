export abstract class People {
  protected firstName: string;
  protected lastName: string;
  protected age: number;

  constructor(firstName: string, lastName: string, age: number) {
    this.firstName = firstName;
    this.lastName = lastName;

    if (age < 0) {
      throw new Error("A idade não pode ser menor que zero");
    }
    this.age = age;
  }

  abstract fullName();
}
