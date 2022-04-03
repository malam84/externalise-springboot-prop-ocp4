# externalise-springboot-prop-ocp4

1. Create configMap <br>
   cd $PROJECT_HOME <br>
   oc create configmap externalise-springboot-prop-ocp4-config --from-file=src/main/resources/application.properties
2. Deploy template <br>
   DeploymentConfig.yaml
