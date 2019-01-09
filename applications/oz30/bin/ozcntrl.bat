@echo off
rem -----------------------------------------------------
rem
rem            OZ Contorl(OZA SHELL)
rem
rem
rem  This script file written and tested under Windows 2000
rem
rem  User should set following variables:
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

set JAVA_HOME=..\..\JRE
set MAX_MEMORY=256
set MIN_MEMORY=128
set JAVA_OPTION=


set OZSERVER_HOME=..
set USER_CLASSPATH=%OZSERVER_HOME%\uds\
set OZLIBALL=%OZSERVER_HOME%\WEB-INF\lib
set OZLIB=%OZLIBALL%\ozsfw30.jar;%OZSERVER_HOME%\conf\
set OZLIB=%OZLIB%;%OZLIBALL%\servlet.jar

rem -----------------------------------
rem        for User Data Set classes
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\ozuds30.jar


rem -----------------------------------
rem        Library for Logging
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\log4j.jar

rem -----------------------------------
rem        Library for XML
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\parser.jar
set OZLIB=%OZLIB%;%OZLIBALL%\xerces.jar
set OZLIB=%OZLIB%;%OZLIBALL%\crimson.jar

rem -----------------------------------
rem        Library for XML Store
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\dtdparser12.jar

rem -----------------------------------
rem      Repository File Sysgtem DB
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\hsqldb.jar

rem -----------------------------------
rem      JDBC Driver for Oracle
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\classes12.zip

rem -----------------------------------
rem      JDBC Driver for Mysql (3.0.14)
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\mysql.jar

rem  If your version of oracle is 7 and
rem  its character set is DBCS,
rem  then delete 'rem' of next line
rem  set OZLIB=%OZLIB%;%OZLIBALL%\ijava.jar

rem -----------------------------------
rem     JDBC Driver for Informix
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\ifxjdbc.jar

rem -----------------------------------
rem   JDBC Driver for Syabse
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\jconn2.jar

rem -----------------------------------
rem      JDBC Driver for IBM DB2
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\db2java.zip

rem -----------------------------------
rem      JDBC Driver for Uni-SQL
rem -----------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\unisqljdbc10.jar

rem -----------------------------------
rem      USER_CLASSPATH
rem -----------------------------------
set OZLIB=%OZLIB%;%USER_CLASSPATH%

rem -----------------------------------------------------
rem        HTTPS/SSL Module
rem -----------------------------------------------------
set OZLIB=%OZLIB%;%OZLIBALL%\jcert.jar
set OZLIB=%OZLIB%;%OZLIBALL%\jnet.jar
set OZLIB=%OZLIB%;%OZLIBALL%\jsse.jar


set JAVA_OPTION=

if not "%1" == "-start" goto notStart
set JAVA_OPTION= %JAVA_OPTION% -Xms%MIN_MEMORY%m -Xmx%MAX_MEMORY%m
:notStart

%JAVA_HOME%\bin\java %JAVA_OPTION% -cp %OZLIB% oz.admin.shell.server.OZAShell %1 %2 %3 %4 %5 %6 %7 %8 %9