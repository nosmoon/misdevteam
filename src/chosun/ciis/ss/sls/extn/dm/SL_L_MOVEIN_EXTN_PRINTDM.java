/***************************************************************************************************
* ���ϸ� : .java
* ��� : *�����濵-���־���Ʈ��Ȳ-������Ȯ����Ȳ-��������
* �ۼ����� : 2009-04-02
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * �����濵-���־���Ʈ��Ȳ-������Ȯ����Ȳ-��������
 */

public class SL_L_MOVEIN_EXTN_PRINTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fromdt;
	public String todt;
	public String stafnm;
	public String moveinyn;
	public String moveinteam;

	public SL_L_MOVEIN_EXTN_PRINTDM(){}
	public SL_L_MOVEIN_EXTN_PRINTDM(String deptcd, String partcd, String areacd, String bocd, String fromdt, String todt, String stafnm, String moveinyn, String moveinteam){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fromdt = fromdt;
		this.todt = todt;
		this.stafnm = stafnm;
		this.moveinyn = moveinyn;
		this.moveinteam = moveinteam;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setFromdt(String fromdt){
		this.fromdt = fromdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setMoveinyn(String moveinyn){
		this.moveinyn = moveinyn;
	}

	public void setMoveinteam(String moveinteam){
		this.moveinteam = moveinteam;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getFromdt(){
		return this.fromdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getMoveinyn(){
		return this.moveinyn;
	}

	public String getMoveinteam(){
		return this.moveinteam;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_MOVEIN_EXTN_PRINT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_MOVEIN_EXTN_PRINTDM dm = (SL_L_MOVEIN_EXTN_PRINTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fromdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.stafnm);
		cstmt.setString(10, dm.moveinyn);
		cstmt.setString(11, dm.moveinteam);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_L_MOVEIN_EXTN_PRINTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String partcd = req.getParameter("partcd");
if( partcd == null){
	System.out.println(this.toString+" : partcd is null" );
}else{
	System.out.println(this.toString+" : partcd is "+partcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String fromdt = req.getParameter("fromdt");
if( fromdt == null){
	System.out.println(this.toString+" : fromdt is null" );
}else{
	System.out.println(this.toString+" : fromdt is "+fromdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
}
String moveinyn = req.getParameter("moveinyn");
if( moveinyn == null){
	System.out.println(this.toString+" : moveinyn is null" );
}else{
	System.out.println(this.toString+" : moveinyn is "+moveinyn );
}
String moveinteam = req.getParameter("moveinteam");
if( moveinteam == null){
	System.out.println(this.toString+" : moveinteam is null" );
}else{
	System.out.println(this.toString+" : moveinteam is "+moveinteam );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
String moveinyn = Util.checkString(req.getParameter("moveinyn"));
String moveinteam = Util.checkString(req.getParameter("moveinteam"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
String moveinyn = Util.Uni2Ksc(Util.checkString(req.getParameter("moveinyn")));
String moveinteam = Util.Uni2Ksc(Util.checkString(req.getParameter("moveinteam")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setStafnm(stafnm);
dm.setMoveinyn(moveinyn);
dm.setMoveinteam(moveinteam);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 02 21:38:34 KST 2009 */