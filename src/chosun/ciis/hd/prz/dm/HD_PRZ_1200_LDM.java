
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


package chosun.ciis.hd.prz.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prz.ds.*;
import chosun.ciis.hd.prz.rec.*;

/**
 * 
 */


public class HD_PRZ_1200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String prz_dt_fm;
	public String prz_dt_to;

	public HD_PRZ_1200_LDM(){}
	public HD_PRZ_1200_LDM(String cmpy_cd, String emp_no, String flnm, String prz_dt_fm, String prz_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.prz_dt_fm = prz_dt_fm;
		this.prz_dt_to = prz_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrz_dt_fm(String prz_dt_fm){
		this.prz_dt_fm = prz_dt_fm;
	}

	public void setPrz_dt_to(String prz_dt_to){
		this.prz_dt_to = prz_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrz_dt_fm(){
		return this.prz_dt_fm;
	}

	public String getPrz_dt_to(){
		return this.prz_dt_to;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRZ_1200_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRZ_1200_LDM dm = (HD_PRZ_1200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.flnm);
		cstmt.setString(6, dm.prz_dt_fm);
		cstmt.setString(7, dm.prz_dt_to);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prz.ds.HD_PRZ_1200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("prz_dt_fm = [" + getPrz_dt_fm() + "]");
		System.out.println("prz_dt_to = [" + getPrz_dt_to() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String prz_dt_fm = req.getParameter("prz_dt_fm");
if( prz_dt_fm == null){
	System.out.println(this.toString+" : prz_dt_fm is null" );
}else{
	System.out.println(this.toString+" : prz_dt_fm is "+prz_dt_fm );
}
String prz_dt_to = req.getParameter("prz_dt_to");
if( prz_dt_to == null){
	System.out.println(this.toString+" : prz_dt_to is null" );
}else{
	System.out.println(this.toString+" : prz_dt_to is "+prz_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String prz_dt_fm = Util.checkString(req.getParameter("prz_dt_fm"));
String prz_dt_to = Util.checkString(req.getParameter("prz_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String prz_dt_fm = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_dt_fm")));
String prz_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setPrz_dt_fm(prz_dt_fm);
dm.setPrz_dt_to(prz_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 15:18:20 KST 2009 */