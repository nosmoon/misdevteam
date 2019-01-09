/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_SLSCOSTDM.java
* ��� : Ȯ��������� ����� ���� DM
* �ۼ����� : 2003-12-18
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


public class SS_L_RDR_EXTN_SLSCOSTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String areacd;
	public String bocd;
	public String basidt;
	public String boextn;
	public String movm;
	public String empextn;
	public String exgextn;

	public SS_L_RDR_EXTN_SLSCOSTDM(){}
	public SS_L_RDR_EXTN_SLSCOSTDM(String deptcd, String areacd, String bocd, String basidt, String boextn, String movm, String empextn, String exgextn){
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.basidt = basidt;
		this.boextn = boextn;
		this.movm = movm;
		this.empextn = empextn;
		this.exgextn = exgextn;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setBoextn(String boextn){
		this.boextn = boextn;
	}

	public void setMovm(String movm){
		this.movm = movm;
	}

	public void setEmpextn(String empextn){
		this.empextn = empextn;
	}

	public void setExgextn(String exgextn){
		this.exgextn = exgextn;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getBoextn(){
		return this.boextn;
	}

	public String getMovm(){
		return this.movm;
	}

	public String getEmpextn(){
		return this.empextn;
	}

	public String getExgextn(){
		return this.exgextn;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_SLSCOST( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_SLSCOSTDM dm = (SS_L_RDR_EXTN_SLSCOSTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.areacd);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.basidt);
		cstmt.setString(7, dm.boextn);
		cstmt.setString(8, dm.movm);
		cstmt.setString(9, dm.empextn);
		cstmt.setString(10, dm.exgextn);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_SLSCOSTDataSet();
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
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String boextn = req.getParameter("boextn");
if( boextn == null){
	System.out.println(this.toString+" : boextn is null" );
}else{
	System.out.println(this.toString+" : boextn is "+boextn );
}
String movm = req.getParameter("movm");
if( movm == null){
	System.out.println(this.toString+" : movm is null" );
}else{
	System.out.println(this.toString+" : movm is "+movm );
}
String empextn = req.getParameter("empextn");
if( empextn == null){
	System.out.println(this.toString+" : empextn is null" );
}else{
	System.out.println(this.toString+" : empextn is "+empextn );
}
String exgextn = req.getParameter("exgextn");
if( exgextn == null){
	System.out.println(this.toString+" : exgextn is null" );
}else{
	System.out.println(this.toString+" : exgextn is "+exgextn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String basidt = Util.checkString(req.getParameter("basidt"));
String boextn = Util.checkString(req.getParameter("boextn"));
String movm = Util.checkString(req.getParameter("movm"));
String empextn = Util.checkString(req.getParameter("empextn"));
String exgextn = Util.checkString(req.getParameter("exgextn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String boextn = Util.Uni2Ksc(Util.checkString(req.getParameter("boextn")));
String movm = Util.Uni2Ksc(Util.checkString(req.getParameter("movm")));
String empextn = Util.Uni2Ksc(Util.checkString(req.getParameter("empextn")));
String exgextn = Util.Uni2Ksc(Util.checkString(req.getParameter("exgextn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setBasidt(basidt);
dm.setBoextn(boextn);
dm.setMovm(movm);
dm.setEmpextn(empextn);
dm.setExgextn(exgextn);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Dec 19 16:51:30 KST 2003 */