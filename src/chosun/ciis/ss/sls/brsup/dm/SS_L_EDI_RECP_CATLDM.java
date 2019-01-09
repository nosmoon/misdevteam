/***************************************************************************************************
 * 파일명   : SS_L_EDI_RECP_CATLDM.java
 * 기능     : 지국지원-빌링-지로EDI 수납결과목록(header)
 * 작성일자 : 2007/02/21
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_L_EDI_RECP_CATL
**/

public class SS_L_EDI_RECP_CATLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String f_acqdt;
	public String t_acqdt;
	public String girono;
	public long pageno;
	public long pagesize;

	public SS_L_EDI_RECP_CATLDM(){}
	public SS_L_EDI_RECP_CATLDM(String f_acqdt, String t_acqdt, String girono, long pageno, long pagesize){
		this.f_acqdt = f_acqdt;
		this.t_acqdt = t_acqdt;
		this.girono = girono;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setF_acqdt(String f_acqdt){
		this.f_acqdt = f_acqdt;
	}

	public void setT_acqdt(String t_acqdt){
		this.t_acqdt = t_acqdt;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getF_acqdt(){
		return this.f_acqdt;
	}

	public String getT_acqdt(){
		return this.t_acqdt;
	}

	public String getGirono(){
		return this.girono;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EDI_RECP_CATL( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EDI_RECP_CATLDM dm = (SS_L_EDI_RECP_CATLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.f_acqdt);
		cstmt.setString(4, dm.t_acqdt);
		cstmt.setString(5, dm.girono);
		cstmt.setLong(6, dm.pageno);
		cstmt.setLong(7, dm.pagesize);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_EDI_RECP_CATLDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String f_acqdt = req.getParameter("f_acqdt");
if( f_acqdt == null){
	System.out.println(this.toString+" : f_acqdt is null" );
}else{
	System.out.println(this.toString+" : f_acqdt is "+f_acqdt );
}
String t_acqdt = req.getParameter("t_acqdt");
if( t_acqdt == null){
	System.out.println(this.toString+" : t_acqdt is null" );
}else{
	System.out.println(this.toString+" : t_acqdt is "+t_acqdt );
}
String girono = req.getParameter("girono");
if( girono == null){
	System.out.println(this.toString+" : girono is null" );
}else{
	System.out.println(this.toString+" : girono is "+girono );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String f_acqdt = Util.checkString(req.getParameter("f_acqdt"));
String t_acqdt = Util.checkString(req.getParameter("t_acqdt"));
String girono = Util.checkString(req.getParameter("girono"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String f_acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("f_acqdt")));
String t_acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("t_acqdt")));
String girono = Util.Uni2Ksc(Util.checkString(req.getParameter("girono")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setF_acqdt(f_acqdt);
dm.setT_acqdt(t_acqdt);
dm.setGirono(girono);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 21 11:40:15 KST 2007 */