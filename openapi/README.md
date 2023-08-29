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

1. Clone
   the community
   project [openapi-connector-template-generator](https://github.com/camunda-community-hub/openapi-connector-template-generator.git)
2. Generate the templates using the following command:

```shell
./generate.sh -i https://raw.githubusercontent.com/SpaceTradersAPI/api-docs/main/reference/SpaceTraders.json -o space-traders
```

3. Open the [Camunda Web Modeler](https://modeler.cloud.camunda.io/)
4. Create a new project
5. Upload the generated templates in the directory `space-traders/element-templates/`

## Troubleshooting

### Templates are empty on Linux

If the generation produces a lot of errors, or/and the templates are empty, you may face a
[known bug](https://github.com/camunda-community-hub/openapi-connector-template-generator/issues/4) on Linux systems. If
this is the case, you can apply the solution from
the [pull request](https://github.com/camunda-community-hub/openapi-connector-template-generator/pull/5) by switching to
the branch `linux-fixes` and run the command again.  
