# Generate SDK from OpenAPI

The SpaceTraders API is documented using the OpenAPI specification. We can use the Camunda community project to generate
the Camunda connector templates for the API.

Resources:

- SpaceTraders documentation: https://docs.spacetraders.io/api-guide/open-api-spec
- OpenAPI schema: https://github.com/SpaceTradersAPI/api-docs/blob/main/reference/SpaceTraders.json
- Bundled OpenAPI
  schema: https://stoplight.io/api/v1/projects/spacetraders/spacetraders/nodes/reference/SpaceTraders.json?fromExportButton=true&snapshotType=http_service&deref=optimizedBundle
- Interactive API (Stoplight): https://spacetraders.stoplight.io/docs/spacetraders

## Steps

### 1. a) Generate the templates (DIY)

1. Clone
   the community
   project [openapi-connector-template-generator](https://github.com/camunda-community-hub/openapi-connector-template-generator.git)
2. Generate the templates using the following command:

```shell
./generate.sh -i https://raw.githubusercontent.com/SpaceTradersAPI/api-docs/main/reference/SpaceTraders.json -o space-traders
```

3. Replace template icons
4. Replace template parameter for the request body
5. Replace template result expression

### 1. b) Use the pre-generated templates

Instead of generating the templates yourself, you can use the pre-generated templates in the
directory [sdk](sdk).

### 2. Publish the templates

1. Open the [Camunda Web Modeler](https://modeler.cloud.camunda.io/)
2. Create a new project
3. Upload the generated templates
4. Publish the template

## Troubleshooting

### The generated templates are empty

If the generation produces a lot of errors, or/and the templates are empty, you may face a
[known bug](https://github.com/camunda-community-hub/openapi-connector-template-generator/issues/4) on Linux systems. If
this is the case, you can apply the solution from
the [pull request](https://github.com/camunda-community-hub/openapi-connector-template-generator/pull/5) by switching to
the branch `linux-fixes` and run the command again.

### Template: Icon is not visible

If the template icon is not loaded correctly, upload the icon manually from [here](resources/space-traders-icon.png).

### Template: Syntax error on parameters/result expression

The expressions of the parameters and result expressions are not prefilled. Instead, the expressions reference
files that contains the structure of the request/response. Search the files in the folder `space-traders/includes/`.
These files may reference other data objects in the comments that can be found in the same folder. Use the content of
these files to build the parameter/result expression.


