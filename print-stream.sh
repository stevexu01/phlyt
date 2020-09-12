#!/bin/bash

Timeout=180 # 3 minutes

function timeout_monitor() {
   sleep "$Timeout"
   kill "$1"
}

# start the timeout monitor in
# background and pass the PID:
timeout_monitor "$$" &
Timeout_monitor_pid=$!

# <your script here>
while true; do curl -s http://localhost:8080/actuator/metrics/jvm.memory.used | jq .measurements[0].value && sleep 3; done

# kill timeout monitor when terminating:
kill "$Timeout_monitor_pid"