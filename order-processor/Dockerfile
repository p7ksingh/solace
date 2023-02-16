FROM openjdk
# Install dapr CLI
RUN wget -q https://raw.githubusercontent.com/dapr/cli/master/install/install.sh -O - | /bin/bash

# Install dapd
ARG DAPR_BUILD_DIR
COPY $DAPR_BUILD_DIR /opt/dapr
ENV PATH="/opt/dapr/:${PATH}"
#RUN dapr init

VOLUME /tmp
EXPOSE 8080
ADD target/*.jar DaprConsumer-0.0.1-SNAPSHOT.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["dapr"]
CMD ["run --app-port 8080 --app-id order-processor-http --components-path ./components -- java -jar target/OrderProcessingService-0.0.1-SNAPSHOT.jar"]
