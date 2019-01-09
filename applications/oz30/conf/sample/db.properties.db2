#
#  sample configuraion for DB2
#



#
#  DB2 on AS400
#  NET Protocol
#
as400_net_example.vendor=user
as400_net_example.driver=com.ibm.as400.access.AS400JDBCDriver
as400_net_example.url=jdbc:as400://IP(DN):PORT/DB이름
as400_net_example.props=user=oz;password=oz
as400_net_example.user=oz
as400_net_example.maxconns=20
as400_net_example.initconns=5
as400_net_example.timeout=5


#
#  DB2 on AS400
#  APP Protocol
#
as400_app_example.vendor=user
as400_app_example.driver=com.ibm.as400.access.AS400JDBCDriver
as400_app_example.url=jdbc:as400:DB이름
as400_app_example.props=user=oz;password=oz
as400_app_example.user=oz
as400_app_example.maxconns=20
as400_app_example.initconns=5
as400_app_example.timeout=5




#
#  DB2 on OS/390
#  NET Protocol
#
os390_net_example.vendor=user
os390_net_example.driver=ibm.sql.DB2Driver
os390_net_example.url=jdbc:db2os390://IP(DN):PORT/DB이름
os390_net_example.props=user=oz;password=oz
os390_net_example.user=oz
os390_net_example.maxconns=20
os390_net_example.initconns=5
os390_net_example.timeout=5



#
#  DB2 on OS/390
#  APP Protocol
#
os390_app_example.vendor=user
os390_app_example.driver=ibm.sql.DB2Driver
os390_app_example.url=jdbc:db2os390:DB이름
os390_app_example.props=user=oz;password=oz
os390_app_example.user=oz
os390_app_example.maxconns=20
os390_app_example.initconns=5
os390_app_example.timeout=5




#
#  DB2 on others
#  NET Protocol
#
others_net_example.vendor=user
others_net_example.driver=COM.ibm.db2.jdbc.app.DB2Driver
others_net_example.url=jdbc:db2://IP(DN):PORT/DB이름
others_net_example.props=user=oz;password=oz
others_net_example.user=oz
others_net_example.maxconns=20
others_net_example.initconns=5
others_net_example.timeout=5

#
#  DB2 on others
#  APP Protocol
#
others_app_example.vendor=user
others_app_example.driver=COM.ibm.db2.jdbc.net.DB2Driver
others_app_example.url=jdbc:db2:DB이름
others_app_example.props=user=oz;password=oz
others_app_example.user=oz
others_app_example.maxconns=20
others_app_example.initconns=5
others_app_example.timeout=5

