# SpaceTraders SDK for Camunda

The SDK allows to interact with the SpaceTraders API from a Camunda process. It is based on Camunda's connectors,
especially the REST connector. The SDK eases the usage by providing connector templates.

The connector templates are generated from the SpaceTraders OpenAPI. See the [openapi](/openapi) module for details.

Resources:

- SpaceTraders documentation: https://docs.spacetraders.io/
- SpaceTraders game concepts: https://docs.spacetraders.io/game-concepts/agents-and-factions
- Interactive API (Stoplight): https://spacetraders.stoplight.io/docs/spacetraders

## Install

### Publish the templates

1. Open the [Camunda Web Modeler](https://modeler.cloud.camunda.io/)
2. Create a new project
3. Upload the generated templates
4. Publish the templates

## Usage

There is one connector per [SpaceTraders API](https://spacetraders.stoplight.io/docs/spacetraders/11f2735b75b02-space-traders-api):

- Default: register a new agent, get server status
- Agents: get details about an agent
- Contracts: get details about a contract, interact with a contract (e.g. accept, deliver, fulfill)
- Systems: get details about a star system (e.g. waypoints, shipyard, market)
- Fleet: get details about a ship, interact with a ship (e.g. dock, orbit, navigate, extract resources, sell cargo)
- Factions: get details about a faction

### Add a connector to your process

1. Add a new task to your process
2. Select one of the SpaceTraders connectors as the task type (e.g. `SpaceTraders-API-Fleet`)
3. Select the operation for the connector (e.g. `getMyShip - Get Ship`)
4. Fill the required parameters (e.g. `shipSymbol`)
5. Optionally, adjust the result expression to customize the resulting process variables

### Authentication

Most of the API calls require a token. The token is generated on creating a new agent. 

By default, the connectors read the token from the process variable with the name `token`.  

If you use a different variable for the token, or store the token as a connector secret, you need to adjust the 
authentication property of the connector.

