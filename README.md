# serenity-screenplay

### How to use

#### Run by class name
` mvn clean verify -D"it.test=WhenSearchGoogleValidStory"`

#### Run by tags
1. add @WithTag before method need run
2. `mvn clean verify -D"tags=SearchGoogle" `