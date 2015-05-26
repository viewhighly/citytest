#!/bin/bash

PROXY_IP=$1

sed -i "bak" "s/10.100.0.111/$1/g" build.gradle
git config http.proxy http://$1:3128
