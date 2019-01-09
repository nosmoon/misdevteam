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


public class MT_SUBMATROUT_2200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mov_dt_ft;
	public String mov_dt_to;
	public String fac_clsf_in;
	public String fac_clsf_out;

	public MT_SUBMATROUT_2200_LDM(){}
	public MT_SUBMATROUT_2200_LDM(String cmpy_cd, String mov_dt_ft, String mov_dt_to, String fac_clsf_in, String fac_clsf_out){
		this.cmpy_cd = cmpy_cd;
		this.mov_dt_ft = mov_dt_ft;
		this.mov_dt_to = mov_dt_to;
		this.fac_clsf_in = fac_clsf_in;
		this.fac_clsf_out = fac_clsf_out;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMov_dt_ft(String mov_dt_ft){
		this.mov_dt_ft = mov_dt_ft;
	}

	public void setMov_dt_to(String mov_dt_to){
		this.mov_dt_to = mov_dt_to;
	}

	public void setFac_clsf_in(String fac_clsf_in){
		this.fac_clsf_in = fac_clsf_in;
	}

	public void setFac_clsf_out(String fac_clsf_out){
		this.fac_clsf_out = fac_clsf_out;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMov_dt_ft(){
		return this.mov_dt_ft;
	}

	public String getMov_dt_to(){
		return this.mov_dt_to;
	}

	public String getFac_clsf_in(){
		return this.fac_clsf_in;
	}

	public String getFac_clsf_out(){
		return this.fac_clsf_out;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_2200_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_2200_LDM dm = (MT_SUBMATROUT_2200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mov_dt_ft);
		cstmt.setString(5, dm.mov_dt_to);
		cstmt.setString(6, dm.fac_clsf_in);
		cstmt.setString(7, dm.fac_clsf_out);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_2200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mov_dt_ft = [" + getMov_dt_ft() + "]");
		System.out.println("mov_dt_to = [" + getMov_dt_to() + "]");
		System.out.println("fac_clsf_in = [" + getFac_clsf_in() + "]");
		System.out.println("fac_clsf_out = [" + getFac_clsf_out() + "]");
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
String mov_dt_ft = req.getParameter("mov_dt_ft");
if( mov_dt_ft == null){
	System.out.println(this.toString+" : mov_dt_ft is null" );
}else{
	System.out.println(this.toString+" : mov_dt_ft is "+mov_dt_ft );
}
String mov_dt_to = req.getParameter("mov_dt_to");
if( mov_dt_to == null){
	System.out.println(this.toString+" : mov_dt_to is null" );
}else{
	System.out.println(this.toString+" : mov_dt_to is "+mov_dt_to );
}
String fac_clsf_in = req.getParameter("fac_clsf_in");
if( fac_clsf_in == null){
	System.out.println(this.toString+" : fac_clsf_in is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_in is "+fac_clsf_in );
}
String fac_clsf_out = req.getParameter("fac_clsf_out");
if( fac_clsf_out == null){
	System.out.println(this.toString+" : fac_clsf_out is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_out is "+fac_clsf_out );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mov_dt_ft = Util.checkString(req.getParameter("mov_dt_ft"));
String mov_dt_to = Util.checkString(req.getParameter("mov_dt_to"));
String fac_clsf_in = Util.checkString(req.getParameter("fac_clsf_in"));
String fac_clsf_out = Util.checkString(req.getParameter("fac_clsf_out"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mov_dt_ft = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_dt_ft")));
String mov_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_dt_to")));
String fac_clsf_in = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_in")));
String fac_clsf_out = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_out")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMov_dt_ft(mov_dt_ft);
dm.setMov_dt_to(mov_dt_to);
dm.setFac_clsf_in(fac_clsf_in);
dm.setFac_clsf_out(fac_clsf_out);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Mar 28 16:50:29 KST 2009 */