#!/bin/sh

java -agentlib:native-image-agent=config-output-dir=target/config Test
