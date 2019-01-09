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


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1902_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cntr_no;
	public String cmpy_cd;
	public String clam_yymm;
	public String clam_seq;

	public AS_LEAS_1902_SDM(){}
	public AS_LEAS_1902_SDM(String cntr_no, String cmpy_cd, String clam_yymm, String clam_seq){
		this.cntr_no = cntr_no;
		this.cmpy_cd = cmpy_cd;
		this.clam_yymm = clam_yymm;
		this.clam_seq = clam_seq;
	}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getClam_seq(){
		return this.clam_seq;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1902_S(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1902_SDM dm = (AS_LEAS_1902_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cntr_no);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.clam_yymm);
		cstmt.setString(6, dm.clam_seq);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1902_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cntr_no = [" + getCntr_no() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clam_yymm = [" + getClam_yymm() + "]");
		System.out.println("clam_seq = [" + getClam_seq() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cntr_no = req.getParameter("cntr_no");
if( cntr_no == null){
	System.out.println(this.toString+" : cntr_no is null" );
}else{
	System.out.println(this.toString+" : cntr_no is "+cntr_no );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String clam_yymm = req.getParameter("clam_yymm");
if( clam_yymm == null){
	System.out.println(this.toString+" : clam_yymm is null" );
}else{
	System.out.println(this.toString+" : clam_yymm is "+clam_yymm );
}
String clam_seq = req.getParameter("clam_seq");
if( clam_seq == null){
	System.out.println(this.toString+" : clam_seq is null" );
}else{
	System.out.println(this.toString+" : clam_seq is "+clam_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cntr_no = Util.checkString(req.getParameter("cntr_no"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clam_yymm = Util.checkString(req.getParameter("clam_yymm"));
String clam_seq = Util.checkString(req.getParameter("clam_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cntr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_no")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clam_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_yymm")));
String clam_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCntr_no(cntr_no);
dm.setCmpy_cd(cmpy_cd);
dm.setClam_yymm(clam_yymm);
dm.setClam_seq(clam_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 17:05:50 KST 2009 */