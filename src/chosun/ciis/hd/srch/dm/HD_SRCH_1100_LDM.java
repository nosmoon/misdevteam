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


package chosun.ciis.hd.srch.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.srch.ds.*;
import chosun.ciis.hd.srch.rec.*;

/**
 * 
 */


public class HD_SRCH_1100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String open_invit_clsf;
	public String open_invit_desty_min;
	public String open_invit_desty_max;
	public String dept_cd;

	public HD_SRCH_1100_LDM(){}
	public HD_SRCH_1100_LDM(String cmpy_cd, String open_invit_clsf, String open_invit_desty_min, String open_invit_desty_max, String dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.open_invit_clsf = open_invit_clsf;
		this.open_invit_desty_min = open_invit_desty_min;
		this.open_invit_desty_max = open_invit_desty_max;
		this.dept_cd = dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOpen_invit_clsf(String open_invit_clsf){
		this.open_invit_clsf = open_invit_clsf;
	}

	public void setOpen_invit_desty_min(String open_invit_desty_min){
		this.open_invit_desty_min = open_invit_desty_min;
	}

	public void setOpen_invit_desty_max(String open_invit_desty_max){
		this.open_invit_desty_max = open_invit_desty_max;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOpen_invit_clsf(){
		return this.open_invit_clsf;
	}

	public String getOpen_invit_desty_min(){
		return this.open_invit_desty_min;
	}

	public String getOpen_invit_desty_max(){
		return this.open_invit_desty_max;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SRCH_1100_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SRCH_1100_LDM dm = (HD_SRCH_1100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.open_invit_clsf);
		cstmt.setString(5, dm.open_invit_desty_min);
		cstmt.setString(6, dm.open_invit_desty_max);
		cstmt.setString(7, dm.dept_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.srch.ds.HD_SRCH_1100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("open_invit_clsf = [" + getOpen_invit_clsf() + "]");
		System.out.println("open_invit_desty_min = [" + getOpen_invit_desty_min() + "]");
		System.out.println("open_invit_desty_max = [" + getOpen_invit_desty_max() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
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
String open_invit_clsf = req.getParameter("open_invit_clsf");
if( open_invit_clsf == null){
	System.out.println(this.toString+" : open_invit_clsf is null" );
}else{
	System.out.println(this.toString+" : open_invit_clsf is "+open_invit_clsf );
}
String open_invit_desty_min = req.getParameter("open_invit_desty_min");
if( open_invit_desty_min == null){
	System.out.println(this.toString+" : open_invit_desty_min is null" );
}else{
	System.out.println(this.toString+" : open_invit_desty_min is "+open_invit_desty_min );
}
String open_invit_desty_max = req.getParameter("open_invit_desty_max");
if( open_invit_desty_max == null){
	System.out.println(this.toString+" : open_invit_desty_max is null" );
}else{
	System.out.println(this.toString+" : open_invit_desty_max is "+open_invit_desty_max );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String open_invit_clsf = Util.checkString(req.getParameter("open_invit_clsf"));
String open_invit_desty_min = Util.checkString(req.getParameter("open_invit_desty_min"));
String open_invit_desty_max = Util.checkString(req.getParameter("open_invit_desty_max"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String open_invit_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("open_invit_clsf")));
String open_invit_desty_min = Util.Uni2Ksc(Util.checkString(req.getParameter("open_invit_desty_min")));
String open_invit_desty_max = Util.Uni2Ksc(Util.checkString(req.getParameter("open_invit_desty_max")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOpen_invit_clsf(open_invit_clsf);
dm.setOpen_invit_desty_min(open_invit_desty_min);
dm.setOpen_invit_desty_max(open_invit_desty_max);
dm.setDept_cd(dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 09:10:36 KST 2009 */