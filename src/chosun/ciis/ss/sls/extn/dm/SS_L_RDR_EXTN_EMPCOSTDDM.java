/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_EMPCOSTDDM.java
* ��� : ���Ȯ�� ��� �󼼸���� ���� DM
* �ۼ����� : 2003-12-13
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
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EMPCOSTDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String basidt;
	public String bocd;

	public SS_L_RDR_EXTN_EMPCOSTDDM(){}
	public SS_L_RDR_EXTN_EMPCOSTDDM(String basidt, String bocd){
		this.basidt = basidt;
		this.bocd = bocd;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_EMPCOSTD( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_EMPCOSTDDM dm = (SS_L_RDR_EXTN_EMPCOSTDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.basidt);
		cstmt.setString(4, dm.bocd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_EMPCOSTDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String basidt = Util.checkString(req.getParameter("basidt"));
String bocd = Util.checkString(req.getParameter("bocd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBasidt(basidt);
dm.setBocd(bocd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Dec 15 14:11:47 KST 2003 */