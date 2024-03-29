FROM adoptopenjdk:11-jre-hotspot as builder
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract



FROM adoptopenjdk:11-jre-hotspot

EXPOSE 8090 5005
ARG JAVA_OPTS=""
ARG DB_URL=jdbc:oracle:thin:@oracle-server.org:1521:orcl
ARG DB_USERNAME=portal
ARG DB_PASSWORD=123
ARG SERVER_PORT=8090
ARG DLL_AUTO=update
ARG SCHEDULER_DB_URL=jdbc:oracle:thin:@oracle-server.org:1521:orcl
ARG SCHEDULER_DB_USERNAME=portal_quartz
ARG SCHEDULER_DB_PASSWORD=123
ARG SSO_USER=portal
ARG SSO_PASSWORD=portal
ARG SSO_SERVER_HOST_URL=http://localhost:30057
ARG SSO_APP_USER=sso
ARG SSO_APP_PASSWORD=sso
ARG MAIL_JAMES_SMTP_HOST=oracle-server.org
ARG MAIL_JAMES_SMTP_PORT=25
ARG MAIL_JAMES_POP3_PORT=110
ARG MAIL_JAMES_POP3_STORE_TYPE=pop3
ARG MAIL_JAMES_IMAP_PORT=143
ARG MAIL_JAMES_POP3_PROPERTY_DISPLAYNAME_SENT=sent
ARG MAIL_SERVER_ADMINISTRATOR_PASSWORD=sPass!$
ARG OAUTH2_JWK_URI=https://auth.pdnco.org/oxauth/restv1/jwks
ARG OAUTH2_ISSUER_URI=https://auth.pdnco.org

ENV JAVA_OPTS=$JAVA_OPTS
ENV DB_URL=$DB_URL
ENV DB_USERNAME=$DB_USERNAME
ENV DB_PASSWORD=$DB_PASSWORD
ENV DLL_AUTO=$DLL_AUTO
ENV SCHEDULER_DB_URL=$SCHEDULER_DB_URL
ENV SCHEDULER_DB_USERNAME=$SCHEDULER_DB_USERNAME
ENV SCHEDULER_DB_PASSWORD=$SCHEDULER_DB_PASSWORD

ENV SSO_USER=$SSO_USER
ENV SERVER_PORT=$SERVER_PORT
ENV SSO_PASSWORD=$SSO_PASSWORD
ENV SSO_SERVER_HOST_URL=$SSO_SERVER_HOST_URL
ENV SSO_APP_USER=$SSO_APP_USER
ENV SSO_APP_PASSWORD=$SSO_APP_PASSWORD
ENV MAIL_JAMES_SMTP_HOST=$MAIL_JAMES_SMTP_HOST
ENV MAIL_JAMES_SMTP_PORT=$MAIL_JAMES_SMTP_PORT
ENV MAIL_JAMES_POP3_PORT=$MAIL_JAMES_POP3_PORT
ENV MAIL_JAMES_POP3_STORE_TYPE=$MAIL_JAMES_POP3_STORE_TYPE
ENV MAIL_JAMES_IMAP_PORT=$MAIL_JAMES_IMAP_PORT
ENV MAIL_JAMES_POP3_PROPERTY_DISPLAYNAME_SENT=$MAIL_JAMES_POP3_PROPERTY_DISPLAYNAME_SENT
ENV MAIL_SERVER_ADMINISTRATOR_PASSWORD=$MAIL_SERVER_ADMINISTRATOR_PASSWORD
ENV OAUTH2_JWK_URI=$OAUTH2_JWK_URI
ENV OAUTH2_ISSUER_URI=$OAUTH2_ISSUER_URI

COPY --from=builder dependencies/ ./
COPY --from=builder snapshot-dependencies/ ./
COPY --from=builder spring-boot-loader/ ./
COPY --from=builder application/ ./
ENTRYPOINT java $JAVA_OPTS org.springframework.boot.loader.JarLauncher