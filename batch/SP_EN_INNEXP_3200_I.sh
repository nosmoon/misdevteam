ORACLE_BASE=/Oracle/ora9i/9201
ORACLE_HOME=/Oracle/ora9i/9201
NLS_LANG=AMERICAN_AMERICA.KO16KSC5601
ORA_NLS33=$ORACLE_HOME/ocommon/nls/admin/data
SHLIB_PATH=$ORACLE_HOME/lib

export ORACLE_BASE ORACLE_HOME NLS_LANG ORA_NLS33 SHLIB_PATH

PATH=$ORACLE_HOME/bin:$PATH:.
CLASSPATH=$ORACLE_HOME/JRE:$ORACLE_HOME/jlib

cd /was/csi/batch

sqlplus -s MISENP/CS_MISENP@crmsl << !
call SP_EN_INNEXP_3200_I();
exit
!
