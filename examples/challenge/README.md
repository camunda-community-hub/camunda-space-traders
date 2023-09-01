# Camunda SpaceTraders Challenge Process

This folder contains a BPMN process for the Camunda SpaceTraders challenge. It uses the [SDK](../../sdk) to track the
progress of the player and share it.

The process has a start form to create a new instance. The start form takes the SpaceTraders token to get the player
status.

🚧 Currently, the process post the player status as Slack messages. In the final state, the messages should be published
in the Camunda forum.

## Usage

1. Set the following connector secrets:

```
SLACK_TOKEN // the Slack token to publish the messages with
SLACK_CHANNEL // the Slack channel to publish the messages to
```

2. Deploy the process
3. Copy the publication link of the process start form
