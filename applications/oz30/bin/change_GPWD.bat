@echo off
rem -----------------------------------------------------
rem
rem            Change Guest Password
rem 
rem  
rem  
rem  JAVA_HOME      - Determines the version of Java used to start  
rem                   OZ Server. This variable must point to the 
rem                   root directory of a JDK or JRE installation. 
rem                   for an up-to-date list of supported JVMs your platform. 
rem  USER_CLASSPATH - Use this variable to append jar files or directories to 
rem                   the OZLIB.
rem  MAX_MEMORY     - Maximum memory used by OZ Server. (The unit is mega-byte.)
rem  MIN_MEMORY     - Minimum memory used by OZ Server. (The unit is mega-byte.)
rem 
rem -----------------------------------------------------

rem  -----------------------------------
rem    Set user-defined variables
rem  -----------------------------------

set JAVA_HOME=C:\JDK\jdk1.3
set MAX_MEMORY=128
set MIN_MEMORY=128
set JAVA_OPTION= 
rem set JAVA_OPTION= -server -Xfuture -Xcheck:jni 

set OZ_HOME=D:\OZSource
set OZSERVER_HOME=..
set OZLIB=.;%OZSERVER_HOME%

rem -----------------------------------
rem        Library for Logging
rem -----------------------------------
set OZLIB=%OZLIB%;%OZ_HOME%\lib\log4j.jar


if not "%1" == "-start" goto notStart
set JAVA_OPTION= %JAVA_OPTION% -Xms%MIN_MEMORY%m -Xmx%MAX_MEMORY%m
:notStart

%JAVA_HOME%\bin\java %JAVA_OPTION% -cp %OZLIB% ChangeGPWD

pause