/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.sp.sup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.ds.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1420_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acpn_no;
	public String dlco_no;
	public String rdr_nm;
	public String acpn_dt;

	public SP_SUP_1420_SDM(){}
	public SP_SUP_1420_SDM(String cmpy_cd, String acpn_no, String dlco_no, String rdr_nm, String acpn_dt){
		this.cmpy_cd = cmpy_cd;
		this.acpn_no = acpn_no;
		this.dlco_no = dlco_no;
		this.rdr_nm = rdr_nm;
		this.acpn_dt = acpn_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcpn_no(String acpn_no){
		this.acpn_no = acpn_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setRdr_nm(String rdr_nm){
		this.rdr_nm = rdr_nm;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcpn_no(){
		return this.acpn_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getRdr_nm(){
		return this.rdr_nm;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SUP_1420_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SUP_1420_SDM dm = (SP_SUP_1420_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acpn_no);
		cstmt.setString(5, dm.dlco_no);
		cstmt.setString(6, dm.rdr_nm);
		cstmt.setString(7, dm.acpn_dt);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR);
		cstmt.registerOutParameter(25, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sup.ds.SP_SUP_1420_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acpn_no = [" + getAcpn_no() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("rdr_nm = [" + getRdr_nm() + "]");
		System.out.println("acpn_dt = [" + getAcpn_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String acpn_no = req.getParameter("acpn_no");
if( acpn_no == null){
	System.out.println(this.toString+" : acpn_no is null" );
}else{
	System.out.println(this.toString+" : acpn_no is "+acpn_no );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String rdr_nm = req.getParameter("rdr_nm");
if( rdr_nm == null){
	System.out.println(this.toString+" : rdr_nm is null" );
}else{
	System.out.println(this.toString+" : rdr_nm is "+rdr_nm );
}
String acpn_dt = req.getParameter("acpn_dt");
if( acpn_dt == null){
	System.out.println(this.toString+" : acpn_dt is null" );
}else{
	System.out.println(this.toString+" : acpn_dt is "+acpn_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acpn_no = Util.checkString(req.getParameter("acpn_no"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String rdr_nm = Util.checkString(req.getParameter("rdr_nm"));
String acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acpn_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_no")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String rdr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_nm")));
String acpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcpn_no(acpn_no);
dm.setDlco_no(dlco_no);
dm.setRdr_nm(rdr_nm);
dm.setAcpn_dt(acpn_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 10 23:06:01 KST 2012 */