/***************************************************************************************************
* ���ϸ� : SL_A_RDR_MOVMWORK_CANCDM.java
* ��� : ����������������-�ΰ�(���ó��)
* �ۼ����� : 2004-02-07
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
 * ����������������-�ΰ�(���ó��)
 *
 */


public class SL_A_RDR_MOVMWORK_CANCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String regdt;
	public String regno;

	public SL_A_RDR_MOVMWORK_CANCDM(){}
	public SL_A_RDR_MOVMWORK_CANCDM(String bocd, String incmgpers, String regdt, String regno){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.regdt = regdt;
		this.regno = regno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_RDR_MOVMWORK_CANC( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_RDR_MOVMWORK_CANCDM dm = (SL_A_RDR_MOVMWORK_CANCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.regdt);
		cstmt.setString(6, dm.regno);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_RDR_MOVMWORK_CANCDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setRegdt(regdt);
dm.setRegno(regno);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Feb 09 10:25:14 KST 2004 */