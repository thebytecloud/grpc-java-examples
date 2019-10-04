
all:
    mvn clean install

haproxy:
    docker run -d --name haproxy -v /path/to/etc/haproxy:/usr/local/etc/haproxy:ro haproxy:1.7