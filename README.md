[![Community Extension](https://img.shields.io/badge/Community%20Extension-An%20open%20source%20community%20maintained%20project-FF4700)](https://github.com/camunda-community-hub/community)
[![](https://img.shields.io/badge/Lifecycle-Incubating-blue)](https://github.com/Camunda-Community-Hub/community/blob/main/extension-lifecycle.md#incubating-)

# Camunda SpaceTraders 🚀

Do you want to bring your BPMN modeling skills to the next level? 
Do you like games, space simulations, or puzzles? 
Are you bored by standard "real-world" examples, like ordering or absence processes?
Then, you're in the right place. 👾

[SpaceTraders](https://spacetraders.io/) is a programmable fleet-management game played through a headless API. In the
game, you can purchase a ship, navigate to an asteroid field, mine ore, sell goods, and deliver goods to fulfill your
contract. And this is just the beginning! 🚀

This repository contains an SDK and instructions to play the game using the Camunda stack. 

> [!NOTE]  
> **SpaceTraders** is free. No registration is required. Currently in alpha state with bi-weekly server resets.
>
> **Camunda 8** is required. Register for [Saas](https://signup.camunda.com/) (free trial for 30 days) or download the [self-managed](https://docs.camunda.io/docs/self-managed/platform-deployment/overview/) version (free). 

## Get Started 🔧 

The best way to understand how to play SpaceTraders is to follow
the [Quickstart guide](https://docs.spacetraders.io/quickstart/new-game). It is a great interactive tutorial that
teaches the primary steps and concepts of the game.

While doing the tutorial, you may realize that it follows a kind of process. And, this process can be executed and
automated using the Camunda stack. 💡

You can choose between different ways depending on your interests, skills, and time:

- Use a manual [user-driver process](manual-process) based on Camunda forms and
  Tasklist. View your data and execute commands via forms. To fulfill the Quickstart guide or to discover your possibilities. (easy; fast; for beginners)
- Use the [SDK](sdk) based on Camunda connectors to build your process. Easy access to all SpaceTraders APIs and very flexible. To fulfill your goals in your own way. (advanced;
  requires process modeling; for devs and process designers)
- DIY (do-it-yourself). Check out the
  SpaceTraders [API documentation](https://spacetraders.stoplight.io/docs/spacetraders/11f2735b75b02-space-traders-api)
  and build a process yourself, for example, using the Camunda REST connector. (for devs and Camunda experts)

## SDK 🛠️

The SDK is the core part of this project. It allows you to interact with the SpaceTraders API and play the game in your process. 

The SDK is essentially a connector template that can be used in the Camunda Modeler after downloading it from the [Camunda Marketplace](https://marketplace.camunda.com/en-US/apps/420889/spacetraders-sdk). 
Since the SDK is based on the Camunda REST connector, it can be used out-of-the-box in SaaS or together with the [Connectors Bundle](https://docs.camunda.io/docs/self-managed/connectors-deployment/install-and-start/#connector-runtime-and-function) in Self-Managed.

The [usage](sdk) is simple. In the Camunda Modeler, add a new task to your process and change its type to the SpaceTraders connector. Select
an operation, for example, orbit a ship, and fill all required parameters in the property panel. In the background, the SDK
configures the underlying Camunda connector to call the SpaceTraders API. For more control, you can adjust the authentication, 
the retry policy, and the error handling. ✨

Read more about the usage of the SDK [here](sdk).

On top of the SDK, you can use [process blocks](process-blocks) via call activities in your process. These blocks are reusable processes 
that contain certain steps to fulfill a specific task, for example, to navigate a ship. Use these blocks to avoid redundant and repetitive tasks. 

## Resources 📖

References:

- [SpaceTraders documentation](https://docs.spacetraders.io/) to read about the game
- [SpaceTraders API (interactive)](https://spacetraders.stoplight.io/docs/spacetraders) to discover the available game APIs
- [Camunda FEEL documentation](https://docs.camunda.io/docs/components/modeler/feel/language-guide/feel-expressions-introduction/) to learn how to write expressions for BPMN processes

Tools:

- [SpaceTraders Playground](https://docs.spacetraders.io/playground) to visualize the game
- [FEEL Playground](https://camunda.github.io/feel-scala/docs/playground/) to draft expressions for BPMN processes

## The challenge 🏁

In the beginning, the primary goal of the game is to fulfill your contract. This requires to mine resources and deliver
specific goods, for example, 7100 units of aluminum ore.

To make this more fun and engaging, we created a challenge to track your progress and share it with others.

Click [HERE](https://bru-2.tasklist.camunda.io/1b68bd9a-f204-4e74-84bc-88d09035a14d/new/space-traders-challenge) to
start the challenge. (🚧 Not public yet! 🚧)

The challenge includes the following stages:

- Accept your first contract.
- Purchase your first ship.
- Arrive at an asteroid field.
- Mine your first ore.
- Deliver your first goods to the contract.
- Deliver 10/25/50/75 % of your contract goods.
- Fulfill your first contract.

Note that delivering 10% or more of your contract goods is not easy to reach. You may need to optimize your process and
consider advanced strategies.  

## Contribute 🌱

Contributions are very welcome. 🎉 
You can contribute in many different ways, have a look at the [Contribution Guide](CONTRIBUTING.MD) to see how.
