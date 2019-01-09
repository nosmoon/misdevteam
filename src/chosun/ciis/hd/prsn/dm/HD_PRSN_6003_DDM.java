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


package chosun.ciis.hd.prsn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prsn.ds.*;
import chosun.ciis.hd.prsn.rec.*;

/**
 * 
 */


public class HD_PRSN_6003_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String seq;
	public String prv_aprv_emp_no;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_PRSN_6003_DDM(){}
	public HD_PRSN_6003_DDM(String cmpy_cd, String seq, String prv_aprv_emp_no, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.prv_aprv_emp_no = prv_aprv_emp_no;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPrv_aprv_emp_no(String prv_aprv_emp_no){
		this.prv_aprv_emp_no = prv_aprv_emp_no;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPrv_aprv_emp_no(){
		return this.prv_aprv_emp_no;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRSN_6003_D(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRSN_6003_DDM dm = (HD_PRSN_6003_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.seq);
		cstmt.setString(5, dm.prv_aprv_emp_no);
		cstmt.setString(6, dm.incmg_pers_ipadd);
		cstmt.setString(7, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prsn.ds.HD_PRSN_6003_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("prv_aprv_emp_no = [" + getPrv_aprv_emp_no() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String prv_aprv_emp_no = req.getParameter("prv_aprv_emp_no");
if( prv_aprv_emp_no == null){
	System.out.println(this.toString+" : prv_aprv_emp_no is null" );
}else{
	System.out.println(this.toString+" : prv_aprv_emp_no is "+prv_aprv_emp_no );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String prv_aprv_emp_no = Util.checkString(req.getParameter("prv_aprv_emp_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String prv_aprv_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("prv_aprv_emp_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setPrv_aprv_emp_no(prv_aprv_emp_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 07 17:50:48 KST 2018 */