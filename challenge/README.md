# Camunda SpaceTraders Challenge Process

This folder contains a BPMN process for the Camunda SpaceTraders challenge. It uses the [SDK](../sdk) to track the
progress of the player and share it.

The process has a start form to create a new instance. The start form takes the SpaceTraders token to get the player
status.

The process post the player status as messages in the [Camunda forum](https://forum.camunda.io/).

## Usage

1. Set the following connector secrets:

```
FORUM_API_KEY // the API-Key to post the message in the Camunda forum
```

2. Deploy the process
3. Copy the publication link of the process start form
