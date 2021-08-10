"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Brazilian = void 0;
const People_1 = require("./People");
class Brazilian extends People_1.People {
    constructor(firstName, lastName, age, cpf) {
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
exports.Brazilian = Brazilian;
