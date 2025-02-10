# sweet-pretzel-kata

Inspired by the Cupcake kata, in reference to “The Office“'s Sweet Pretzel day !
This repository contains an example of resolution in Java.

## About this kata

This kata was originally made to implement the decorator and composite pattern, and is a variant of https://codingdojo.org/kata/cupcake/
This is an alternative version of the Cupcake kata, in reference to The Office “Sweet Pretzels Day“.

## Problem Description

Write a program that can build many sweet pretzels with many toppings like : “Sweet pretzel with sweet glaze and cinnamon sugar”. Be carful the order of topping is very important.
Write a function or method that can show the name of sweet pretzel.
Write a function that can show the price of sweet pretzel. The price is composed of base sweet pretzel price and topping price.

Bundle of non fresh sweet pretzels
Now it's possible to make a bundle of sweet pretzels. The price of a bundle is 10% less than prices of each sweet pretzel.

It’s possible to build a bundle of bundle with singles sweet pretzels.

## Suggested Test Cases
Decorator pattern
`var mySweetPretzel = Oreos(CaramelDip(Chocolate(SweetPretzel())))`

About price function or method

- The price function should return 2.50$ for “Sweet pretzel”
- The price function should return 3.20$ for “Sweet pretzel with chocolate”
- The price function should return 3.30$ for “Sweet pretzel with oreos”
- The price function should return 4$ for “Sweet pretzel with chocolate and oreos”

## Topings list :

- sweet glaze: 0.50$
- cinnamon sugar: 0.30$
- chocolate: 0.70$
- white chocolate: 0.70$
- fudge: 0.80$
- M&Ms: 0.90$
- caramel dip: 0.60$
- chocolate dip: 0.60$
- mint chip: 0.80$
- marshmallows: 0.40$
- nuts: 0.70$
- toffee nuts: 0.80$
- coconuts: 0.50$
- peanut butter drizzle: 0.70$
- Oreos: 0.80$
- sprinkles: 0.30$
- cotton candy bits: 0.70$
- powdered sugar: 0.20$

(TODO trouver un autre type de Pretzel pour complexifier le kata (cf. Cupcake kata, avec les cookies))
