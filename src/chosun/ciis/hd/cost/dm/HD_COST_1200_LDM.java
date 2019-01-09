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


package chosun.ciis.hd.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.ds.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String corp_card_clsf;
	public String emp_no;
	public String hd_card_type;

	public HD_COST_1200_LDM(){}
	public HD_COST_1200_LDM(String cmpy_cd, String corp_card_clsf, String emp_no, String hd_card_type){
		this.cmpy_cd = cmpy_cd;
		this.corp_card_clsf = corp_card_clsf;
		this.emp_no = emp_no;
		this.hd_card_type = hd_card_type;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCorp_card_clsf(String corp_card_clsf){
		this.corp_card_clsf = corp_card_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setHd_card_type(String hd_card_type){
		this.hd_card_type = hd_card_type;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCorp_card_clsf(){
		return this.corp_card_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getHd_card_type(){
		return this.hd_card_type;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_1200_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_1200_LDM dm = (HD_COST_1200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.corp_card_clsf);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.hd_card_type);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_1200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("corp_card_clsf = [" + getCorp_card_clsf() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("hd_card_type = [" + getHd_card_type() + "]");
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
String corp_card_clsf = req.getParameter("corp_card_clsf");
if( corp_card_clsf == null){
	System.out.println(this.toString+" : corp_card_clsf is null" );
}else{
	System.out.println(this.toString+" : corp_card_clsf is "+corp_card_clsf );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String hd_card_type = req.getParameter("hd_card_type");
if( hd_card_type == null){
	System.out.println(this.toString+" : hd_card_type is null" );
}else{
	System.out.println(this.toString+" : hd_card_type is "+hd_card_type );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String corp_card_clsf = Util.checkString(req.getParameter("corp_card_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String hd_card_type = Util.checkString(req.getParameter("hd_card_type"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String corp_card_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_card_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String hd_card_type = Util.Uni2Ksc(Util.checkString(req.getParameter("hd_card_type")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCorp_card_clsf(corp_card_clsf);
dm.setEmp_no(emp_no);
dm.setHd_card_type(hd_card_type);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 20 15:29:59 KST 2009 */