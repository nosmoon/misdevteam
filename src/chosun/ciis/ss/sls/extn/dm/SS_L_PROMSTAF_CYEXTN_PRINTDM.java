/***************************************************************************************************
 * ���ϸ�   : SS_L_PROMSTAF_CYEXTN_PRINTDM.java
 * ���     : Ȯ����Ȳ-���̹�Ȯ��-�������-�μ�
 * �ۼ����� : 2006/01/04
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
**  Ȯ����Ȳ-���̹�Ȯ��-�������-�μ�
**/

public class SS_L_PROMSTAF_CYEXTN_PRINTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String frdt;
	public String todt;
	public String stafclsfcd;
	public String stafnm;
	public String cnvsstafnm;

	public SS_L_PROMSTAF_CYEXTN_PRINTDM(){}
	public SS_L_PROMSTAF_CYEXTN_PRINTDM(String frdt, String todt, String stafclsfcd, String stafnm, String cnvsstafnm){
		this.frdt = frdt;
		this.todt = todt;
		this.stafclsfcd = stafclsfcd;
		this.stafnm = stafnm;
		this.cnvsstafnm = cnvsstafnm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setCnvsstafnm(String cnvsstafnm){
		this.cnvsstafnm = cnvsstafnm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getCnvsstafnm(){
		return this.cnvsstafnm;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_PROMSTAF_CYEXTN_PRINT( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PROMSTAF_CYEXTN_PRINTDM dm = (SS_L_PROMSTAF_CYEXTN_PRINTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.frdt);
		cstmt.setString(4, dm.todt);
		cstmt.setString(5, dm.stafclsfcd);
		cstmt.setString(6, dm.stafnm);
		cstmt.setString(7, dm.cnvsstafnm);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_PROMSTAF_CYEXTN_PRINTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

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
String stafclsfcd = req.getParameter("stafclsfcd");
if( stafclsfcd == null){
	System.out.println(this.toString+" : stafclsfcd is null" );
}else{
	System.out.println(this.toString+" : stafclsfcd is "+stafclsfcd );
}
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
}
String cnvsstafnm = req.getParameter("cnvsstafnm");
if( cnvsstafnm == null){
	System.out.println(this.toString+" : cnvsstafnm is null" );
}else{
	System.out.println(this.toString+" : cnvsstafnm is "+cnvsstafnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
String cnvsstafnm = Util.checkString(req.getParameter("cnvsstafnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
String cnvsstafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cnvsstafnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setStafclsfcd(stafclsfcd);
dm.setStafnm(stafnm);
dm.setCnvsstafnm(cnvsstafnm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 04 15:28:59 KST 2006 */