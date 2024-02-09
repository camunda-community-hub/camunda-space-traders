# SpaceTraders Manual Process

This folder contains a manual user-driven BPMN process for the SpaceTraders . It uses Camunda user forms for the 
interaction with the user. The steps are automated using the [SDK](../sdk).

The "Control center" form is the central place of the process. It has two purposes:
- Shows an aggregated view of your data, for example, your credits, your ships, and your contract
- Allows you to select your next action, for example, to navigate a ship   

## Usage

> Requires a Camunda cluster in version 8.3+.

1. Deploy all processes
2. Open Camunda Tasklist
3. Go to "Processes"
4. Select "SpaceTraders - Manual Process"
5. Fill in the form to create a new game or continue an existing game
6. Wait until the user form "Control center" is shown
7. Assign the user form to yourself
8. View the data in the form and select your next action 

> [!NOTE]  
> To continue your game later, you should copy your **Game token** from the Control center. 🔑
>
> Before you can interact with a user form, you must **assign it** to yourself. ✋
>
> After submitting a user form, it may take a few seconds until the next form shows up. So, be **patient**. 🐌  

https://github.com/camunda-community-hub/camunda-space-traders/assets/4305769/dab9d5a1-dc9a-4848-bbcd-34585457fdb7


