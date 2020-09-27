#!/bin/sh

native-image --no-server --no-fallback -H:ConfigurationFileDirectories=target/config Test app
