[![build](https://github.com/Mrbysco/ClassicFood/actions/workflows/build.yml/badge.svg)](https://github.com/Mrbysco/ClassicFood/actions/workflows/build.yml) 
[![](http://cf.way2muchnoise.eu/versions/822475.svg)](https://www.curseforge.com/minecraft/mc-mods/classic-food)

# Worldline Beta #

This Minecraft mod overhauls modern versions to play and feel more like early alpha/beta versions. A lot of what this mod does is cut down the fat, and turn the game back into more of a pure survival sandbox experience. Less driven by extrinsic motivation (kill dragon, get elytra, get wealth) and more driven by intrinsic motivation (i want to build x/y/z, i want to try this). 

Part of that is also cutting down on gear progression. In vanilla you can spend dozens of hours getting a fully enchanted netherite armor set, and then lose it all by falling in the end void. The most you'll ever lose here is a full set of unenchanted diamond armor, something you can recoup in about an hour.

(I have no experience modding Minecraft so bear with me while I learn the ropes.)

# Changes #
An exhaustive list of changes this mod has. Most of these can be configured, although I'm designing around the default configurations.

**General:**
 - [x] Beds can no longer skip the night (gamerule)
 - [ ] Remove advancements made impossible by this mod
 - [ ] Add back some old fun achievements (i.e. on a rail)
 - [ ] 
**Food & hunger:**
  - [x] Removed the hunger mechanic entirely, making food heal directly again.
  - [x] Lower food stack size to 16 (with a few exceptions)
  - [ ] Replace hunger effect with weakness + mining fatigue

**Enchanting, brewing and beacons:**
 - [ ] Enchantments removed from the game
 - [ ] Make luck effect also function like Looting and Fortune
 - [ ] Nether wart/awkward potion is no longer needed to brew potions
 - [ ] Nether wart replaces glowstone for upgrading potions
 - Beacons are reworked
   - [ ] Potions can be placed inside. It's effect is given to any player in range
   - Beacon tiers
     - [ ] Tier 1 has one potion slot
     - [ ] Tier 2 gains ability to filter target (player, passive mobs, both)
     - [ ] Tier 3 gains a second potion slot
     - [ ] Tier 4 gains more filters (hostile mobs, all mobs, all mobs + players)
   - [ ] Range and duration scale like normal
   - [ ] No longer consumes any materials
   - [ ] Instant health and damage are incompatible
 - Add potions for unbrewable vanilla effects
   - [ ] Emerald for luck
   - [ ] Bad Luck as corrupted form of luck (fermented spider eye)
   - [ ] Glow ink sac for glowing
   - [ ] Chorus fruit for slow falling (because phantoms are removed)
   - [ ] Chorus flower for levitation
   - [ ] Sculk for blindness
   - [ ] Cocoa beans for haste
   - [ ] Rotten flesh for nausea
   - [ ] Wither rose for withering
 - Add some removed enchantments back in as potion effects
   - [ ] Prismarine shard for thorns
   - [ ] Blue ice for frost walker
   - [ ] Cobweb for silk touch (merged with Weaving potion)
   - [ ] Resin clump for unbreaking
   - [ ] Tropical fish for depth strider
   - [ ] Feather for feather falling
   - [ ] Magma block for flame/fire aspect
   - [ ] Warped/Crimson fungus for soul speed & swift sneak
   - [ ] Open eyeblossom for lure
   - [ ] Heart of the sea for luck of the sea

**Worldgen:**
 - [ ] Removed most structures (villages, fortresses, bastions etc)
 - Overworld
   - [ ] Make terrain more fantastical, like old beta generation
   - [ ] Reduced biome size
   - [ ] Make unique biomes more frequent
   - [ ] Strongholds still generate, but with libraries replaced with potion rooms
   - [ ] Nautilus armor can be found in strongholds and monster rooms
   - [ ] Monster rooms are slightly more common
   - [ ] Diorite/andesite/granite generate as stone instead
   - [ ] Wet sponge can generate in warm oceans, in coral patches
 - The Nether
   - [ ] Ancient debris is slightly more common
 - The End
   - [ ] Only small end islands generate outside the central island area
   - [ ] Central end island is much larger, and is surrounded by end barrens (with chorus fruit)

 **Archaeology:**
- [ ] Added End Sand and Suspicious End Sand
- [ ] Loot tables depend on biome, containing collectibles inaccessible because of most structures being removed. (discs, armor trims, etc)
- [ ] No more junk items, just get nothing instead
- [ ] Sniffer eggs can be dug up anywhere in the overworld
- [ ] Nether wart obtainable in the nether
- [ ] Blobs of suspicious sand/gravel/end sand generate in the overworld, nether and end respectively

**Mobs:**
 - [x] Phantoms no longer spawn (gamerule)
 - [x] Wandering traders no longer spawn (gamerule)
 - [x] Pillagers patrols no longer spawn (gamerule)
 - [ ] Zombie villagers no longer spawn
 - [x] Small sulfur cubes drop slimeballs
 - [ ] Blazes spawn near the lava sea in the nether
 - [ ] Wither skeletons spawn in the soul sand valley
 - [ ] Wither skeleton skulls are slightly more common
 - [x] Withers drop 5-7 netherite scrap instead of a nether star, and one of two nether armor trims
 - [x] Blazes always drop one rod
 - [x] Ghasts always drop one tear
 - [ ] Sniffers dig up all seed types and vegetables, nether wart in the nether, and chorus fruit in the end
 - [ ] Removed the extra breeding requirements of pandas
 - [ ] Brown pandas no longer spawn naturally
 - [ ] Pandas and polar bears scare off undead
 - [ ] Polar bears drop wool
 - [ ] Guardians spawn in unlit water below Y=30 (same as glow squids)
 - [x] Nautiluses drop their shells more often
 - [ ] Wardens have much less health (200hp, same as ender dragon)
 - [x] Wardens drop several echo shards, and one of the two deep dark armor trims

**Blocks:**
 - [ ] Leafy decoration blocks are only gatherable with shears/silk touch
 - [ ] Grass only drops seeds when destroyed with a hoe
 - [ ] Leaves don't drop sticks
 - [ ] Amethyst blocks shatter into shards without silk touch
 - [ ] Torchflowers and pitcher pods now glow

**Items & crafting:**
 - [ ] Beacons are crafted with netherite instead of a nether star
 - [ ] Diamond equipment is no longer upgradable to netherite
 - [ ] Turtle helmet has innate aqua affinity
 - [ ] Rails craftable with copper
 - [ ] Scaffolding craftable with sticks
 - [ ] Bamboo to stick conversion is more generous
 - [ ] Tridents can be repaired with prismarine shards
 - [ ] Music disc '5' craftable with 8 echo shards and disc '11'
 - [ ] Bells are craftable with a block of gold, 3 sticks and 4 smooth stone


## License ##
* Worldline Beta is licensed under the MIT License
  - (c) 2026 Roboolet
  - [![License](https://img.shields.io/badge/License-MIT-red.svg?style=flat)](http://opensource.org/licenses/MIT)
* This mod is a fork of Mrbysco's Classic Food mod (MIT (c) 2024 Mrbysco)

