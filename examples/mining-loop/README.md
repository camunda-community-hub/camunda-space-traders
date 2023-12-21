# SpaceTraders Mining Loop Process

This folder contains a BPMN process for SpaceTraders that mines resources in a loop until the contract is fulfilled. 

The process uses the [SDK](../../sdk) and [process blocks](../../process-blocks) to automate the mining.

![The diagram of the mining process.](../../assets/spacetraders-mining-loop.svg)

## Usage

1. Deploy all [process blocks](../../process-blocks)
2. Deploy the mining process
3. Create a new instance of the process with the following variables:

```json
{
  "agent_name": "The unique name of your agent (i.e. player name)."
}
```
