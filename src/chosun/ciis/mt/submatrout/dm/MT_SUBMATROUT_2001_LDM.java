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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_2001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mov_inout_dt_fr;
	public String mov_inout_dt_to;
	public String mov_in_fac_cd;
	public String mov_out_fac_cd;

	public MT_SUBMATROUT_2001_LDM(){}
	public MT_SUBMATROUT_2001_LDM(String cmpy_cd, String mov_inout_dt_fr, String mov_inout_dt_to, String mov_in_fac_cd, String mov_out_fac_cd){
		this.cmpy_cd = cmpy_cd;
		this.mov_inout_dt_fr = mov_inout_dt_fr;
		this.mov_inout_dt_to = mov_inout_dt_to;
		this.mov_in_fac_cd = mov_in_fac_cd;
		this.mov_out_fac_cd = mov_out_fac_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMov_inout_dt_fr(String mov_inout_dt_fr){
		this.mov_inout_dt_fr = mov_inout_dt_fr;
	}

	public void setMov_inout_dt_to(String mov_inout_dt_to){
		this.mov_inout_dt_to = mov_inout_dt_to;
	}

	public void setMov_in_fac_cd(String mov_in_fac_cd){
		this.mov_in_fac_cd = mov_in_fac_cd;
	}

	public void setMov_out_fac_cd(String mov_out_fac_cd){
		this.mov_out_fac_cd = mov_out_fac_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMov_inout_dt_fr(){
		return this.mov_inout_dt_fr;
	}

	public String getMov_inout_dt_to(){
		return this.mov_inout_dt_to;
	}

	public String getMov_in_fac_cd(){
		return this.mov_in_fac_cd;
	}

	public String getMov_out_fac_cd(){
		return this.mov_out_fac_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_2001_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_2001_LDM dm = (MT_SUBMATROUT_2001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mov_inout_dt_fr);
		cstmt.setString(5, dm.mov_inout_dt_to);
		cstmt.setString(6, dm.mov_in_fac_cd);
		cstmt.setString(7, dm.mov_out_fac_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_2001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mov_inout_dt_fr = [" + getMov_inout_dt_fr() + "]");
		System.out.println("mov_inout_dt_to = [" + getMov_inout_dt_to() + "]");
		System.out.println("mov_in_fac_cd = [" + getMov_in_fac_cd() + "]");
		System.out.println("mov_out_fac_cd = [" + getMov_out_fac_cd() + "]");
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
String mov_inout_dt_fr = req.getParameter("mov_inout_dt_fr");
if( mov_inout_dt_fr == null){
	System.out.println(this.toString+" : mov_inout_dt_fr is null" );
}else{
	System.out.println(this.toString+" : mov_inout_dt_fr is "+mov_inout_dt_fr );
}
String mov_inout_dt_to = req.getParameter("mov_inout_dt_to");
if( mov_inout_dt_to == null){
	System.out.println(this.toString+" : mov_inout_dt_to is null" );
}else{
	System.out.println(this.toString+" : mov_inout_dt_to is "+mov_inout_dt_to );
}
String mov_in_fac_cd = req.getParameter("mov_in_fac_cd");
if( mov_in_fac_cd == null){
	System.out.println(this.toString+" : mov_in_fac_cd is null" );
}else{
	System.out.println(this.toString+" : mov_in_fac_cd is "+mov_in_fac_cd );
}
String mov_out_fac_cd = req.getParameter("mov_out_fac_cd");
if( mov_out_fac_cd == null){
	System.out.println(this.toString+" : mov_out_fac_cd is null" );
}else{
	System.out.println(this.toString+" : mov_out_fac_cd is "+mov_out_fac_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mov_inout_dt_fr = Util.checkString(req.getParameter("mov_inout_dt_fr"));
String mov_inout_dt_to = Util.checkString(req.getParameter("mov_inout_dt_to"));
String mov_in_fac_cd = Util.checkString(req.getParameter("mov_in_fac_cd"));
String mov_out_fac_cd = Util.checkString(req.getParameter("mov_out_fac_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mov_inout_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_inout_dt_fr")));
String mov_inout_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_inout_dt_to")));
String mov_in_fac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_in_fac_cd")));
String mov_out_fac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_out_fac_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMov_inout_dt_fr(mov_inout_dt_fr);
dm.setMov_inout_dt_to(mov_inout_dt_to);
dm.setMov_in_fac_cd(mov_in_fac_cd);
dm.setMov_out_fac_cd(mov_out_fac_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 16:19:06 KST 2009 */