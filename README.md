[![Community Extension](https://img.shields.io/badge/Community%20Extension-An%20open%20source%20community%20maintained%20project-FF4700)](https://github.com/camunda-community-hub/community)
[![](https://img.shields.io/badge/Lifecycle-Incubating-blue)](https://github.com/Camunda-Community-Hub/community/blob/main/extension-lifecycle.md#incubating-)

# Camunda SpaceTraders 🚀

Do you like games, space simulations, or puzzles? Are you looking for a "real-world" example of how to model processes
with Camunda but with more fun? Then, you're in the right place. 👾

[SpaceTraders](https://spacetraders.io/) is a programmable fleet-management game played through a headless API. In the
game, you can purchase a ship, navigate to an asteroid field, mine ore, sell goods, and deliver goods to fulfill your
contract. And this is just the beginning! 🚀

This repository contains an SDK and instructions to play the game using the Camunda stack.

## Get Started 🔧

The best way to understand how to play SpaceTraders is to follow
the [Quickstart guide](https://docs.spacetraders.io/quickstart/new-game). It is a great interactive tutorial that
teaches the primary steps and concepts of the game.

While doing the tutorial, you will realize that it follows a kind of process. And, this process can be executed and
automated using the Camunda stack.

You can choose between different ways depending on your interest, skills, and time:

- Use a manual user-driver process that guides you though the tutorial using Camunda forms and Tasklist. (easy; fast;
  for beginners)
- Use the [SDK](sdk), reusable process blocks in form of connector templates, to build your own process. (advanced;
  requires process modelling; for devs and process designers)
- DIY (do-it-yourself). Check out the
  SpaceTraders [API documentation](https://spacetraders.stoplight.io/docs/spacetraders/11f2735b75b02-space-traders-api)
  and build the process yourself, for example, using the Camunda REST connector. (for devs and Camunda experts)

## The challenge 🏁

The primary goal of the game (on the beginning) is to fulfill your contract. This requires to mine resources and deliver
specific goods, for example, 7100 units of aluminium ore.

To make this more fun and engaging, we created a challenge to track your progress and share it with others.

Click [HERE](https://hel-1.tasklist.ultrawombat.com/9172b64e-60ba-4f05-af77-c3f3a548d9e6/new/space-traders-challenge) to start the challenge. (🚧 Not public yet! 🚧)

The challenge includes the following stages:

- Accept your first contract.
- Purchase your first ship.
- Mine your first ore.
- Deliver your first goods to the contract.
- Fulfill your first contract. (This is not easy to reach and requires an advanced strategy.)
