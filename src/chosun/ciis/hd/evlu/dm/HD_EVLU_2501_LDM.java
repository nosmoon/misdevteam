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


package chosun.ciis.hd.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.ds.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_2501_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String sel_pgm_id;

	public HD_EVLU_2501_LDM(){}
	public HD_EVLU_2501_LDM(String cmpy_cd, String evlu_yy, String tms_clsf, String sel_pgm_id){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.sel_pgm_id = sel_pgm_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setSel_pgm_id(String sel_pgm_id){
		this.sel_pgm_id = sel_pgm_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getSel_pgm_id(){
		return this.sel_pgm_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_2501_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_2501_LDM dm = (HD_EVLU_2501_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy);
		cstmt.setString(5, dm.tms_clsf);
		cstmt.setString(6, dm.sel_pgm_id);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_2501_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evlu_yy = [" + getEvlu_yy() + "]");
		System.out.println("tms_clsf = [" + getTms_clsf() + "]");
		System.out.println("sel_pgm_id = [" + getSel_pgm_id() + "]");
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
String evlu_yy = req.getParameter("evlu_yy");
if( evlu_yy == null){
	System.out.println(this.toString+" : evlu_yy is null" );
}else{
	System.out.println(this.toString+" : evlu_yy is "+evlu_yy );
}
String tms_clsf = req.getParameter("tms_clsf");
if( tms_clsf == null){
	System.out.println(this.toString+" : tms_clsf is null" );
}else{
	System.out.println(this.toString+" : tms_clsf is "+tms_clsf );
}
String sel_pgm_id = req.getParameter("sel_pgm_id");
if( sel_pgm_id == null){
	System.out.println(this.toString+" : sel_pgm_id is null" );
}else{
	System.out.println(this.toString+" : sel_pgm_id is "+sel_pgm_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String sel_pgm_id = Util.checkString(req.getParameter("sel_pgm_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String sel_pgm_id = Util.Uni2Ksc(Util.checkString(req.getParameter("sel_pgm_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setSel_pgm_id(sel_pgm_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 16:14:44 KST 2015 */