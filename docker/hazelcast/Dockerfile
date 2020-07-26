FROM hazelcast/hazelcast:3.12.6

copy hazelcast.xml hazelcast.xml

# Start Hazelcast
CMD ["bash", "-c", "set -euo pipefail \
      # define a built-in user account on first start (if security.properties file is not present)
      && ./start-hazelcast.sh"]
