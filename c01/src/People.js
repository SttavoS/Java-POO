"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.People = void 0;
class People {
    constructor(firstName, lastName, age) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (age < 0) {
            throw new Error("A idade não pode ser menor que zero");
        }
        this.age = age;
    }
}
exports.People = People;
