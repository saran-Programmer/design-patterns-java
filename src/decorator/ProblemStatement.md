# Game Character Power-Up System

You are building a CLI based battle game.

The game has 3 base character types. Each character has a name, a description, and two stats — HP (health points) and Damage (attacking ability):

1. **Swordsman** — 100 HP, 50 Damage
2. **Archer** — 80 HP, 60 Damage
3. **Spearman** — 120 HP, 40 Damage

Each character can be enhanced with power-ups. A power-up wraps a character and modifies its description and one of its stats. Power-ups can be stacked in any combination and any order.

There are 10 power-ups in total.

**7 of them increase Damage:**

1. **Fire Weapon** — increases Damage by 30
2. **Poison Tip** — increases Damage by 20
3. **Lightning Strike** — increases Damage by 40
4. **Sharp Blade** — increases Damage by 15
5. **Critical Hit** — increases Damage by 35
6. **Berserk Mode** — increases Damage by 50
7. **Double Strike** — doubles the current Damage

**3 of them increase HP:**

1. **Shield** — increases HP by 40
2. **Armor Plating** — increases HP by 70
3. **Elixir** — increases HP by 50

Each power-up also adds its name to the character's description.

The game must support the following:

1. **Display** — shows the character's full description (base type plus all applied power-ups) along with its final HP and Damage.

2. **Fight** — takes two characters and simulates a battle. The number of hits needed to defeat a character is their HP divided by the opponent's Damage, rounded up. Whoever defeats the other in fewer hits wins. If both defeat each other in the same number of hits, both died.

New characters and power-ups will be constantly added to the application.