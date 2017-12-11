
## Cows are Barn Animals

1. Create a BarnAnimal interface that has the `void makeNoise()` ability.

2. The `Cow` class implements the `BarnAnimal` interface. The `Cow` works 
like a bank (not a real cow). When the cow is constructed, the current
amount of milk is specified. 

     - `int giveMilk()` gives a random amount from 1 to 5 gallons, but not
more than the cow actually has. 
     - `void makeNoise()` prints "moo" in the console.

3. The `JerseyCow` is a kind of `Cow` that gives milk twice in a single milking session 
(so combine the results in to one `giveMilk()` call.

4. The `BabyCow` is a kind of cow that does not have any milk, always gives 0 when asked.

## Water Polo

1. The `PoloPlayer` interface specifies the ability to `void swim()` and `void shoot()`. 

2. The `WYPolo` implements the `PoloPlayer` interface. This class tracks how many shots 
are taken, and the player's roster number.

    - Constructor takes in a roster number and remembers it, sets the shots taken to zero.
    - The `swim` method prints "Whoosh."
    - The `shoot` method tracks how many shots are taken.
