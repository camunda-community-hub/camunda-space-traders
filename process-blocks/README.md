# SpaceTraders Process Blocks

This folder contains a few BPMN processes for SpaceTraders. They bundle certain steps into a process block to fulfill a
specific target, for example, to purchase a ship, or to navigate to a target waypoint.

You can use these blocks inside your process via call activities. 

The processes use the [SDK](../sdk) to automate the steps.

## Usage

1. Deploy the block processes
2. Use a block in your process via call activity
3. Define the required variables of the block via input variable mappings
4. Define the output variables of the block via output variable mappings

## Examples

- Automated [mining loop process](../examples/mining-loop) using the blocks 
