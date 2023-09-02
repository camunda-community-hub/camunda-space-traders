# SpaceTraders Mining Loop Process

This folder contains a BPMN process for SpaceTraders that mining resources in a loop until the contract is fulfilled. 

The process uses the [SDK](../../sdk) to automate the mining.

## Usage

1. Deploy the process
2. Create a new instance of the process with the following variables:

```json
{
  "agent_name": "The unique name of your agent (i.e. player name)."
}
```
