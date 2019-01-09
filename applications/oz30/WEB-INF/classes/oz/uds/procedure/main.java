package oz.uds.procedure;

import oz.uds.*;
import oz.uds.basic.DefaultUserDataStore;
import java.util.StringTokenizer;
import java.util.Vector;
import java.sql.*;
import oracle.jdbc.driver.OracleTypes;

public class main{
	public static void main(String[] args) throws Exception{
		ProcedureUDS Proc = new ProcedureUDS();
		Proc.init();
		Proc.getResultSet("test@@call SP_SL_P_RDRLIST_CONT(@ov_errcode.VARCHAR2,@ov_errmsg.VARCHAR2,'19110','','001',  '999','', '', '20030101', '20070101', '', '', '','', '','', '', '', '1', '', '', @ov_rdrlistcur.CURSOR,@ov_sumlistcur.CURSOR);");
		Proc.getResultSet("test@@open ov_rdrlistcur");
	 }
}