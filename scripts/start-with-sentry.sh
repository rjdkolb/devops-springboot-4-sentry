#! /bin/sh

# There are many ways to dynamically configure Sentry, environment variables make it portable and clear for me, see:
# https://docs.sentry.io/platforms/java/guides/spring-boot/configuration/

if [ -z "$SENTRY_DSN" ]; then
  echo "Error: SENTRY_DSN environment variable is not set" >&2
  exit 1
fi

SENTRY_ENVIRONMENT=development
SENTRY_RELEASE='my-sentry@0.1.0'

mvn spring-boot:run -Dspring-boot.run.profiles=sentry
