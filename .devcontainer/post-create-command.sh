#!/bin/bash

echo "#### post-create-command.sh: $(date) - start"

set -e

env

me=$(basename "$0")

echo "#### post-create-command.sh: $(date) - me is $(me)"

npm install -g surge

echo "#### post-create-command.sh: $(date) - end"
