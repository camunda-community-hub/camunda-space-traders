# Generate SDK from OpenAPI

The SpaceTraders API is documented using the OpenAPI specification. We use
the [Camunda community project](https://github.com/camunda-community-hub/openapi-connector-template-generator.git) to
generate the Camunda connector templates for the API.

Resources:

- [SpaceTraders documentation](https://docs.spacetraders.io/api-guide/open-api-spec)
- [SpaceTraders OpenAPI schema](https://github.com/SpaceTradersAPI/api-docs/blob/main/reference/SpaceTraders.json)
- [SpaceTraders API (interactive)](https://spacetraders.stoplight.io/docs/spacetraders)

## Steps

### Generate the templates

1. Clone the community
   project [openapi-connector-template-generator](https://github.com/camunda-community-hub/openapi-connector-template-generator.git)
2. Generate the templates using the following command:

```shell
./generate.sh -i https://raw.githubusercontent.com/SpaceTradersAPI/api-docs/main/reference/SpaceTraders.json -o space-traders
```

You can find the pre-generated templates in the
directory [generated-templates](generated-templates/element-templates).

### Clean-up the templates

In general, the generated templates work, but we can apply the following steps to ease the usage.

1. Replace the template icon.

- The template icon might not be available/correct. Use the icon [here](resources/space-traders-icon.png) via upload.

2. Replace the parameter for the request body

- The expression of the request body parameter is not prefilled. Instead, it references a file that contains the
  structure of the request.
- Search the file in the folder [space-traders/includes/](generated-templates/includes) and build the expression based
  on the content.

3. Replace the result expression

- The result expression for the response body parameter is not prefilled. Instead, it references a file that contains
  the structure of the response.
- Search the file in the folder [space-traders/includes/](generated-templates/includes) and build the expression based
  on the content.

4. Remove the result variable

- The template defines a result variable of each operation. This variable can be handy for debugging purpose, but it
  creates an additional variable.
- Remove the result variable section of the template.

5. Remove an empty request body

- The template defines a request body for all POST and PATCH operations. But some of these operations don't have a
  parameter for the request body. As a result, it creates an empty expression (i.e. invalid).
- Remove the request body if it has an empty expression.

## Troubleshooting

### The generated templates are empty

If the generation produces a lot of errors, or/and the templates are empty, you may face a
[known bug](https://github.com/camunda-community-hub/openapi-connector-template-generator/issues/4) on Linux systems. If
this is the case, you can apply the solution from
the [pull request](https://github.com/camunda-community-hub/openapi-connector-template-generator/pull/5) by switching to
the branch `linux-fixes` and run the command again.
