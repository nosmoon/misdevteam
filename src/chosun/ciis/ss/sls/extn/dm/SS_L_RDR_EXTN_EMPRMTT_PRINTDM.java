/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_EMPRMTT_PRINTDM.java
* ��� : Ȯ����Ȳ-���Ȯ��-�۱�-�μ⸦���� DM
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * Ȯ����Ȳ-���Ȯ��-�۱�-�μ⸦���� DM
 */

public class SS_L_RDR_EXTN_EMPRMTT_PRINTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extncampno;
	public String frdt;
	public String todt;
	public String sortflag;

	public SS_L_RDR_EXTN_EMPRMTT_PRINTDM(){}
	public SS_L_RDR_EXTN_EMPRMTT_PRINTDM(String rdr_extncampno, String frdt, String todt, String sortflag){
		this.rdr_extncampno = rdr_extncampno;
		this.frdt = frdt;
		this.todt = todt;
		this.sortflag = sortflag;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setSortflag(String sortflag){
		this.sortflag = sortflag;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSortflag(){
		return this.sortflag;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_EMPRMTT_PRINT( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_EMPRMTT_PRINTDM dm = (SS_L_RDR_EXTN_EMPRMTT_PRINTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extncampno);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.sortflag);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String rdr_extncampno = req.getParameter("rdr_extncampno");
if( rdr_extncampno == null){
	System.out.println(this.toString+" : rdr_extncampno is null" );
}else{
	System.out.println(this.toString+" : rdr_extncampno is "+rdr_extncampno );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String sortflag = req.getParameter("sortflag");
if( sortflag == null){
	System.out.println(this.toString+" : sortflag is null" );
}else{
	System.out.println(this.toString+" : sortflag is "+sortflag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String sortflag = Util.checkString(req.getParameter("sortflag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_extncampno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampno")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String sortflag = Util.Uni2Ksc(Util.checkString(req.getParameter("sortflag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRdr_extncampno(rdr_extncampno);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setSortflag(sortflag);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat May 08 13:52:22 KST 2004 */