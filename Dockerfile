ARG APP_INSIGHTS_AGENT_VERSION=2.5.0
FROM hmctspublic.azurecr.io/base/java:openjdk-11-distroless-1.4

COPY lib/AI-Agent.xml /opt/app/
COPY build/libs/draft-store.jar /opt/app/

EXPOSE 8800

CMD ["draft-store.jar"]
