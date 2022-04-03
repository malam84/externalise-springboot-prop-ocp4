# externalise-springboot-prop-ocp4

1. Create configMap
   cd $PROJECT_HOME
   oc create configmap externalise-springboot-prop-ocp4-config --from-file=src/main/resources/application.properties
2. Deploy template DeploymentConfig.yaml
