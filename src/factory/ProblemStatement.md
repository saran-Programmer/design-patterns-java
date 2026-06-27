# Monster Spawner System

You are building a CLI based game with different zones. When a player enters a zone, the game spawns a monster appropriate to that zone and the current time of day.

Each monster has four stats — HP, Damage, Speed, and Vision Range. HP and Damage are measured in health units. Speed and Vision Range are measured in tiles — that is, how many tiles the monster can cover in a single frame.

The game has 4 zones, and each zone spawns a different monster depending on whether it is Day or Night:

- **Forest** — Day: Bandits, Night: Angry Spirits
- **Ocean** — Day: Pirates, Night: Leviathan
- **Cave** — Day: Cavemen, Night: Banished Army Soldiers
- **Mountain** — Day: Wolves, Night: Frost Giants

Each monster has its own values for the four stats, and these values may vary at runtime.

The game must support the following:

1. **Spawn** — given a zone and the time of day (Day or Night), produce the correct monster fully built with its stats.

2. **Display** — show the spawned monster's name and all four of its stats.

New zones and new monsters will be constantly added to the game.