# Start from GridGain Professional image.
FROM gridgain/gridgain-pro:8.7.5

# Set config uri for node.
ENV CONFIG_URI PAM_TEST_CLUSTER-server.xml

# Copy optional libs.
ENV OPTION_LIBS ignite-rest-http

# Update packages and install maven.
RUN set -x \
    && apk add --no-cache \
        openjdk8

RUN apk --update add \
    maven \
    && rm -rfv /var/cache/apk/*

# Append project to container.
ADD . PAM_TEST_CLUSTER

# Build project in container.
RUN mvn -f PAM_TEST_CLUSTER/pom.xml clean package -DskipTests

# Copy project jars to node classpath.
RUN mkdir $IGNITE_HOME/libs/PAM_TEST_CLUSTER && \
   find PAM_TEST_CLUSTER/target -name "*.jar" -type f -exec cp {} $IGNITE_HOME/libs/PAM_TEST_CLUSTER \;