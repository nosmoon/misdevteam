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


package chosun.ciis.hd.card.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.card.ds.*;
import chosun.ciis.hd.card.rec.*;

/**
 * 
 */


public class HD_CARD_1000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String emp_no;
	public String cmpy_ck;
	public String nm_korn;
	public String open_invit_clsf;
	public String open_invit_desty;

	public HD_CARD_1000_LDM(){}
	public HD_CARD_1000_LDM(String cmpy_cd, String dept_cd, String emp_no, String cmpy_ck, String nm_korn, String open_invit_clsf, String open_invit_desty){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.emp_no = emp_no;
		this.cmpy_ck = cmpy_ck;
		this.nm_korn = nm_korn;
		this.open_invit_clsf = open_invit_clsf;
		this.open_invit_desty = open_invit_desty;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_ck(String cmpy_ck){
		this.cmpy_ck = cmpy_ck;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setOpen_invit_clsf(String open_invit_clsf){
		this.open_invit_clsf = open_invit_clsf;
	}

	public void setOpen_invit_desty(String open_invit_desty){
		this.open_invit_desty = open_invit_desty;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_ck(){
		return this.cmpy_ck;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getOpen_invit_clsf(){
		return this.open_invit_clsf;
	}

	public String getOpen_invit_desty(){
		return this.open_invit_desty;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_CARD_1000_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_CARD_1000_LDM dm = (HD_CARD_1000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.cmpy_ck);
		cstmt.setString(7, dm.nm_korn);
		cstmt.setString(8, dm.open_invit_clsf);
		cstmt.setString(9, dm.open_invit_desty);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.card.ds.HD_CARD_1000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("cmpy_ck = [" + getCmpy_ck() + "]");
		System.out.println("nm_korn = [" + getNm_korn() + "]");
		System.out.println("open_invit_clsf = [" + getOpen_invit_clsf() + "]");
		System.out.println("open_invit_desty = [" + getOpen_invit_desty() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String cmpy_ck = req.getParameter("cmpy_ck");
if( cmpy_ck == null){
	System.out.println(this.toString+" : cmpy_ck is null" );
}else{
	System.out.println(this.toString+" : cmpy_ck is "+cmpy_ck );
}
String nm_korn = req.getParameter("nm_korn");
if( nm_korn == null){
	System.out.println(this.toString+" : nm_korn is null" );
}else{
	System.out.println(this.toString+" : nm_korn is "+nm_korn );
}
String open_invit_clsf = req.getParameter("open_invit_clsf");
if( open_invit_clsf == null){
	System.out.println(this.toString+" : open_invit_clsf is null" );
}else{
	System.out.println(this.toString+" : open_invit_clsf is "+open_invit_clsf );
}
String open_invit_desty = req.getParameter("open_invit_desty");
if( open_invit_desty == null){
	System.out.println(this.toString+" : open_invit_desty is null" );
}else{
	System.out.println(this.toString+" : open_invit_desty is "+open_invit_desty );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String cmpy_ck = Util.checkString(req.getParameter("cmpy_ck"));
String nm_korn = Util.checkString(req.getParameter("nm_korn"));
String open_invit_clsf = Util.checkString(req.getParameter("open_invit_clsf"));
String open_invit_desty = Util.checkString(req.getParameter("open_invit_desty"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String cmpy_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_ck")));
String nm_korn = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_korn")));
String open_invit_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("open_invit_clsf")));
String open_invit_desty = Util.Uni2Ksc(Util.checkString(req.getParameter("open_invit_desty")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setEmp_no(emp_no);
dm.setCmpy_ck(cmpy_ck);
dm.setNm_korn(nm_korn);
dm.setOpen_invit_clsf(open_invit_clsf);
dm.setOpen_invit_desty(open_invit_desty);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 30 09:51:57 KST 2012 */