# Validation-Pattern
Project to structure as necessary classes for business  validation rules

This project was developed due to the need to decouple the valitation logic about business rules of a specific domain. 
Everytime I needed to code logic validations, a chain of IF/ELSE was created into business classes, 
several times in a `validate()` method. But accordingly to the Single Responsability Principle, every class must have 
responsability of only a single logic.
