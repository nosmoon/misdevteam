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


package chosun.ciis.hd.emsy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.emsy.ds.*;
import chosun.ciis.hd.emsy.rec.*;

/**
 * 
 */


public class HD_EMSY_2010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String saly_yy;
	public String saly_no;
	public String fr_emp_no;
	public String to_emp_no;

	public HD_EMSY_2010_LDM(){}
	public HD_EMSY_2010_LDM(String cmpy_cd, String saly_yy, String saly_no, String fr_emp_no, String to_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.saly_yy = saly_yy;
		this.saly_no = saly_no;
		this.fr_emp_no = fr_emp_no;
		this.to_emp_no = to_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setFr_emp_no(String fr_emp_no){
		this.fr_emp_no = fr_emp_no;
	}

	public void setTo_emp_no(String to_emp_no){
		this.to_emp_no = to_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getFr_emp_no(){
		return this.fr_emp_no;
	}

	public String getTo_emp_no(){
		return this.to_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EMSY_2010_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EMSY_2010_LDM dm = (HD_EMSY_2010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.saly_yy);
		cstmt.setString(5, dm.saly_no);
		cstmt.setString(6, dm.fr_emp_no);
		cstmt.setString(7, dm.to_emp_no);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.emsy.ds.HD_EMSY_2010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("saly_no = [" + getSaly_no() + "]");
		System.out.println("fr_emp_no = [" + getFr_emp_no() + "]");
		System.out.println("to_emp_no = [" + getTo_emp_no() + "]");
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
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String saly_no = req.getParameter("saly_no");
if( saly_no == null){
	System.out.println(this.toString+" : saly_no is null" );
}else{
	System.out.println(this.toString+" : saly_no is "+saly_no );
}
String fr_emp_no = req.getParameter("fr_emp_no");
if( fr_emp_no == null){
	System.out.println(this.toString+" : fr_emp_no is null" );
}else{
	System.out.println(this.toString+" : fr_emp_no is "+fr_emp_no );
}
String to_emp_no = req.getParameter("to_emp_no");
if( to_emp_no == null){
	System.out.println(this.toString+" : to_emp_no is null" );
}else{
	System.out.println(this.toString+" : to_emp_no is "+to_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String saly_no = Util.checkString(req.getParameter("saly_no"));
String fr_emp_no = Util.checkString(req.getParameter("fr_emp_no"));
String to_emp_no = Util.checkString(req.getParameter("to_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no")));
String fr_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_emp_no")));
String to_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("to_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSaly_yy(saly_yy);
dm.setSaly_no(saly_no);
dm.setFr_emp_no(fr_emp_no);
dm.setTo_emp_no(to_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 13:55:45 KST 2015 */