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

### Available process blocks

- [BPMN: Register new agent](spacetraders-new-game.bpmn)
- [BPMN: Accept a contract](spacetraders-accept-contract.bpmn)
- [BPMN: Purchase a new ship](spacetraders-purchase-ship.bpmn)
- [BPMN: Navigate a ship](spacetraders-navigate-ship.bpmn)
- [BPMN: Refuel a ship](spacetraders-refuel-ship.bpmn)
- [BPMN: Extract resources](spacetraders-extract-resources.bpmn)
- [BPMN: Sell goods on a marketplace](spacetraders-sell-goods.bpmn)
- [BPMN: Deliver contract goods](spacetraders-deliver-contract-goods.bpmn)
- [BPMN: Find all waypoints by type/trait](spacetraders-list-waypoints.bpmn) (including pagination)
- [Form: Start a new game](spacetraders-new-game.form)

## Examples

- Automated [mining loop process](../examples/mining-loop) using the blocks 
