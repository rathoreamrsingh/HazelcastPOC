* Command for running hazelcast in docker
docker run -e JAVA_OPTS="-Dhazelcast.local.publicAddress=192.168.1.81:5701" -p 5701:5701 hazelcast/hazelcast
docker run -e JAVA_OPTS="-Dhazelcast.local.publicAddress=192.168.1.81:5702" -p 5702:5702 hazelcast/hazelcast

docker run -it --net=host --name hz1 -p 192.168.1.81:5701:5701 hazelcast/hazelcast