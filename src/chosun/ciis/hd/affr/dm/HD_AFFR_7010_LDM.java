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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_7010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String st_issu_dt;
	public String et_issu_dt;
	public String certi_clsf;
	public String certi_clsf_ck;

	public HD_AFFR_7010_LDM(){}
	public HD_AFFR_7010_LDM(String cmpy_cd, String st_issu_dt, String et_issu_dt, String certi_clsf, String certi_clsf_ck){
		this.cmpy_cd = cmpy_cd;
		this.st_issu_dt = st_issu_dt;
		this.et_issu_dt = et_issu_dt;
		this.certi_clsf = certi_clsf;
		this.certi_clsf_ck = certi_clsf_ck;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSt_issu_dt(String st_issu_dt){
		this.st_issu_dt = st_issu_dt;
	}

	public void setEt_issu_dt(String et_issu_dt){
		this.et_issu_dt = et_issu_dt;
	}

	public void setCerti_clsf(String certi_clsf){
		this.certi_clsf = certi_clsf;
	}

	public void setCerti_clsf_ck(String certi_clsf_ck){
		this.certi_clsf_ck = certi_clsf_ck;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSt_issu_dt(){
		return this.st_issu_dt;
	}

	public String getEt_issu_dt(){
		return this.et_issu_dt;
	}

	public String getCerti_clsf(){
		return this.certi_clsf;
	}

	public String getCerti_clsf_ck(){
		return this.certi_clsf_ck;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_7010_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_7010_LDM dm = (HD_AFFR_7010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.st_issu_dt);
		cstmt.setString(5, dm.et_issu_dt);
		cstmt.setString(6, dm.certi_clsf);
		cstmt.setString(7, dm.certi_clsf_ck);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_7010_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("st_issu_dt = " + getSt_issu_dt());
        System.out.println("et_issu_dt = " + getEt_issu_dt());
        System.out.println("certi_clsf = " + getCerti_clsf());
        System.out.println("certi_clsf_ck = " + getCerti_clsf_ck());
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
String st_issu_dt = req.getParameter("st_issu_dt");
if( st_issu_dt == null){
	System.out.println(this.toString+" : st_issu_dt is null" );
}else{
	System.out.println(this.toString+" : st_issu_dt is "+st_issu_dt );
}
String et_issu_dt = req.getParameter("et_issu_dt");
if( et_issu_dt == null){
	System.out.println(this.toString+" : et_issu_dt is null" );
}else{
	System.out.println(this.toString+" : et_issu_dt is "+et_issu_dt );
}
String certi_clsf = req.getParameter("certi_clsf");
if( certi_clsf == null){
	System.out.println(this.toString+" : certi_clsf is null" );
}else{
	System.out.println(this.toString+" : certi_clsf is "+certi_clsf );
}
String certi_clsf_ck = req.getParameter("certi_clsf_ck");
if( certi_clsf_ck == null){
	System.out.println(this.toString+" : certi_clsf_ck is null" );
}else{
	System.out.println(this.toString+" : certi_clsf_ck is "+certi_clsf_ck );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String st_issu_dt = Util.checkString(req.getParameter("st_issu_dt"));
String et_issu_dt = Util.checkString(req.getParameter("et_issu_dt"));
String certi_clsf = Util.checkString(req.getParameter("certi_clsf"));
String certi_clsf_ck = Util.checkString(req.getParameter("certi_clsf_ck"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String st_issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_issu_dt")));
String et_issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("et_issu_dt")));
String certi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("certi_clsf")));
String certi_clsf_ck = Util.Uni2Ksc(Util.checkString(req.getParameter("certi_clsf_ck")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSt_issu_dt(st_issu_dt);
dm.setEt_issu_dt(et_issu_dt);
dm.setCerti_clsf(certi_clsf);
dm.setCerti_clsf_ck(certi_clsf_ck);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 18:39:36 KST 2009 */