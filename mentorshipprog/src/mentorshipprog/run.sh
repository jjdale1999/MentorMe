#!/bin/bash

javac -cp .:./mail.jar:./activation.jar *.java
java -cp .:./mail.jar:./activation.jar EmailTester
