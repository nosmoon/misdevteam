/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���Ȯ������ ��ȸ
* �ۼ����� : 2009-05-29
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * ���Ȯ������ ��ȸ
 */

public class SS_L_EXTN_COSTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String medicd;
	public String rdr_extnbgndd;
	public String rdr_extnto_dd;

	public SS_L_EXTN_COSTDM(){}
	public SS_L_EXTN_COSTDM(String medicd, String rdr_extnbgndd, String rdr_extnto_dd){
		this.medicd = medicd;
		this.rdr_extnbgndd = rdr_extnbgndd;
		this.rdr_extnto_dd = rdr_extnto_dd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdr_extnbgndd(String rdr_extnbgndd){
		this.rdr_extnbgndd = rdr_extnbgndd;
	}

	public void setRdr_extnto_dd(String rdr_extnto_dd){
		this.rdr_extnto_dd = rdr_extnto_dd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdr_extnbgndd(){
		return this.rdr_extnbgndd;
	}

	public String getRdr_extnto_dd(){
		return this.rdr_extnto_dd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EXTN_COST( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EXTN_COSTDM dm = (SS_L_EXTN_COSTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.medicd);
		cstmt.setString(4, dm.rdr_extnbgndd);
		cstmt.setString(5, dm.rdr_extnto_dd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EXTN_COSTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String rdr_extnbgndd = req.getParameter("rdr_extnbgndd");
if( rdr_extnbgndd == null){
	System.out.println(this.toString+" : rdr_extnbgndd is null" );
}else{
	System.out.println(this.toString+" : rdr_extnbgndd is "+rdr_extnbgndd );
}
String rdr_extnto_dd = req.getParameter("rdr_extnto_dd");
if( rdr_extnto_dd == null){
	System.out.println(this.toString+" : rdr_extnto_dd is null" );
}else{
	System.out.println(this.toString+" : rdr_extnto_dd is "+rdr_extnto_dd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String medicd = Util.checkString(req.getParameter("medicd"));
String rdr_extnbgndd = Util.checkString(req.getParameter("rdr_extnbgndd"));
String rdr_extnto_dd = Util.checkString(req.getParameter("rdr_extnto_dd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String rdr_extnbgndd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnbgndd")));
String rdr_extnto_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnto_dd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setMedicd(medicd);
dm.setRdr_extnbgndd(rdr_extnbgndd);
dm.setRdr_extnto_dd(rdr_extnto_dd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 29 17:54:22 KST 2009 */