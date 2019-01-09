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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8001_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cntr_clsf_cd;
	public String leas_no;
	public String leas_sub_seq;

	public FC_FUNC_8001_SDM(){}
	public FC_FUNC_8001_SDM(String cmpy_cd, String cntr_clsf_cd, String leas_no, String leas_sub_seq){
		this.cmpy_cd = cmpy_cd;
		this.cntr_clsf_cd = cntr_clsf_cd;
		this.leas_no = leas_no;
		this.leas_sub_seq = leas_sub_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCntr_clsf_cd(String cntr_clsf_cd){
		this.cntr_clsf_cd = cntr_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setLeas_sub_seq(String leas_sub_seq){
		this.leas_sub_seq = leas_sub_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCntr_clsf_cd(){
		return this.cntr_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getLeas_sub_seq(){
		return this.leas_sub_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8001_S(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8001_SDM dm = (FC_FUNC_8001_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cntr_clsf_cd);
		cstmt.setString(5, dm.leas_no);
		cstmt.setString(6, dm.leas_sub_seq);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8001_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = " + getCmpy_cd());
		System.out.println("cntr_clsf_cd = " + getCntr_clsf_cd());
		System.out.println("leas_no = " + getLeas_no());
		System.out.println("leas_sub_seq = " + getLeas_sub_seq());
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
String cntr_clsf_cd = req.getParameter("cntr_clsf_cd");
if( cntr_clsf_cd == null){
	System.out.println(this.toString+" : cntr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : cntr_clsf_cd is "+cntr_clsf_cd );
}
String leas_no = req.getParameter("leas_no");
if( leas_no == null){
	System.out.println(this.toString+" : leas_no is null" );
}else{
	System.out.println(this.toString+" : leas_no is "+leas_no );
}
String leas_sub_seq = req.getParameter("leas_sub_seq");
if( leas_sub_seq == null){
	System.out.println(this.toString+" : leas_sub_seq is null" );
}else{
	System.out.println(this.toString+" : leas_sub_seq is "+leas_sub_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
String leas_no = Util.checkString(req.getParameter("leas_no"));
String leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cntr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_clsf_cd")));
String leas_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no")));
String leas_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_sub_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCntr_clsf_cd(cntr_clsf_cd);
dm.setLeas_no(leas_no);
dm.setLeas_sub_seq(leas_sub_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 13:06:50 KST 2009 */