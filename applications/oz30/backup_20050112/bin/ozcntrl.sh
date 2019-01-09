#!/bin/sh
#-----------------------------------------------------
#
#            OZ Contorl.
# 
# This script file written and tested under HP-UX
# 
# User should set following variables: 
# 
# JAVA_HOME      - Determines the version of Java used to start  
#                  OZ Server. This variable must point to the 
#                  root directory of a JDK or JRE installation. 
#                  for an up-to-date list of supported JVMs your platform. 
# USER_CLASSPATH - Use this variable to append jar files or directories to 
#                  the OZLIB.
# MAX_MEMORY     - Maximum memory used by OZ Server. (The unit is mega-byte.)
# MIN_MEMORY     - Minimum memory used by OZ Server. (The unit is mega-byte.)
# JAVA_OPTIONS   - On some platforms, certain java command-line options are 
#                  recommanded when running OZ Server. 
#
#-----------------------------------------------------


#  -----------------------------------
#   Set user-defined variables
#  -----------------------------------

JAVA_HOME=..\..\jre
USER_CLASSPATH=
MAX_MEMORY=128
MIN_MEMORY=128
JAVA_OPTION=-hotspot



OZSERVER_HOME=..
OZLIB=.:$OZSERVER_HOME\conf:$OZSERVER_HOM\WEB-INF\classes
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\ozlib30.jar

#  -----------------------------------
#         for User Data Set classes
#  -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\ozuds.jar


#  -----------------------------------
#         Library for Logging
#  -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\log4j.jar


#  -----------------------------------
#         Library for XML
#  -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\jaxp.jar
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\parser.jar
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\xerces.jar
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\crimson.jar


# -----------------------------------
#      JDBC Driver for Oracle     
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\classes12.zip

#  If your version of oracle is 7 and
#  its character set is KOREAN(KSC5601),
#  then delete '#' of next line
#  OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\ijava.jar


# -----------------------------------
#     JDBC Driver for Informix  
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\ifxjdbc.jar


# -----------------------------------
#   JDBC Driver for Syabse   
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\jconn2.jar


# -----------------------------------
#      JDBC Driver for MSSQL      
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\jkjdbc.jar


# -----------------------------------
#      JDBC Driver for IBM DB2 
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\db2java.zip

# -----------------------------------
#      JDBC Driver for Uni-SQL
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\unisql10.jar

# -----------------------------------
#        Library for Repository Crypto
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\cryptix-jce-api.jar
OZLIB=$OZLIB:$OZSERVER_HOME\WEB-INF\lib\cryptix-jce-provider.jar


# -----------------------------------
#      USER CLASSPAATH
# -----------------------------------
if [ "$USER_CLASSPATH" != "" ]; then
  OZLIB=$OZLIB:$USER_CLASSPATH
fi 


if [ "$1" != "-start" ]; then 
  JAVA_OPTION=
else 
#  JAVA_OPTION="$JAVA_OPTION -Xms$MIN_MEMORYm -Xmx$MAX_MEMORYm"
  JAVA_OPTION="$JAVA_OPTION -Xms$MIN_MEMORY"m
  JAVA_OPTION="$JAVA_OPTION -Xmx$MAX_MEMORY"m
fi

$JAVA_HOME\bin\java $JAVA_OPTION -cp $OZLIB oz.admin.shell.server.OZAShell $1 $2 $3 $4 $5 $6 $7 $8 $9
