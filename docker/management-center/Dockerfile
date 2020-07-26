FROM hazelcast/management-center:3.12.8

# Start Management Center
CMD ["bash", "-c", "set -euo pipefail \
      && [ -f ${MC_DATA}/security.properties ] || ./mc-conf.sh create-user -H=${MC_DATA} -n=admin -p=p@ssw0rd -r=admin \
      && /mc-start.sh"]
