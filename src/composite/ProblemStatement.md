# Military Squad Management System

You are building a CLI-based Military Squad Management System. The military has individual soldiers and squads. A squad can contain soldiers and other squads, allowing the military to be organized as a hierarchy.

The available soldier types are Infantry Soldier, Sniper, Medic, and Engineer. Every soldier must be able to attack, move, and display its details.

The General commands the military at the highest level. A command issued to a formation must be carried out by every soldier in that formation. For example, Main Battalion contains Task Force North and Charlie Squad; Task Force North contains Alpha Squad and Bravo Squad.

The system must support:

1. Attack
2. Move
3. Display Details

New soldier types and larger formations will be added over time.

## Without the Composite Pattern

The first implementation hardcodes every squad relationship. Each squad knows its exact child types and manually forwards every command. The General must know the type of formation being commanded. This demonstrates tight coupling, duplicated code, a fixed hierarchy, and why adding formations violates the Open/Closed Principle.

## With the Composite Pattern

The second implementation uses a shared `MilitaryComponent` abstraction. Both soldiers and squads implement it. A `Squad` stores `MilitaryComponent` children, so it can contain either soldiers or other squads. The General depends only on `MilitaryComponent` and can command one soldier, a squad, or a battalion in exactly the same way.
