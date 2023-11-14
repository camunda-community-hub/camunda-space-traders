# SpaceTraders Quickstart Process

This folder contains a BPMN process for the SpaceTraders [Quickstart](https://docs.spacetraders.io/quickstart/new-game)
tutorial. It uses the [SDK](../../sdk) to automate the steps in the process.

## Usage

> Requires a Camunda cluster in version 8.3+.

### Via start form

1. Deploy the process
2. Create a new instance of the process via the start form:
   - Fill in your agent's name
   - Submit the form

![Screenshot from 2023-11-14 06-28-46](https://github.com/camunda-community-hub/camunda-space-traders/assets/4305769/c999570d-ec7d-4d7b-a97b-d1f4ac023981)

### Manually

1. Deploy the process
2. Create a new instance of the process with the following variables:

```json
{
  "agent_name": "The unique name of your agent (i.e. player name)."
}
```
