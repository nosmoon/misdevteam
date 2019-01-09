/***************************************************************************************************
* ���ϸ� : SL_A_RDRMEMODM.java
* ��� : ������������(���ڸ޸�)
* �ۼ����� : 2003-12-27
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * ������������(���ڸ޸�)
 *
 */


public class SL_A_RDRMEMODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String incmgpers;
	public String rdr_no;
	public String cont;

	public SL_A_RDRMEMODM(){}
	public SL_A_RDRMEMODM(String accflag, String incmgpers, String rdr_no, String cont){
		this.accflag = accflag;
		this.incmgpers = incmgpers;
		this.rdr_no = rdr_no;
		this.cont = cont;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getCont(){
		return this.cont;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_RDRMEMO( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_RDRMEMODM dm = (SL_A_RDRMEMODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.rdr_no);
		cstmt.setString(6, dm.cont);
		cstmt.registerOutParameter(7, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_RDRMEMODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String accflag = Util.checkString(req.getParameter("accflag"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String cont = Util.checkString(req.getParameter("cont"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAccflag(accflag);
dm.setIncmgpers(incmgpers);
dm.setRdr_no(rdr_no);
dm.setCont(cont);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 30 14:37:12 KST 2003 */