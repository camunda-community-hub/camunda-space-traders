# SpaceTraders Quickstart Process

This folder contains a BPMN process for the SpaceTraders [Quickstart](https://docs.spacetraders.io/quickstart/new-game)
tutorial. It uses the [SDK](../../sdk) to automate the steps in the process.

## Usage

> Requires a Camunda cluster in version 8.3+.

1. Deploy the process
2. Create a new instance of the process
   3. Via start form: fill your agent name and submit the form
   4. Manually by providing the following variables:

```json
{
  "agent_name": "The unique name of your agent (i.e. player name)."
}
```
