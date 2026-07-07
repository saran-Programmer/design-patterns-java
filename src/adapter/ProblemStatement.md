# Wildlife Sanctuary Management System

You are building a CLI-based management system for a wildlife sanctuary.

The sanctuary currently manages only **land animals**. A well-established `Animal` interface already exists, and all land animals implement this interface.

The `Animal` interface supports the following operations:

* **makeSound()** — Produces the animal's characteristic sound.
* **eat()** — Represents the animal consuming food.
* **move()** — Represents the animal moving around the sanctuary.

The sanctuary currently has the following land animals:

* **Lion**
* **Elephant**
* **Zebra**
* **Giraffe**

The sanctuary management system is built around the `Animal` interface and all existing features rely on it.

As the sanctuary expands, it introduces a new **Aviary** to house different species of birds.

Unlike the existing land animals, all birds implement a separate `Bird` interface with the following operations:

* **chirp()** — Produces the bird's characteristic sound.
* **peck()** — Represents the bird eating food.
* **fly()** — Represents the bird's movement.

The sanctuary currently has the following birds:

* **Eagle**
* **Parrot**
* **Owl**
* **Sparrow**

The sanctuary management system must now support both land animals and birds while continuing to use the existing `Animal` interface without modifying the existing management code.

The system must support the following:

1. **Produce Sound** — Invoke the appropriate sound operation for every living being.
2. **Feed** — Invoke the appropriate eating operation for every living being.
3. **Move** — Invoke the appropriate movement operation for every living being.

Additional species of land animals and birds will be introduced as the sanctuary continues to grow.
