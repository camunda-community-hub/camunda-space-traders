# Contributing

:tada: Thank you for taking the time to contribute! :+1:

## How Can I Contribute?

### Reporting Bugs

If you found a bug or unexpected behavior in the SDK or one of the processes then create a [new issue](https://github.com/camunda-community-hub/camunda-space-traders/issues). Before creating an issue, make sure that there is no issue yet. Any information you provide on the issue would be helpful to solve it.

### Suggesting Enhancements

If you have an idea of how to improve the SDK, one of the processes, or something else in the project then create a [new issue](https://github.com/camunda-community-hub/camunda-space-traders/issues). Describe your idea and the motivation behind it. To speed up the process, think about providing a pull request.

### Improving Documentation

If you see a way to improve the documentation, for example, by providing additional or missing information, then open a new pull request with your changes. 

### Sharing your Examples

Did you model a cool process or useful process block? Let's open a pull request and share your example. 

## Running integration tests

You can run the integration tests in the project with [Maven](http://maven.apache.org). 

In the directory `tests`:

Run the tests with
```
mvn clean test
```

## Styleguides

### Git Commit Messages

Commit messages should follow the [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/#summary) format.

For example:

```
feat(sdk): Improve error handling

Handle all 4xx errors and throw a BPMN error with the related error name.  
```

Available commit types:

* `feat` - enhancements, new features
* `fix` - bug fixes
* `refactor` - non-behavior changes
* `test` - only changes in tests
* `docs` - changes in the documentation, readme, etc.
* `style` - apply code styles
* `build` - changes to the build (e.g. to Maven's `pom.xml`)
* `ci` - changes to the CI (e.g. to GitHub related configs)
