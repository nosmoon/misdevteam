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

JAVA_HOME=../../jre
USER_CLASSPATH=
MAX_MEMORY=256
MIN_MEMORY=128
JAVA_OPTION=-hotspot



OZSERVER_HOME=..
OZLIB=.:$OZSERVER_HOME/WEB-INF/lib
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/ozsfw30.jar

#  -----------------------------------
#         for User Data Set classes
#  -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/ozuds30.jar
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/hsqldb.jar
rem OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/servlet.jar

#  -----------------------------------
#         for User Data Set classes
#  -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME/uds


#  -----------------------------------
#         Library for Logging
#  -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/log4j.jar


#  -----------------------------------
#         Library for XML
#  -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/jaxp.jar
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/parser.jar
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/crimson.jar
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/xerces.jar


# -----------------------------------
#      JDBC Driver for Oracle     
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/classes12.zip

#  If your version of oracle is 7 and
#  its character set is KOREAN(KSC5601),
#  then delete '#' of next line
#  OZLIB=$OZLIB:$OZSERVER_HOME/lib/ijava.jar


# -----------------------------------
#     JDBC Driver for Informix  
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/ifxjdbc.jar


# -----------------------------------
#   JDBC Driver for Syabse   
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/jconn2.jar

# -----------------------------------
#      JDBC Driver for IBM DB2 
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/db2java.zip

# -----------------------------------
#      JDBC Driver for Uni-SQL
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/unisql10.jar

# -----------------------------------
#        HTTPS/SSL Module
# -----------------------------------
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/jcert.jar
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/jnet.jar
OZLIB=$OZLIB:$OZSERVER_HOME/WEB-INF/lib/jsse.jar

# -----------------------------------
#      USER CLASSPAATH
# -----------------------------------
if [ "$USER_CLASSPATH" != "" ]; then
  OZLIB=$OZLIB:$USER_CLASSPATH
fi 


if [ "$1" != "-start" ]; then 
  JAVA_OPTION=
else 
  JAVA_OPTION="$JAVA_OPTION -ms$MIN_MEMORY"m
  JAVA_OPTION="$JAVA_OPTION -mx$MAX_MEMORY"m
fi

echo ""
echo $OZLIB
echo ""

$JAVA_HOME/bin/java $JAVA_OPTION -classpath $OZLIB oz.admin.shell.server.OZAShell $1 $2 $3 $4 $5 $6 $7 $8 $9
